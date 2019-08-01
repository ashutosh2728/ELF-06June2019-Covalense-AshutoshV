<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Employee Information</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body style="background: lightgreen">
      <div class="accordion" id="accordionExample">
        <div class="card">
          <div class="card-header" id="headingOne">
            <h5 class="mb-0">
              <button class="btn btn-link" type="button" data-toggle="collapse" data-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
               Employee Information
              </button>
            </h5>
          </div>
      
          <div id="collapseOne" class="collapse show" aria-labelledby="headingOne" data-parent="#accordionExample">
            <div class="card-body">
                <form action="./createEmployee" method="post">
                    <div class="row">
                      <div class="col">
                            <label for="exampleInputEmail1">ID</label>
                        <input type="text" id="id" name="id" class="form-control" placeholder="ID">
                      </div>
                      <div class="col">
                            <label for="exampleInputEmail1">ACCOUNT NUMBER</label>
                        <input type="text" id="accountNumber" name="accountNumber"  class="form-control" placeholder="ACCOUNT NUMBER">
                      </div>
                    </div>
                    <div class="row">
                      <div class="col">
                            <label for="exampleInputEmail1">NAME</label>
                        <input type="text" id="name" name="name"  class="form-control" placeholder="NAME">
                      </div>
                      <div class="col">
                            <label for="exampleInputEmail1">EMAIL ID</label>
                        <input type="text" id="emailId" name="email" class="form-control" placeholder="EMAIL ID">
                      </div>
                    </div>
                    <div class="row">
                      <div class="col">
                            <label for="exampleInputEmail1">AGE</label>
                        <input type="text"  name="age" id="age" class="form-control" placeholder="AGE">
                      </div>
                      <div class="col">
                            <label for="exampleInputEmail1">DESIGNATION</label>
                        <input type="text"   name="designation" id="designation"  class="form-control" placeholder="DESIGNATION">
                    </div>
                    </div>
                    <div class="row">
                            <div class="col">
                                    <label for="inputGender">Gender</label>
                                    <select name="gender"  id="gender" class="form-control">
                                      <option selected>--select one--</option>
                                <option value="male">male</option>
                                <option value="female">female</option>
                                <option value="other">other</option>
                            </select>
                            </div>
                            <div class="col">
                                    <label for="exampleInputEmail1">Date of Birth</label>
                                <input type="date"  name="dob" id="dob"  class="form-control" placeholder="dd-mm-yyyy">
                            </div>
                      </div>
                    <div class="row">
                            <div class="col">
                                  <label for="exampleInputEmail1">SALARY</label>
                              <input type="text" name="salary" id="salary"  class="form-control" placeholder="SALARY">
                            </div>
                            <div class="col">
                                  <label for="exampleInputEmail1">DEPARTMENT ID</label>
                              <input type="text" name="departmentId" id="departmentId" class="form-control" placeholder="DEPARTMENT ID">
                          </div>
                          </div>
                          <div class="row">
                                <div class="col">
                                      <label for="exampleInputEmail1">PHONE NUMBER</label>
                                  <input type="text" name="phone" id="phone" class="form-control" placeholder="PHONE NUMBER">
                                </div>
                                <div class="col">
                                      <label for="exampleInputEmail1">MANAGER ID</label>
                                  <input type="text" name="managerId" id="managerId" class="form-control" placeholder="MANAGER ID">
                              </div>
                              </div>
                              <div class="row">
                                 
                                    <div class="col-6">
                                        <label for="exampleInputEmail1">JOINING DATE</label>
                                      <input type="date" name="joiningDate" id="joiningDate"  class="form-control" placeholder="JOINING DATE">
                                </div>
                                <div class="col">
                                    <label for="password">Password:</label>
                                    <input type="password" onkeyup="validateForm()" class="form-control" id="password" placeholder="Enter Password" name="password">
                                    <label for="password">Confirm Password:</label>
                                    <input type="password" onkeyup="validateForm()" class="form-control" id="confirmpassword" placeholder="Confirm Password" name="password">
                                  
                                </div>
                                      
                    </div>    
                             
                                   
                                  </div>     
            </div>
          </div>
        
        <div class="card">
          <div class="card-header" id="headingTwo">
            <h5 class="mb-0">
              <button class="btn btn-link collapsed" type="button" data-toggle="collapse" data-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
                Employee Other Information
              </button>
            </h5>
          </div>
          <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionExample">
            <div class="card-body">
                <div class="row">
                    <div class="col">
                          <label for="exampleInputEmail1">ID</label>
                      <input type="text"  name="otherInfo.id" id="id" class="form-control" placeholder="Please Enter ID">
                    </div>
                    <div class="col">
                          <label for="exampleInputemergenum">Emergency Contact Number</label>
                      <input type="text" class="form-control" name="otherInfo.emergencyContactNum" id="emerContNum" placeholder="Please Enter Emergency Contact Number">
                    </div>
                    <div class="col">
                          <label for="exampleInputmotname">Mother Name</label>
                      <input type="text"  id="motherName" name="otherInfo.motherName" class="form-control" placeholder="Please Enter Mother Name">
                    </div>
                  </div>
                  <div class="row">
                    <div class="col">
                          <label for="exampleInputPan">Pan Number</label>
                      <input type="text" id="pan" name="otherInfo.pan" class="form-control" placeholder="Please Enter Pan Number">
                    </div>
                    <div class="col">
                          <label for="exampleInputemergeName">Emergency Contact Name</label>
                      <input type="text" id="emergencyContactName"  name="otherInfo.emergencyContactName" class="form-control" placeholder="Please Enter Emergency Contact Name">
                    </div>
                    <div class="col">
                          <label for="exampleInputspouse">Spouse Name</label>
                      <input type="text" id="spouseName" name="otherInfo.spouseName" class="form-control" placeholder="Please Enter Spouse Name">
                    </div>
                  </div>
                  <div class="row">
                          <div class="col">
                                  <label for="inputStatus">Marital Status</label>
                                  <select id="inputStatus" name="otherInfo.isMarried"   class="form-control">
                                    <option selected>Married</option>
                              <option value="married">Married</option>
                              <option value="unmarried">Unmarried</option>
                              <option value="divorcee">Divorcee</option>
                          </select>
                          </div>
                          <div class="col">
                                  <label for="inputnationality">Nationality</label>
                                  <select id="inputnationality" name="otherInfo.nationality" class="form-control">
                                    <option selected>---Select One---</option>
                              <option value="indian">Indian</option>
                              <option value="other">Other</option>
                          </select>
                          </div>
                          <div class="col">
                                  <label for="exampleInputpassport">Passport Number</label>
                              <input type="text"  id="passportNum"  name="otherInfo.passport" class="form-control" placeholder="Please Enter Passport Number">
                            </div>
                  </div>
                  <div class="row">
                  <div class="col">
                          <label for="inputbloodgrp">Blood Group</label>
                          <select id="inputbloodgrp" name="otherInfo.bloodGrp" class="form-control">
                            <option selected>---Select One---</option>
                      <option value="AB+">AB+</option>
                      <option value="AB-">AB-</option>
                      <option value="A+">A+</option>
                      <option value="A-">A-</option>
                      <option value="o+">o+</option>
                      <option value="o-">o-</option>
                  </select>
                  </div>
                  <div class="col">
                          <label for="inputreligion">Religion</label>
                          <select id="inputreligion" name="otherInfo.relegion" class="form-control">
                            <option selected>---Select One---</option>
                      <option value="hindu">Hindu</option>
                      <option value="christian">Christian</option>
                      <option value="muslim">Muslim</option>
                  </select>
                  </div>
                  <div class="col">
                          <label for="exampleInputaadhar">Aadhar Number</label>
                      <input type="text" id="adhar" name="otherInfo.adhar"  class="form-control" placeholder="Please Enter Aadhar Number">
                    </div>
                  </div>
                  <div class="row">
                          <div class="col">
                                  <label for="inputphysicallych">Physically Challnged</label>
                                  <select id="inputphysicallych"  name="otherInfo.isChallenged"  class="form-control">
                                    <option selected>---Select One---</option>
                              <option value="yes">Yes</option>
                              <option value="no">No</option>
                          </select>
                          </div>
                          <div class="col">
                                  <label for="exampleInputfather">Father Name</label>
                              <input type="text" name="otherInfo.fatherName" class="form-control" placeholder="Please Enter Father Name">
                            </div>
                           
                            
                           
                    </div>
                        <div class="row">
                            <div class="col-3">
                                <br>
                                  <input  type="submit" class="form-control" style="margin-left: 200px ; background: lightseagreen" > </input>
      
                              </div ><div class="col-3">
                                <br>
                                  <input type="reset" class="form-control" style="margin-left: 280px ; background: lightslategray"  > </input>
                              
                            </div>        
                                     
                </form>
            </div>
          </div>
    </div>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>