/* /* let name = document.getElementById("name");
console.log(name);
console.log(name.textContent);
name.style.color = "pink";

var classCollection = document.getElementsByClassName("demo");
console.log(classCollection);
classCollection[0].style.fontSize="50px";
classCollection[0].style.fontSize="50px";

//document.getElementById("myButton").className="button";
document.getElementById("myButton").classList ='button button1';

var querySelect = document.querySelectorAll('.demo');
console.log(querySelect);

 let input = document.createElement('input');
 document.body.appendChild(input); */
/* 
 var demoClass = document.getElementsByClassName('demo');
 console.log("By Class Name"+demoClass.length);

 var demoClass1 = document.querySelectorAll('.demo');
 console.log("query Selector"+demoClass1.length);


 console.log("Number of elements with querySelectorAll "+demoClass1.length);
 console.log("Number of elements with getElementsByClassName "+demoClass.length);

 document.getElementById("pele").className="blue";


 console.log("Number of elements with querySelectorAll "+demoClass1.length);
 console.log("Number of elements with getElementsByClassName "+demoClass.length);

 document.write("k"); */ 
 let button = document.getElementById("myButton")
/*  button.onclick = function createNewElement() {
     document.getElementById('div1').innerHTML = '<a href = "https://www.google.com">anchor tag</a>';
 } */

 window.onload = functon() {
     document.getElementById("myButton").textContent("Dont Click");
     
     }

 button.addEventListener('click',()=>{
    document.getElementById('div1').innerHTML = '<a href = "https://www.google.com">anchor tag</a>';
});