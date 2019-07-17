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