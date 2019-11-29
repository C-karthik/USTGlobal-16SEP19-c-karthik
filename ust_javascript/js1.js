var todayDate = new Date();
console.log('todayDate +',todayDate.getDate());
console.log('day +',todayDate.getDay());
console.log('year+',todayDate.getFullYear());
console.log('month +',todayDate.getMonth());
console.log('hours +',todayDate.getUTCHours());
var constString = new Date('oct 10');
console.log('the string constructor +',constString)
var constYear = new Date(2017,10);
console.log('the date year constructor +',constYear);
var constDate = new Date(0);
console.log('the date constructor =',constDate)
