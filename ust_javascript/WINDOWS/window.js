console.log('widows pbject',window)

console.log('this object',this)

console.log(this === window)

// window.alert('welcom to my world')
// alert('ur are ok')
//   let confrmed = confirm('are u sure u need to delete')
//   console.log(confrmed)
// let prmt = prompt('what is ur name','sanvi')
// console.log('username',prmt)
const person = {
    fristName :'sanvi',
    age : 21,
    lastName : 'karthik',
getName : function(){
    return this.fristName + this.lastName
}
}
let fulName = person.getName()
console.log('fullname ', fulName)


  



