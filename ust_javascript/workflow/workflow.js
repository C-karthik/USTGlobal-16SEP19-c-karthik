// callback function:passing one fun as parameter into another fun is called cbf.

function first(callback){
    setTimeout(function(){
        console.log('1st exicuted');
         callback();
    },0)
     
    console.log('exicuted');
}
function second(){
    console.log('2nd exicuted')
}
first(second)
// second()
