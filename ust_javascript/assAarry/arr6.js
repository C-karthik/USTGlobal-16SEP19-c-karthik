
var movies = ['ArjunReddy','Googley','Jilla','Shape of Water','Kesari']
const h1 = Array.isArray(movies);
console.log('check isit array or not =',h1) 
console.log('========================')
const h2= movies.includes('kabirsing',1);
console.log('present r not =',h2)
console.log('========================')
const h3 =  movies.push('KGF','kedarnath ')
console.log('push the elements =',h3 );
console.log('========================')
console.log('remove elements at last =',movies.pop());
console.log('========================')
console.log('added elements at starting =',movies.unshift('Darling','Mr.perfect'))
console.log(movies)
console.log('========================')
console.log('removed eements at starting = ',movies.shift());
console.log('========================')
console.log('splice the elements =',movies.splice(1,1,'3MooN'));
console.log('========================')
console.log('slice the elements',movies.slice(2,3)) 
console.log('========================')
console.log('array to string ', movies.join("&"));
console.log('========================')
const Horlicks = movies.map(movies=>movies);
console.log(Horlicks)
console.log('========================')
console.log(Horlicks.indexOf(' Darling',1))
  console.log('==============================================')  
const Horrlicks = Horlicks.filter((v,i)=> v.length>4)
console.log(Horrlicks)
console.log(movies)
console.log('================================eg1============================')

























