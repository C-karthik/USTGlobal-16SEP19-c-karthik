// named function
function prime(n)
{
    var i ;
if(n>=2)
    for(i=2;i<n;i++)

    {
      if(n%i==0)
      {
       console.log('not prime num ')
        return
      }
    }
    console.log('prime')
}prime(8)

// fun exp
var prm = function(n)
{
    var i ;
    if(n>=2)
    {
        for(i=2;i<n;i++)
    
        {
          if(n%i==0)
          {
           console.log('not prime num ')
            return
          }
        }
        console.log('prime')
    
    }

}
        prm(7);

// self invoking fun

(
    function(n)
    {
        var i ;
        if(n>=2)
            for(i=2;i<n;i++)
        
            {
              if(n%i==0)
              {
               console.log('not prime num ')
                return
              }
            }
            console.log('prime')
    }
)(9)

// fat arw fun

var prim = n =>
{
    var i ;
    if(n>=2)
    {
        for(i=2;i<n;i++)
    
        {
          if(n%i==0)
          {
           console.log('not prime num ')
            return
          }
        }
            console.log('prime')
    }
}
prim(11)













































