function submit_nas(){
var total=5;
var score=0;
//  input
var q1=document.form["quiz"]["q1"].value;
var q2=document.form["quiz"]["q2"].value;
var q3=document.form["quiz"]["q3"].value;
var q4=document.form["quiz"]["q4"].value;
var q5=document.form["quiz"]["q5"].value;
 for(i=1;i<=total;i++){
    if(eval("q"+i)==null||eval("q"+i)==""){
   alert("You Miss Quation No" +i);
 
}
}
}

