// named function

function fib()
{
    var i,a=0,b=1;
    for(i = 0; i<10;i++)
    { console.log(a)
        var c = a+b;
             a = b;
              b=c;
    }
}
fib();

// expreesed fun
var fiba = function()
{
    var i,a=0,b=1;
    
    for(i = 0; i<5;i++)
    {
        console.log(a)
        var c = a+b;
             a = b;
              b=c;
    }
}
fiba();

// self invoked function
(
    function(){
        var i,a=0,b=1;
    
        for(i = 0; i<10;i++)
        {
            
           
            console.log(a)
            var c = a+b;
                 a = b;
                  b=c;
        }
    }
)()

// fat arrow function

var fib = n =>{
    var i,a=0,b=1;
    
    for(i = 0; i<n;i++)
    {
        
       
        console.log(a)
        var c = a+b;
             a = b;
              b=c;
    }
}
fib(15)

































