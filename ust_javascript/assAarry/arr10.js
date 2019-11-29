var life = ['birth','love','breakup','pain','death']

console.log(typeof life);

// methods
console.log('========================')
const fruits1 = Array.isArray(life);
console.log('check isit array or not =',fruits1) 
console.log('========================')
const fruit1 = life.includes('love',1);
console.log('present r not =',fruit1)
console.log('========================')
const fruits2 =  life.push('Mom','Dad')
console.log('push the elements =',fruits2 );
console.log('========================')
// console.log('remove elements at last =',phones.pop());
// console.log('========================')
console.log('added elements at starting =',life.unshift('Mom','Dad'))
console.log(life)
console.log('========================')
// console.log('removed eements at starting = ',life.shift());
// console.log('========================')
// console.log('splice the elements =',life.splice(1,1,'Oneplus'));
// console.log('========================')
// console.log('slice the elements',phones.slice(1,2)) 
// console.log('========================')
console.log('array to string ', life.join("@"));
console.log('========================')
const fruity = life.map(life=>life);
console.log(fruity)
console.log('========================')
const fruy = life.filter(function(value,index){
    if(life[index].length>4)
    {
        return true
    }
    else{
        return false
    }

});
console.log(fruy)

const frui = life.filter((value,index)=> life[index].length>4)  
console.log(frui)