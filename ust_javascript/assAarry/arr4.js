var cakes = ['chocos','coolCake','mangomix','plainCake']
console.log(cakes.indexOf('plainCake',0))
  console.log('==============================================')  
const h1 = Array.isArray(cakes);
console.log('check isit array or not =',h1) 
console.log('========================')
const h2= cakes.includes('blakbeery',1);
console.log('present r not =',h2)
console.log('========================')
const h3 =  cakes.push('paystry ','butterscokatch ')
console.log('push the elements =',h3 );
console.log('========================')
console.log('remove elements at last =',cakes.pop());
console.log('========================')
console.log('added elements at starting =',cakes.unshift('laddu','jillebi'))
console.log(cakes)
console.log('========================')
console.log('removed eements at starting = ',cakes.shift());
console.log('========================')
console.log('splice the elements =',cakes.splice(1,1,'laddu'))
console.log('========================')
console.log('slice the elements',cakes.slice(1,3)) 
console.log('========================')
console.log('array to string ', cakes.join("&"));
console.log('========================')
const Milk = cakes.map(cakes=>cakes);
console.log(Milk)
console.log('========================')
const milkprts1 = Milk.filter((v,i)=> v.length>4)
console.log(cakes)
console.log(milkprts1)
console.log('================================eg2============================')