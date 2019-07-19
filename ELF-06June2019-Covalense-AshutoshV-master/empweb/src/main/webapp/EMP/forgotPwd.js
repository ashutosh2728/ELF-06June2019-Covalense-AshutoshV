function myFunction() {
    var x = document.getElementById("password");
    var y = document.getElementById("password1");
    if (x.type === "password" & y.type === "password") {
      x.type = "text";
      y.type = "text";
    } else {
      x.type = "password";
     y.type = "password";
    }
  }
 function login() {
    alert("Your password has changed successfully")
    window.location.href = "http://127.0.0.1:5500/css/EMP/emp.html";
}