// for loop arrays and strings , Biderctional , consider empty elements,break support
var fact = ['horlicks','mother horlicks','womens horlicks']
for(var i=0;i<fact.length;i++)
{
    console.log(fact[i]);
}

// far of loop only for arrays , consider empty elements,break support
var fact = ['horlicks','mother horlicks','womens horlicks']
for(var ele of fact)
{
    console.log('value',ele);
}

// for in loop arrays and obj,break support,with out index consider
var fact = ['horlicks','mother horlicks','womens horlicks']
for(var val in fact)
{
    console.log('index=',fact[val]);
}
// for in loop
var person = {
name : 'karthik',
age:'21',
emp:'UST'
}
for(var KEY in person){
    console.log('FRIN=',person[KEY]);
}

// FOR EACH METHOD ONLY FOR ARRAYS ,no break statement
var movies = ['vijay','krish','arjun','sanvi']
movies.forEach(function(value,index)
{
    console.log('movie =',value);
    console.log('movie =',index);

});

console.log('===========================================================');

var items = [{
    item:'bike',
    id:'pulsar',
    cost:100000},{
        item:'bike2',
    id:'royal',
    cost:1000000},{
        item:'bike3',
    id:'FZ',
    cost:100000},{
        item:'bike4',
    id:'R15',
     cost:100000}

    ]
    items.forEach(function(value,index)
    {
        console.log('bike  =',value);
        console.log('id =',index);
    
    })





















