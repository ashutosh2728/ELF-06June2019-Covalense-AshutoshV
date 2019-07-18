
let myemail;
let mypassword;
let myconfirmpass;
function validateForm(){
    myemail = document.forms[0].email.value;
    mypassword = document.forms[0].password.value;
    myconfirmpass = document.forms[0].confirmpassword.value;

    let emaillength = myemail.length;
    let passwordength = mypassword.length;
    let confirmpasswordlen = myconfirmpass.length;
    
    if( emaillength > 6 && passwordength > 6 && confirmpasswordlen>6 && (mypassword===myconfirmpass) ){
        document.forms[0].sbmt.disabled = false;
    }else{
        document.forms[0].sbmt.disabled = true;
    }
}

function ValidateEmail(inputText)
{
    var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
    if(inputText.value.match(mailformat))
    {
        return true;
    }
    else
    {
    return false;
    }
}

function showPassword(){
    if(document.forms[0].showpassword.checked){
        document.forms[0].password.type = "text";
        document.forms[0].confirmpassword.type = "text";
    }else{
        document.forms[0].password.type = "password";
        document.forms[0].confirmpassword.type = "password";
    }
}

function createTable() {
  if(mypassword == myconfirmpass){
	  showTable(); // show the table
	  var table = document.getElementById("myTable");
	  var row = table.insertRow(0);
	  var cell1 = row.insertCell(0);
	  var cell2 = row.insertCell(1);
	  cell1.innerHTML = myemail;
	  cell2.innerHTML = mypassword;
	  clearFormElements(); //Clear the Form Elements
  }else{
	  hideTable();
  }
}

function showTable(){
  document.getElementById("myTableHeader").style = "display:block";
  document.getElementById("myTable").style = "display:block";   
}

function hideTable(){
  document.getElementById("myTableHeader").style = "display:none";
  document.getElementById("myTable").style = "display:none";   
}

function clearFormElements(){
	document.getElementById("email").value = "";
	document.getElementById("password").value = "";
	document.getElementById("confirmpassword").value = "";
}
