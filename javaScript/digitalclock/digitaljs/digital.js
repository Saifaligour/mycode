  
function showtime(){
var today=new Date();  
var a_p="";
var current_hour=today.getHours();
var current_minute=today.getMinutes();
var current_seconds=today.getSeconds();

if(current_hour<12)
{
 a_p="<span id='mp'>AM</span>" ;  
}
else{
    a_p="<span id='mp'>PM</span>" ;  
}
if(current_hour==0)
{
    current_hour=12;
}
if(current_hour>12)
{
    current_hour=current_hour-12;
}
//current_hour=checktime(current_hour);
//current_minute=checktime(current_minute);
//current_seconds=checktime(current_seconds);
document.getElementById('clock_large').innerHTML=current_hour+":"+ current_minute+":" +current_seconds+" "+a_p;
function checktime(i){
  
    if(i<10)
    {
        i="0"+ i;
        return i;
    }
}
}



 
 setInterval(showtime);

