#!/bin/sh



rawFiltering(){
    while read line
    do
        if echo $line | grep -q "label"
        then
            echo $line
        fi
        if echo $line | grep -q "start"
        then
            echo $line
        fi
        if echo $line | grep -q "stop"
        then
            echo $line
        fi
    done
}

format(){
    while read label; read start; read stop
    do
        formattedLabel=$(echo $label |sed -e 's/.*: \"\(.*\)_.*/\1/')
        allLabels="$allLabels;$formattedLabel"
        starttimestamp=$(echo $start |sed -e 's/.*: \"\(.*\) us.*/\1/')
        stoptimestamp=$(echo $stop |sed -e 's/.*: \"\(.*\)\..*/\1/')
        echo "$starttimestamp;$formattedLabel _STARTED"
        echo "$stoptimestamp;$formattedLabel _TERMINATED"
    done
    echo '##########'
    echo $allLabels
}

rename(){
    sed -e 's/P /T2/' |
    sed -e 's/TPP /T5/' |
    sed -e 's/CC /T7/' |
    sed -e 's/TC0 /T6/' |
    sed -e 's/TC1 /T6/' |
    sed -e 's/TC2 /T6/'
    
}

formatLabel(){
    sed -e 's/TPP;/T5_STARTED;T5_TERMINATED;/g' |
    sed -e 's/CC;/T7_STARTED;T7_TERMINATED;/g' |
    sed -e 's/TC1;/T6_STARTED;T6_TERMINATED;/g' |
    sed -e 's/TC2;//g'|
    sed -e 's/TC0;//g'|
    sed -e 's/;P;/;T2_STARTED;T2_TERMINATED;/g'|
    xargs -n1 | sort -u | xargs
}

adaptTime(){
    while read line
    do if $(echo $line | grep -q "##########")
        then
         return
        fi
        time=$(echo $line | cut -d';' -f1)
        roundTime=$(echo $time | sed -e 's/\(.*\)\..*/\1/')
        clock=$(echo $line | cut -d';' -f2)
        msTime=$(($roundTime / 1000))
        echo "$msTime;$clock"
    done
}


rawFiltering < $1 > $1.temp
format < $1.temp | rename >$1.temp2
allLabels=$(tail -n 1 $1.temp2 | formatLabel)
echo $allLabels
adaptTime <$1.temp2 | sort -n > $1.translated.txt
# rm $1.temp
# rm $1.temp2
