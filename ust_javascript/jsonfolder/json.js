const person = {
    name : 'Sanvi',
    age : 19,
    color : 'white',
    address : {
        city : 'bangalore',
        pincode : 500890,
        sate : 'karnata'
    },
    hobbies : ['coding','singing','dancing']
}
console.log('javascript person obj =',person)
const jsonObj = JSON.stringify(person)
console.log('JSON Object =',jsonObj)
const jsObj = JSON.parse(jsonObj)
console.log('js person object =',jsObj) 
localStorage.setItem('email','ckarthik8772gmail.com')
const emailId = localStorage.getItem('email')
console.log('Email Id =',emailId)
localStorage.clear();







































