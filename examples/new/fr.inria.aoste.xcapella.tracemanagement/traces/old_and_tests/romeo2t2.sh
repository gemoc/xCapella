#!/bin/sh



translate(){

    while read timing; read clock
    do
        echo -n $timing | sed -e 's/\[.*, \(.*\)\]/\1;/' >> $1
        echo $clock >>$1
    done

}

isInArray(){
    toLookFor=$1
    shift
    a=($*)
    if printf '%s\0' "${a[@]}" | grep -Fqxz $toLookFor
    then
        return 1
    else
        return 0
    fi
}

header(){
    read timing; read clock
    i=1
    allClocks=($clock)
    while read timing; read clock
    do
        isInArray $clock ${allClocks[@]}
        if [[ $? -eq 0 ]]
        then
           allClocks[$i]=$clock
           i=`expr $i + 1`
        fi
    done
    echo ${allClocks[@]}

}




inputFile=$1
outputFile=$1'.translate.txt'

header < $inputFile | sed -e 's/\ /;/g' > $outputFile
echo '-----------' >> $outputFile
translate $outputFile < $inputFile
