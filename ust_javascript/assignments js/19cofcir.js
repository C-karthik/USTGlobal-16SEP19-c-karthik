// named fun
function cofcirl(r)
{
    var r;
    var area = 2*3.14*r;
    console.log("area of circle",area);
}cofcirl(4);

// fun exp

var circle = function(r)
{
    
        var r;
        var area = 2*3.14*r;
        console.log("area of circle",area);
}
circle(6);

// self invoking fun

(
    function(r)
    {
        
            var r;
            var area = 2*3.14*r;
            console.log("area of circle",area);
    }
)(4);

//  fat arrow fun

var circum = r =>
{
    
        var r;
        var area = 2*3.14*r;
        console.log("area of circle",area);
}
circum(7);






