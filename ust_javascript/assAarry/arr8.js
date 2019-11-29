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
const h1 = Array.isArray(hotdrinks);
console.log('check isit array or not =',h1) 
console.log('========================')
const h3 =  hotdrinks.push({
    name : 'Bira 69',
    id : 2,
    cost : 440
})
console.log('push the elements =',h3 );
console.log('========================')
// console.log('remove elements at last =',horlicks.pop());
// console.log('========================')
console.log('added elements at starting =',hotdrinks.unshift({
    name : 'tuborg',
    id : 2,
    cost : 500
}))
console.log(hotdrinks)
console.log('========================')
console.log('removed eements at starting = ',hotdrinks.shift());
console.log('========================')
console.log('splice the elements =',hotdrinks.splice(1,1,{
    name : 'tuborg',
    id : 2,
    cost : 500
}));
console.log('========================')
console.log('slice the elements',hotdrinks.slice(2,3)) 
console.log('========================')
console.log('array to string ', hotdrinks.join("=="));
console.log('========================')
const Horlicks = hotdrinks.map(hotdrinks=>hotdrinks);
console.log(Horlicks)
console.log('========================')
console.log(Horlicks.indexOf({
    name : 'Bira 69',
    id : 2,
    cost : 440
},1))
  console.log('==============================================')  
const Horrlicks = Horlicks.filter((v,i)=> v.length>4)
console.log(Horrlicks)
console.log(hotdrinks)
console.log('================================eg8============================')