var milkprts = ['heritage','milkmist','arogya','venla']

const h1 = Array.isArray(milkprts);
console.log('check isit array or not =',h1) 
console.log('========================')
const h2= milkprts.includes('tirumala',1);
console.log('present r not =',h2)
console.log('========================')
const h3 =  milkprts.push('tirumala ','nandini ')
console.log('push the elements =',h3 );
console.log('========================')
console.log('remove elements at last =',milkprts.pop());
console.log('========================')
console.log('added elements at starting =',milkprts.unshift('amul','fresh'))
console.log(milkprts)
console.log('========================')
console.log('removed eements at starting = ',milkprts.shift());
console.log('========================')
console.log('splice the elements =',milkprts.splice(1,1,'heritage2'))
console.log('========================')
console.log('slice the elements',milkprts.slice(1,3)) 
console.log('========================')
console.log('array to string ', milkprts.join("&"));
console.log('========================')
const Milk = milkprts.map(milkprts=>milkprts);
console.log(Milk)
console.log('========================')
console.log(Milk.indexOf('heritage2',1))
  console.log('==============================================')  
const milkprts1 = Milk.filter((v,i)=> v.length>4)
console.log(milkprts)
console.log(milkprts1)
console.log('================================eg2============================')