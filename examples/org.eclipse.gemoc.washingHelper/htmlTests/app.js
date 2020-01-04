const express = require('express')
const app = express()
const path = require('path');
const router = express.Router();

app.get('/',function(req,res){
    res.sendFile(path.join(__dirname+'/washingMachine.html'));
})

app.get('/washingStyle.css', function(req, res) {
  res.sendFile(__dirname + "/washingStyle.css");
});

app.get('/picts/sock.png', function(req, res) {
  res.sendFile(__dirname + "/picts/sock.png");
});

app.get('/picts/Laundry_symbol_wash_30_delicate.png', function(req, res) {
  res.sendFile(__dirname + "/picts/Laundry_symbol_wash_30_delicate.png");
});

app.get('/picts/Waschen_50.svg', function(req, res) {
  res.sendFile(__dirname + "/picts/Waschen_50.svg");
});

app.get('/picts/steadySocks.png', function(req, res) {
  res.sendFile(__dirname + "/picts/steadySocks.png");
});

//add the router
// app.use('/', router);
app.listen(process.env.port || 3000);

console.log('Running at Port 3000');
