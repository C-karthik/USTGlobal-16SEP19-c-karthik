let h1ele = document.getElementById('abc')
console.log('hl ement = ',h1ele)

h1ele.textContent = 'goodbye'
console.log('text of element =',h1ele.textContent)

let buttonele = document.createElement('button')
buttonele.textContent = 'click me!!!!'
console.log('button element = ',buttonele)

document.body.appendChild(buttonele)

let ulele = document.createElement('ul')
let li1ele = document.createElement('li')
let li2ele = document.createElement('li')
let li3ele = document.createElement('li')

ulele.textContent = 'Programming Languages'
li1ele.textContent = 'java'
li2ele.textContent = 'sql'
li3ele.textContent = 'j2ee'

ulele.appendChild(li1ele)
ulele.appendChild(li2ele)
ulele.appendChild(li3ele)

document.body.appendChild(ulele)

h1ele.style.color = 'green'

h1ele.style.fontSize='110px'




function showMessage(){
    alert('hi hello u can go')
}



function changeColor(){
    let pele = document.getElementById('overOn')
    pele.style.color = 'yellow'
}
function  removeColor(){
    let remele = document.getElementById('overOn')
    remele.style.color='black'
}

function printHello(){
    // console.log('hello')
   let username = document.getElementById('userName').value
document.getElementById('showUserName').textContent = username;
}













































