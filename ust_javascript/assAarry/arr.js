const fruits = ['mango','banana','guava','apple']
console.log(typeof fruits);

// methods
console.log('========================')
const fruits1 = Array.isArray(fruits);
console.log('check isit array or not =',fruits1) 
console.log('========================')
const fruit1 = fruits.includes('apple',1);
console.log('present r not =',fruit1)
console.log('========================')
const fruits2 =  fruits.push('kiwi','pineapple')
console.log('push the elements =',fruits2 );
console.log('========================')
console.log('remove elements at last =',fruits.pop());
console.log('========================')
console.log('added elements at starting =',fruits.unshift('grapes','papaya'))
console.log(fruits)
console.log('========================')
console.log('removed eements at starting = ',fruits.shift());
console.log('========================')
console.log('splice the elements =',fruits.splice(1,2,'green grapes','black grapes'));
console.log('========================')
console.log('slice the elements',fruits.slice(1,3)) 
console.log('========================')
console.log('array to string ', fruits.join("&"));
console.log('========================')
const fruity = fruits.map(fruits=>fruits);
console.log(fruity)
console.log('========================')
const fruy = fruits.filter(function(value,index){
    if(fruits[index].length>4)
    {
        return true
    }
    else{
        return false
    }

});
console.log(fruy)

const frui = fruits.filter((value,index)=> fruits[index].length>4)  
console.log(frui)























