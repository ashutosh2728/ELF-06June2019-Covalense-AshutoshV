// var a =10;
// console.log(a);
// var b = a;
// console.log(b);
// b=20;
// console.log(a);
// console.log(b);

var person = {
    name : 'Ashutosh',
    age : 25 
};
console.log("Name is " +person.name); // ashutosh
// var person1 = person;
// console.log("Other name is "+person1.name); // ashutosh
// person1.name="Aashu";
// console.log("Name is " +person.name); // aashu
// console.log("Other name is "+person1.name);//aashu

// var person = {
//     firstName : "Ashutosh",
//     lastName : "Verma",
//     age : 24 ,
 
//     getFullName : function() {
//         return this.firstName+ " " + this.lastName;
//     },
//     address : {
//         city : "Bangalore",
//         state : "Karnataka",
//         pincode : 560029
//     },
//     hobbies : ["sleeping" , "watchingtv"]
// };
// console.log("First Name "+person.firstName);
// console.log("City "+person.address.city);
// console.log("Full Name "+person.getFullName());
// console.log("Hobbies="+person.hobbies);

var library = [
{
          id : 1 ,
         author : "Bil Gates",
         name : "Bill",
},{
        id : 2 ,
       author : "Steve Jobs",
       name : "Steve",
},{
    id : 3,
   author : "Narayan",
   name : "Infosys"
  }       
        
];

// console.log("Object1 = " +library[0]);
// console.log("Object1  name = " +library[0].name);

var hobbies = ["cricket" , "volleyball","footbal","badminton"]
document.getElementById('demo').innerHTML = hobbies;
var person = {
    name : 'chandan',
    age : 22,
    city : 'Bangalore'
};
// for(var i =0;i<hobbies.length ; i++) {
//     console.log("value = "+hobbies[i]);
// }
// for(var i =0;i<person.length ; i++) {
//     console.log("value = "+person[i]);
// }
// hobbies.forEach((val,index) => {
//     console.log("value + " +val)
// });
// hobbies.forEach((val,index) => {
//     console.log("index + " +index)
//     console.log("value + " +val)
// });

// for(var value of person) {
// console.log("person =" + value);
// };
// for(var index in person) {
//     console.log("person =" + person[index]);
// //     };
// console.timeEnd("forof");
// console.log("for of ended");

// console.log("==========for of loop===========");
// console.time("forof");
// for(var i of hobbies) {
//     var a = [];
// }

// console.timeEnd("forof");
// console.log("for of ended");

// function alertMessage(val,number) {
//     alert('u8This is named function = ${val} number = ${number}');
// }

// (function() {
// alert("This is life");
// }());

// let a;
// let a =10;
// let a =30;

// const a;
// const a =10;
// const  a =20;


// varKey();
// function varKey() {
//     a=20;
//    console.log("aaa= "+a);
// }
// console.log("aaa= "+a);

// letKey();
// function letKey() {
//     let b =20;
//     console.log("bbb="+b);
// }
//  console.log("bbb="+b);


//  constKey();
//  function constKey() {
//     let b =20;
//     console.log("bbb="+c);
// }
//  console.log("bbb="+c);





//  fnName();
//  function fnName() {
//      console.log("aaaa");
//  };




//  var fnName1 = function() {
//     console.log("bbbb");
// };
// fnName();

var a = {};
console.log(typeof hobbies);
console.log(Array.isArray(hobbies));
console.log(Array.isArray(a));

var incl = hobbies.includes("cric");
console.log(incl);

hobbies.push("Kabbaddi");
console.log(hobbies);

hobbies.pop();
console.log(hobbies);

hobbies.shift();
console.log(hobbies);

hobbies.unshift("new value");
console.log(hobbies);

hobbies.splice(0,0,"ggg",'hhhh','dsffhf');
console.log(hobbies);

let hobbies1 = hobbies.slice(0,3);

console.log(hobbies.join('---'));


console.log(hobbies.indexOf("Footbal"));

// function first(sec) {
//     setTimeout(()=>{
//         console.log("This is first");
//         sec();
//     },0);
//     // console.log("this is first");
// }
// function second() {
//     console.log("this is second");
// }
// // first();
// // second();

// first(second);

const items = [
    {
        id : 1,
        name : 'book',
        price : 200
    },
    {
        id : 2,
        name : 'bag',
        price : 100
    },
    {
        id : 3,
        name : 'shirt',
        price : 1500
    },
    {
        id : 4,
        name : 'laptop',
        price : 50000
    },
    {
        id : 5,
        name : 'mobile',
        price : 25000
    }
];
// console.log(items);
// let mappedIds = items.map((value)=>{
//         return value.id;
// });
// console.log(mappedIds);
let filteredvalue = items.filter((value)=>{
    return value.price>10000;
});
console.log(filteredvalue);