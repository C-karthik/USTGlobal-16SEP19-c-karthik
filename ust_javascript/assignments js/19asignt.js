// named function

function fact(n)
{
    var fact = 1;
    while(n>0)
    {
      fact = fact*n;
        n--;
    }
    console.log('factorial of n =',fact)
}
fact(5);

// function expression/anamonous

var fac = function(n)
{
var f=1
while(n>0)
{
    f = f*n
    n--
}
console.log('fact =',f)
}
fac(6); 

// should keep semicolon

// self invoked function 


(
  function(n)
  {
    var fact = 1
    while(n>0)
    {
      fact = fact*n;
      n--;
    }
    console.log('fact =',fact);
  }
)(7);


// fat arrow function


var fact = (n ) =>
{
  var fact = 1
  while(n>0)
  {
    fact =fact *n
    n--
  }
  console.log('fact =', fact);
}
  
fact(4)


































