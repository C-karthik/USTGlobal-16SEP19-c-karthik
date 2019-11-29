var laptops =[{
    name : 'Lenovo',
     id : 1,
    price : 50000},{

    name : 'Dell',
    id : 1,
    price : 54000},{

    name : 'Hp',
    id : 1,
    price : 45000  
}]
console.log('isAarry  are not ',Array.isArray(laptops))
console.log('========================')
const h2= laptops.includes({name : 'sony', id : 1, price : 70000},1);
console.log('present r not =',h2)
console.log('========================')
const h3 =  laptops.push( {name : 'sony', id : 1, price : 70000},{name : 'sony', id : 1, price : 70000})
console.log('push the elements =',h3 );
console.log('========================')
console.log('remove elements at last =',laptops.pop());
console.log('========================')
console.log('added elements at starting =',laptops.unshift({name : 'mac', id : 1, price : 80000},{name : 'mac pro', id : 1, price : 70000}))
console.log(laptops)
console.log('========================')
console.log('removed eements at starting = ',laptops.shift())
console.log('========================')
console.log('splice the elements =',laptops.splice(1,1,{name : 'sony', id : 1, price : 70000}))
console.log('========================')
console.log('slice the elements',laptops.slice(1,3)) 
console.log('========================')
console.log('array to string ', laptops.join("&"));
console.log('========================')
const Milk = laptops.map(laptops=>laptops);
console.log(Milk)
console.log('========================')
const milkprts1 = Milk.filter((v,i)=> v.length>4)
console.log(milkprts1)
console.log('================================eg5============================')