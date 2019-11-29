// named fun
function sumOfArr()
{
    var arr = [10,20,30,40,50];
    var i;
    var sum = 0;
    for(i=0;i<arr.length;i++)
    {
sum = sum + arr[i]
    }
    console.log('sum =',sum);
}
sumOfArr()

// exp fun
var sun = function()
{
    var arr = [10,25,30,40,50];
    var i;
    var sum = 0;
    for(i=0;i<arr.length;i++)
    {
sum = sum + arr[i]
    }
    console.log('sum =',sum);
}
sun();

// self invoking 

(
    function()
    {
        var arr = [10,20,30,40,50];
        var i;
        var sum = 0;
        for(i=0;i<arr.length;i++)
        {
    sum = sum + arr[i]
        }
        console.log('sum =',sum);
    }
)()



// fat arr fun

var fat = () =>
{
    var arr = [10,20,30,80,50];
    var i;
    var sum = 0;
    for(i=0;i<arr.length;i++)
    {
      sum = sum + arr[i]
    }
    console.log('sum =',sum);
}
fat();































