const message = new Promise(function(resolve,reject){
    if(3>20){
        // we can write object also

        /* resolve([{name : 'vishnu',
        age : 20,

        },{name : 'srekanth',
        age : 21

        },{name : 'santhosh',
        age : 32

        }])
    }else {
        reject('reject')
    }*/
resolve('success')
    } else {
        reject('broken')
    }
})

message.then(function(msg){
    console.log('success msg =',msg)
}).catch(function(err){
    console.log('rejected =',err)
})

// CLOSURES

function outerFunction(counter){
    function innerFunction(){
        let count;
        count = counter + 10;
        return count;
        
    }
    return innerFunction
}
let innerFunc = outerFunction(10)
let counter = innerFunc()
console.log('counter value =',counter)

const person = {
    name : 'barth',
    age : 20,
    weight : '30kg'
}
// object Destructuring

let {name,age} = person

console.log( 'name =',name +' '+'age =',age )

const hobb = ['fruits','veg','non veg']
//array Destructuring

let[hobb0,hobb1]= hobb;
console.log( 'name =',hobb0  +' '+'age =',hobb1 )
 
const person1 = {
     name : 'karhik',
     age : 21,
     height : 5.8
 }

 let  











































