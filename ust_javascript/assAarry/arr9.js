var phones =['mi phone','iphone','htc','moto','samsung']
console.log(typeof phones);

// methods
console.log('========================')
const fruits1 = Array.isArray(phones);
console.log('check isit array or not =',fruits1) 
console.log('========================')
const fruit1 = phones.includes('htc',1);
console.log('present r not =',fruit1)
console.log('========================')
const fruits2 =  phones.push('nokia','blackberry')
console.log('push the elements =',fruits2 );
console.log('========================')
console.log('remove elements at last =',phones.pop());
console.log('========================')
console.log('added elements at starting =',phones.unshift('@LG','realme'))
console.log(phones)
console.log('========================')
console.log('removed eements at starting = ',phones.shift());
console.log('========================')
console.log('splice the elements =',phones.splice(1,1,'Oneplus'));
console.log('========================')
console.log('slice the elements',phones.slice(1,2)) 
console.log('========================')
console.log('array to string ', phones.join(" %%%  "));
console.log('========================')
const fruity = phones.map(phones=>phones);
console.log(fruity)
console.log('========================')
const fruy = phones.filter(function(value,index){
    if(phones[index].length>4)
    {
        return true
    }
    else{
        return false
    }

});
console.log(fruy)

const frui = phones.filter((value,index)=> phones[index].length>4)  
console.log(frui)