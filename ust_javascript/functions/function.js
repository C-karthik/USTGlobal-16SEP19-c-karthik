// Named function
function add(num1,num2)

{
    console.log('sum =',num1+num2);
    
}
add(20,20)

// no method overloding so give difernt name for different 
// function add(num1,num2)

// {
    // console.log('sum =',num1-num2);
    
// }
// add(10,20)


function sub(num3,num4)
{
    console.log('sub =',num3-num4);
}
sub(20,10)


// function expression (anamonous)

// console.log('result =',sum(10,20)); must declare first

var sum = function(num1,num2)
{
    return num1+num2
}
// var res = sum(10,20);
console.log('result =',sum(10,20));

// SELF INVOKE Function(IIFE(IMMEDIATELY INVOKE FUN EXP))



(
    function(num1,num2)
    {
        console.log('sum =',num1+num2)
    }
)(10,20)


// FAT FUNCTION 

var plus=(num1,num2)=>{
    console.log('plus =',num1+num2);
}
plus(10,40)

// in named  function can call first and declared

generate('karthik');
function generate(msg)
{
    console.log('hi' + msg);
}



// function expression


generat('karthik');
var res = function(msg)
{
    console.log('hi' + msg);

}

// flat arrow function

show('bye');

var show = msg =>{

console.log('hi',msg);
}





























