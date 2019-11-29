function myTag(){
var para = document.getElementsByTagName("p");

for( var i = 0; i < para.length ; i++){

if(para[i] == para[2])
{
    para[i].style.backgroundColor = "red";
} else {
    para[i].style.backgroundColor = "green"
}
}

}