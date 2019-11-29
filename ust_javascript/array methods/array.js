const hobbies = ['music','eating','walking','chess']
console.log(hobbies);

console.log(typeof hobbies);

const isArrayOrNot = Array.isArray(hobbies);
console.log('hobbies ia array or not',isArrayOrNot);

const hasCricket = hobbies.includes('cricket');
console.log('either cricket is present',hasCricket);

const addEle = hobbies.push('running','yyoga');
console.log('new elements are ',addEle);

const removeEle = hobbies.pop();
console.log('removed',removeEle);

const addAtStarting = hobbies.unshift('lovebroke','getnew')
console.log('added at starting',addAtStarting);

const removeStating = hobbies.shift();
console.log('removed ',removeStating);

const addatanyindex = hobbies.splice(1,2,'go hell','burden');
console.log('sliced array',addatanyindex);

const removeatanyindex = hobbies.slice(1,3);
console.log('sliced array',removeatanyindex);

console.log(hobbies);
console.log('=============================')

const findIndex = hobbies.indexOf('burden',1);
console.log('index of given ele = ', findIndex);

const arrayToString = hobbies.join('_');
console.log('array to string = ',arrayToString);

console.log('===========================================')

const num = [100,200,300,400];


const num1 = [];
for(let i=0;i<num.length;i++){
    let num2 = num[i] + 50;
    num1.push(num2)
}
console.log(num1)



const num3 = num.map(num => num + 50);
console.log('new array num3 ', num3)

const num4 = num.filter(num => num>200);
console.log('new array num4 ', num4)

const items = [{
        name : 'kajal',
        id : 2,
        price : 2000,},{
        
            name : 'bangales',
            id : 2,
            price : 5000

        },{
            name : 'trimmer',
            id : 2,
            price : 5000

        },{
            name : 'bear',
            id : 2,
            price : 6000

        }
]

var resnew = items.map((v,i)=>
{
    v.price=v.price+300;

    return v
})

console.log('map new array =',resnew)


// incase of object it modifies original array object but in normal array type map never modifies it create new array
console.log(items)

const filt = items.filter((value)=>value.price>2000)
console.log('fitered =',filt)


const data = [100,200,300,400]

let data1 = data.map(v=>v+20)
console.log(data1)
console.log(data)








































    





