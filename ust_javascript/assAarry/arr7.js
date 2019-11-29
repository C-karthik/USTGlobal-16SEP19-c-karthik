const price = [1000,2000,3000,4000]
console.log(typeof price);

console.log('==================')
const price1 = Array.isArray(price)
console.log('is it array =',price)
console.log('INCLUDES EEMENTS =',price.includes(3000,1))
console.log('is it array =',price.push(4500,5600))
console.log('is it array =',price.pop())
console.log('is it array =',price.unshift(9000,7800))
console.log('is it array =',price.shift())
console.log('is it array =',price.splice(1,2,3333,4444))
console.log('is it array =',price.slice(1,3))
console.log('is it array =',price.join('^'))
console.log('to find index =',price.indexOf(3333,1))
console.log('====================')

const price2 = price.map(price=>price)
console.log(price2)
console.log('====================')
const pric = price.filter((v,i)=>price>3000)