
var fact = ['horlicks','mother horlicks','womens horlicks']
for(var val in fact)
{
    console.log('index=',fact[val]);
    break;
}

var fact = ['horlicks','mother horlicks','womens horlicks']
if(1)
{
    console.log('val =',fact);
    break;
    // throws error
    
}

var ele = function(num1,num2){
    console.log('sum =',num1+num2);
    // throws error
    // break;
}
ele(10,20);