var horlicks = ['mother horlick','jr horlicks','womens horlicks']
console.log('========================')
const h1 = Array.isArray(horlicks);
console.log('check isit array or not =',h1) 
console.log('========================')
const h2= horlicks.includes('apple',1);
console.log('present r not =',h2)
console.log('========================')
const h3 =  horlicks.push('kiwi horlicks','pineapple horlicks')
console.log('push the elements =',h3 );
console.log('========================')
console.log('remove elements at last =',horlicks.pop());
console.log('========================')
console.log('added elements at starting =',horlicks.unshift('grapes','papaya'))
console.log(horlicks)
console.log('========================')
console.log('removed eements at starting = ',horlicks.shift());
console.log('========================')
console.log('splice the elements =',horlicks.splice(1,2,' grapes horlicks','badam horlicks'));
console.log('========================')
console.log('slice the elements',horlicks.slice(1,3)) 
console.log('========================')
console.log('array to string ', horlicks.join("&"));
console.log('========================')
const Horlicks = horlicks.map(horlicks=>horlicks);
console.log(Horlicks)
console.log('========================')
console.log(horlicks.indexOf('pineapple horlicks',1))
  console.log('==============================================')  
const Horrlicks = Horlicks.filter((v,i)=> v.length>4)
console.log(Horrlicks)
console.log(horlicks)
console.log('================================eg1============================')
/*var milkprts = ['heritage','milkmist','arogya','venla']
var cakes = ['chocos','coolCake','mangomix','plainCake']
var cooldrinks = ['red bull','cococal','7up','limca']
var hotdrinks = [{
    name : 'kingfisher',
    id : 2,
    cost : 300},{
        name : 'carlsberg',
        id : 2,
        cost : 350
    },{
        name : 'tuborg',
        id : 2,
        cost : 500
    },{
        name : 'Bira 91',
        id : 2,
        cost : 440
    }

]
var icecreams = ['venlla','milkshake','kulfi','choc ice','blue bell']
var phones =['mi phone','iphone','htc','moto','samsung']
var laptops =[{
    name : Lenovo,
     id : 1,
    price : 50000},{

    name : Dell,
    id : 1,
    price : 54000},{

    name : Hp,
    id : 1,
    price : 45000  
}]
var singers = ['Sidsriram','Kathik','Yuvan','Illeyaraja','AR Rehaman']
var movies = ['ArjunReddy','Googley','Jilla','Shape of Water','Kesari']*/