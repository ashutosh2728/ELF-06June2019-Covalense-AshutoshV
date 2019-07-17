/* window.onload = function() {

};
/* 
function validateForm(){
    let myEmail = document.forms[0].email.value;
    console.log(myEmail);
    let password = document.forms[0].password.value;
    let cnfPassword = document.forms[0].password1.value;
   if(myEmail.length >=6 && password.length>=6 && cnfPassword.length>=6 && password===cnfPassword) {
   document.forms[0].button.disabled=false;
   } else {
    document.forms[0].button.disabled=true;
   }
}
var x = prompt("Enter the number");

function factorial(n) {
    var fact=1;
    for( i =1;i <=n;i++) {
    fact = fact*i;
    }
    return fact;
    }
    alert("Factorial is "+factorial(x)); */

   /*  function count() {
        var counter =0 ;
        function getCount() {
            counter++;
            return counter;
        }
        return getCount;
    }
    let count = counter();
    var value = count();
    console.log(value);
    var value1= count();
    console.log(value1);

    var dwightSalary = (function() {
        var salary = 60000;
        function changedBy(amount) {
            salary+=amount;
        }
        return {
            raise : function() {
                changedBy(5000);
            },
            lower : function() {
                changeBy(-5000);
            },
            currentAmount : function() {
                return salary;
            }
        };
    })();
    alert(dwightSalary.currentAmount());
    dwightSalary.raise();
    alert(dwightSalary.currentAmount());
    dwightSalary.lower();
    dwightSalary.lower();
    alert(dwightSalary.currentAmount());

    dwightSalary.changeBy(10000); */ 
    let promise = new Promise((res,rej)=> {
        const items = [{id:1,name:'Ashutosh'},{id:2,name:'Aman'}];
        if(items.length>0){
            res(items);
        } else {
            rej("rejected")
        }
    });

    promise.then((data)=>{
        console.log(data);
    }).catch((reason)=>{
        console.log(reason);
    });