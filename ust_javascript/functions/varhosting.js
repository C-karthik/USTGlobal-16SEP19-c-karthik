// error
console.log(host);
var host;
// only dec no def
console.log(host);
var host = 10;
// fun
function hosting(){
    console.log(host);
    var host;    
}hosting();
// var hosting(rising)
function hosting(){
    var host
    console.log(host);
    // wont intilized
     host = 10;    
}hosting();
