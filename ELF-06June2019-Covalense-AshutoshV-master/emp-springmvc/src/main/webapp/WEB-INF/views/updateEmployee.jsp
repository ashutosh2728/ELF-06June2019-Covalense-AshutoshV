<!DOCTYPE html>
<%@page import="com.covalense.empspringmvc.dto.EmployeeExperienceInfoBean"%>
<%@page
	import="com.covalense.empspringmvc.dto.EmployeeEducationalInfoBean"%>
<%@page import="com.covalense.empspringmvc.dto.EmployeeAddressInfoBean"%>
<%@page import="java.util.List"%>
<%@page import="javax.print.attribute.standard.MediaSize.Other"%>
<%@page import="com.covalense.empspringmvc.dto.EmployeeInfoBean"%>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Employee Information</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
</head>
<%
	EmployeeInfoBean infoBean = (EmployeeInfoBean) session.getAttribute("infoBean");
%>
<body style="background: lightgreen">
	<div class="accordion" id="accordionExample">
		<div class="card">
			<div class="card-header" id="headingOne">
				<h5 class="mb-0">
					<button class="btn btn-link" type="button" data-toggle="collapse"
						data-target="#collapseOne" aria-expanded="true"
						aria-controls="collapseOne">Employee Information</button>
				</h5>
			</div>

			<div id="collapseOne" class="collapse show"
				aria-labelledby="headingOne" data-parent="#accordionExample">
				<div class="card-body">
					<form action="./updateEmployee" method="post">
						<div class="row">
							<div class="col">
								<label for="exampleInputEmail1">ID</label> <input type="text"
									id="id" name="id" class="form-control" placeholder="ID"
									value="<%=infoBean.getId()%>">
							</div>
							<div class="col">
								<label for="exampleInputEmail1">ACCOUNT NUMBER</label> <input
									type="text" id="accountNumber" name="accountNumber"
									class="form-control" placeholder="ACCOUNT NUMBER"
									value="<%=infoBean.getAccountNumber()%>"/>
							</div>
						</div>
						<div class="row">
							<div class="col">
								<label for="exampleInputEmail1">NAME</label> <input type="text"
									id="name" name="name" value="<%=infoBean.getName()%>"
									class="form-control" placeholder="NAME">
							</div>
							<div class="col">
								<label for="exampleInputEmail1">EMAIL ID</label> <input
									type="text" id="emailId" value="<%=infoBean.getEmail()%>"
									name="email" class="form-control" placeholder="EMAIL ID">
							</div>
						</div>
						<div class="row">
							<div class="col">
								<label for="exampleInputEmail1">AGE</label> <input type="text"
									value="<%=infoBean.getAge()%>" name="age" id="age"
									class="form-control" placeholder="AGE">
							</div>
							<div class="col">
								<label for="exampleInputEmail1">DESIGNATION</label> <input
									type="text" name="designation" id="designation"
									value="<%=infoBean.getDesignation()%>" class="form-control"
									placeholder="DESIGNATION">
							</div>
						</div>
						<div class="row">
							<div class="col">
								<label for="inputGender">Gender</label> <select name="gender"
									value="<%=infoBean.getGender()%>" id="gender"
									class="form-control">
									<%
										if (infoBean.getGender().equals("male")) {
									%>
									<option value="male" selected="selected">male</option>
									<option value="female">female</option>
									<%
										} else {
									%>
									<option value="male">male</option>
									<option value="female" selected="selected">female</option>
									<%
										}
									%>
								</select>
							</div>
							<div class="col">
								<label for="exampleInputEmail1">Date of Birth</label> <input
									type="date" name="dob" id="dob" class="form-control"
									value="<%=infoBean.getDob()%>" placeholder="dd-mm-yyyy">
							</div>
						</div>
						<div class="row">
							<div class="col">
								<label for="exampleInputEmail1">SALARY</label> <input
									type="text" name="salary" id="salary" class="form-control"
									value="<%=infoBean.getSalary()%>" placeholder="SALARY">
							</div>
							<div class="col">
								<label for="exampleInputEmail1">DEPARTMENT ID</label> <input
									type="text" name="departmentId" id="departmentId"
									value="<%=infoBean.getDepartmentInfoBean()%>" class="form-control"
									placeholder="DEPARTMENT ID">
							</div>
						</div>
						<div class="row">
							<div class="col">
								<label for="exampleInputEmail1">PHONE NUMBER</label> <input
									type="text" name="phone" id="phone" class="form-control"
									value="<%=infoBean.getPhone()%>" placeholder="PHONE NUMBER">
							</div>
							<div class="col">
								<label for="exampleInputEmail1">MANAGER ID</label> <input
									type="text" name="mgrId" id="managerId"
									value="<%=infoBean.getMngId()%>" class="form-control"
									placeholder="MANAGER ID">
							</div>
						</div>
						<div class="row">

							<div class="col-6">
								<label for="exampleInputEmail1">JOINING DATE</label> <input
									type="date" name="joiningDate" id="joiningDate"
									value="<%=infoBean.getJoiningDate()%>" class="form-control"
									placeholder="JOINING DATE">
							</div>
							<div class="col">
								<label for="password">Password:</label> <input type="password"
									onkeyup="validateForm()" class="form-control" id="password"
									value="<%=infoBean.getPassword()%>"
									placeholder="Enter Password" name="password"> <label
									for="password">Confirm Password:</label> <input type="password"
									onkeyup="validateForm()" class="form-control"
									id="confirmpassword" placeholder="Confirm Password"
									name="password">

							</div>

						</div>
				</div>
			</div>


			<div class="card">
				<div class="card-header" id="headingTwo">
					<h5 class="mb-0">
						<button class="btn btn-link collapsed" type="button"
							data-toggle="collapse" data-target="#collapseTwo"
							aria-expanded="false" aria-controls="collapseTwo">
							Employee Other Information</button>
					</h5>
				</div>
				<div id="collapseTwo" class="collapse" aria-labelledby="headingTwo"
					data-parent="#accordionExample">
					<div class="card-body">
						<div class="row">

							<div class="col">
								<label for="exampleInputemergenum">Emergency Contact
									Number</label> <input type="text" class="form-control"
									value="<%=infoBean.getOtherInfo().getEmergencyContactNum()%>"
									name="otherInfo.emergencyContactNum" id="emerContNum"
									placeholder="Please Enter Emergency Contact Number">
							</div>
							<div class="col">
								<label for="exampleInputmotname">Mother Name</label> <input
									type="text" id="motherName" name="otherInfo.motherName"
									value="<%=infoBean.getOtherInfo().getMotherName()%>"
									class="form-control" placeholder="Please Enter Mother Name">
							</div>
						</div>
						<div class="row">
							<div class="col">
								<label for="exampleInputPan">Pan Number</label> <input
									type="text" id="pan" name="otherInfo.pan" class="form-control"
									value="<%=infoBean.getOtherInfo().getPan()%>"
									placeholder="Please Enter Pan Number">
							</div>
							<div class="col">
								<label for="exampleInputemergeName">Emergency Contact
									Name</label> <input type="text" id="emergencyContactName"
									value="<%=infoBean.getOtherInfo().getEmergencyContactName()%>"
									name="otherInfo.emergencyContactName" class="form-control"
									placeholder="Please Enter Emergency Contact Name">
							</div>
							<div class="col">
								<label for="exampleInputspouse">Spouse Name</label> <input
									type="text" id="spouseName" name="otherInfo.spouseName"
									value="<%=infoBean.getOtherInfo().getSpouseName()%>"
									class="form-control" placeholder="Please Enter Spouse Name">
							</div>
						</div>
						<div class="row">
							<div class="col">
								<label for="inputStatus">Marital Status</label> <select
									id="inputStatus" name="otherInfo.isMarried"
									class="form-control"
									value="<%=infoBean.getOtherInfo().isMarried()%>">
										<option selected>Married</option>
									<%if(infoBean.getOtherInfo().isMarried()){ %>
									<option value="true" selected="selected">Married</option>
									<option value="false">Unmarried</option>
									<%} else { %>
									<option value="true">Married</option>
									<option value="false" selected="selected">Unmarried</option>
									<%} %>
								</select>
							</div>
							<div class="col">
								<label for="inputnationality">Nationality</label> <select
									id="inputnationality" name="otherInfo.nationality"
									value="<%=infoBean.getOtherInfo().getNationality()%>"
									class="form-control">
									<option selected>---Select One---</option>
									<%
										if (infoBean.getOtherInfo().getNationality().equals("indian")) {
									%>
									<option value="indian" selected="selected">Indian</option>
									<option value="other">Other</option>
									<%
										} else {
									%>
									<option value="indian">Indian</option>
									<option value="other" selected="selected">Other</option>
									<%
										}
									%>
								</select>
							</div>
							<div class="col">
								<label for="exampleInputpassport">Passport Number</label> <input
									type="text" id="passportNum" name="otherInfo.passport"
									value="<%=infoBean.getOtherInfo().getPassport()%>"
									class="form-control" placeholder="Please Enter Passport Number">
							</div>
						</div>
						<div class="row">
							<div class="col">
								<label for="inputbloodgrp">Blood Group</label> <select
									id="inputbloodgrp" name="otherInfo.bloodGrp"
									value="<%=infoBean.getOtherInfo().getBloodGrp()%>"
									class="form-control">
									<option selected>---Select One---</option>
									<%
										if (infoBean.getOtherInfo().getBloodGrp().equals("AB+")) {
									%>

									<option value="AB+" selected="selected">AB+</option>
									<option value="AB-">AB-</option>
									<option value="A+">A+</option>
									<option value="A-">A-</option>
									<option value="o+">o+</option>
									<option value="o-">o-</option>
									<%
										} else if (infoBean.getOtherInfo().getBloodGrp().equals("AB-")) {
									%>
									<option value="AB+">AB+</option>
									<option value="AB-" selected="selected">AB-</option>
									<option value="A+">A+</option>
									<option value="A-">A-</option>
									<option value="o+">o+</option>
									<option value="o-">o-</option>
									<%
										} else if (infoBean.getOtherInfo().getBloodGrp().equals("A+")) {
									%>
									<option value="AB+">AB+</option>
									<option value="AB-">AB-</option>
									<option value="A+" selected="selected">A+</option>
									<option value="A-">A-</option>
									<option value="o+">o+</option>
									<option value="o-">o-</option>
									<%
										} else if (infoBean.getOtherInfo().getBloodGrp().equals("A-")) {
									%>
									<option value="AB+">AB+</option>
									<option value="AB-">AB-</option>
									<option value="A+">A+</option>
									<option value="A-" selected="selected">A-</option>
									<option value="o+">o+</option>
									<option value="o-">o-</option>
									<%
										} else if (infoBean.getOtherInfo().getBloodGrp().equals("o+")) {
									%>
									<option value="AB+" selected="selected">AB+</option>
									<option value="AB-">AB-</option>
									<option value="A+">A+</option>
									<option value="A-">A-</option>
									<option value="o+" selected="selected">o+</option>
									<option value="o-">o-</option>
									<%
										} else if (infoBean.getOtherInfo().getBloodGrp().equals("o-")) {
									%>
									<option value="AB-">AB-</option>
									<option value="A+">A+</option>
									<option value="A-">A-</option>
									<option value="o+">o+</option>
									<option value="o-" selected="selected">o-</option>
									<%
										}
									%>

								</select>
							</div>
							<div class="col">
								<label for="inputreligion">Religion</label> <select
									id="inputreligion" name="otherInfo.relegion"
									value="<%=infoBean.getOtherInfo().getRelegion()%>"
									class="form-control">
									<option selected>---Select One---</option>
									<%
										if (infoBean.getOtherInfo().getRelegion().equals("hindu")) {
									%>
									<option value="hindu" selected="selected">Hindu</option>
									<option value="christian">Christian</option>
									<option value="muslim">Muslim</option>
									<%
										} else if (infoBean.getOtherInfo().getRelegion().equals("christian")) {
									%>
									<option value="hindu">Hindu</option>
									<option value="christian" selected="selected">Christian</option>
									<option value="muslim">Muslim</option>
									<%
										} else if (infoBean.getOtherInfo().getRelegion().equals("muslim")) {
									%>
									<option value="hindu">Hindu</option>
									<option value="christian">Christian</option>
									<option value="muslim" selected="selected">Muslim</option>
									<%
										}
									%>
								</select>
							</div>
							<div class="col">
								<label for="exampleInputaadhar">Aadhar Number</label> <input
									type="text" id="adhar" name="otherInfo.adhar"
									value="<%=infoBean.getOtherInfo().getAdhar()%>"
									class="form-control" placeholder="Please Enter Aadhar Number">
							</div>
						</div>
						<div class="row">
							<div class="col">
								<label for="inputphysicallych">Physically Challnged</label> <select
									id="inputphysicallych" name="otherInfo.isChallenged"
									value="<%=infoBean.getOtherInfo().isChallenged()%>"
									class="form-control">
									<option selected>---Select One---</option>
									<%
										if (infoBean.getOtherInfo().isChallenged()) {
									%>
									<option value="true" selected="selected">Yes</option>
									<option value="false">No</option>
									<%
										} else {
									%>
									<option value="true">Yes</option>
									<option value="false" selected="selected">No</option>
									<%
										}
									%>
								</select>
							</div>
							<div class="col">
								<label for="exampleInputfather">Father Name</label> <input
									type="text" name="otherInfo.fatherName"
									value="<%=infoBean.getOtherInfo().getFatherName()%>"
									class="form-control" placeholder="Please Enter Father Name">
							</div>

						</div>
					</div>
				</div>
				</div>
				<%
					List<EmployeeAddressInfoBean> addressInfoBeans = infoBean.getAddressInfoBeanList();
					for (EmployeeAddressInfoBean addressInfoBean : addressInfoBeans) {
						int i = 0;
				%>

				<div class="card">
					<div class="card-header" id="headingThree">
						<h2 class="mb-0">
							<button class="btn btn-link" type="button" data-toggle="collapse"
								data-target="#collapseThree" aria-expanded="true"
								aria-controls="collapseThree">Employee Address
								Information</button>
						</h2>
					</div>

					<div id="collapseThree" class="collapse show"
						aria-labelledby="headingThree" data-parent="#accordionExample">
						<div class="card-body">
							<h3>Employee Address 1</h3>
							<
							<div class="row">
								<div class="col">
									<label for="AddressType">Address Type</label> <input
										type="text"
										name="addressInfoBeanList[<%=i%>].addressPKBean.addressType"
										value="<%=addressInfoBean.getAddressPKBean().getAddressType()%>"
										class="form-control" placeholder="Enter AddressType">
								</div>
								<div class="col">
									<label for="exampleInputCity">City</label> <input type="text"
										value="<%=addressInfoBean.getCity()%>"
										name="addressInfoBeanList[<%=i%>].city" class="form-control"
										placeholder="Enter City">
								</div>
							</div>
							<div class="row">
								<div class="col">
									<label for="exampleInputState">State</label> <input type="text"
										value="<%=addressInfoBean.getState()%>"
										name="addressInfoBeanList[<%=i%>].state" class="form-control"
										placeholder="Enter State">
								</div>
							</div>
							<div class="row">
								<div class="col">
									<label for="exampleInputAddress1">Address1</label> <input
										type="text" name="addressInfoBeanList[<%=i%>].address1"
										value="<%=addressInfoBean.getAddress1()%>"
										class="form-control" placeholder="Enter Address Line1">
								</div>
								<div class="col">
									<label for="exampleInputCountry">Country</label> <input
										name="addressInfoBeanList[<%=i%>].country" type="text"
										value="<%=addressInfoBean.getCountry()%>" class="form-control"
										placeholder="Enter Country">
								</div>
							</div>
							<div class="row">
								<div class="col">
									<label for="exampleInputAddress2">Address2</label> <input
										type="text" class="form-control"
										value="<%=addressInfoBean.getAddress2()%>"
										name="addressInfoBeanList[<%=i%>].address2"
										placeholder="Enter Address Line2">
								</div>
								<div class="col">
									<label for="exampleInputPincode">Pincode</label> <input
										name="addressInfoBeanList[<%=i%>].pincode" type="text"
										value="<%=addressInfoBean.getPincode()%>" class="form-control"
										placeholder="Enter Pincode">
								</div>
							</div>
							<div class="row">

								<div class="col-6">
									<label for="exampleInputLandmark">Landmark</label> <input
										name="addressInfoBeanList[<%=i%>].landmark" type="text"
										value="<%=addressInfoBean.getLandmark()%>"
										class="form-control" placeholder="Enter Landmark">
								</div>

							</div>
								</div>
								</div>
								</div>
							<%
								i++;
								}
							%>

				
							<%
								List<EmployeeEducationalInfoBean> educationalInfoBeans = infoBean.getEmployeeEducationalInfoBean();
								for (EmployeeEducationalInfoBean employeeEducationalInfoBean : educationalInfoBeans) {
									int i = 0;
									%>


							<div class="card">
								<div class="card-header" id="headingFive">
									<h2 class="mb-0">
										<button class="btn btn-link collapsed" type="button"
											data-toggle="collapse" data-target="#collapseFive"
											aria-expanded="false" aria-controls="collapseFive">
											Employee Educational Information</button>
									</h2>
								</div>
								<div id="collapseFive" class="collapse"
									aria-labelledby="headingFive" data-parent="#accordionExample">
									<div class="card-body">

										<fieldset>

											<legend class="h3" style="text-align: center;">Education
												Details</legend>



											<!-- Prepended text-->
											<div class="form-group">
												<label class="control-label col-sm-4" for="prependedtext"></label>
												<div class="col-sm-4">
													<div class="input-group">
														<span class="input-group-addon">Education Type</span> <input
															id="educationtype"
															name="employeeEducationalInfoBean[<%=i%>].educationalInfoPKBean.educationType"
															class="form-control" placeholder="Enter Educational Type" value="<%=employeeEducationalInfoBean.getEducationalInfoPKBean().getEducationType()%>"
															type="text">
													</div>

												</div>
											</div>

											<!-- Prepended text-->
											<div class="form-group">
												<label class="control-label col-sm-4" for="prependedtext"></label>
												<div class="col-sm-4">
													<div class="input-group">
														<span class="input-group-addon">Degree Type</span> <input
															id="degreetype"
															name="employeeEducationalInfoBean[<%=i%>].degreetype"
															class="form-control" value="<%=employeeEducationalInfoBean.getDegreeType()%>" placeholder="Enter Degree Type"
															type="text">
													</div>

												</div>
											</div>

											<!-- Prepended text-->
											<div class="form-group">
												<label class="control-label col-sm-4" for="prependedtext"></label>
												<div class="col-sm-4">
													<div class="input-group">
														<span class="input-group-addon">Branch</span> <input
															id="branch" name="employeeEducationalInfoBean[<%=i%>].branch" value="<%=employeeEducationalInfoBean.getBranch()%>"
															class="form-control" placeholder="Enter Branch"
															type="text">
													</div>

												</div>
											</div>

											<!-- Prepended text-->
											<div class="form-group">
												<label class="control-label col-sm-4" for="prependedtext"></label>
												<div class="col-sm-4">
													<div class="input-group">
														<span class="input-group-addon">College Name</span> <input
															id="college"
															name="employeeEducationalInfoBean[<%=i%>].college" value="<%=employeeEducationalInfoBean.getCollegeName()%>"
															class="form-control" placeholder="Enter College Name"
															type="text">
													</div>

												</div>
											</div>

											<!-- Prepended text-->
											<div class="form-group">
												<label class="control-label col-sm-4" for="prependedtext"></label>
												<div class="col-sm-4">
													<div class="input-group">
														<span class="input-group-addon">University</span> <input
															id="university"
															name="employeeEducationalInfoBean[<%=i%>].university" value="<%=employeeEducationalInfoBean.getUniversity()%>"
															class="form-control" placeholder="Enter University Name"
															type="text">
													</div>

												</div>
											</div>

											<!-- Prepended text-->
											<div class="form-group">
												<label class="control-label col-sm-4" for="prependedtext"></label>
												<div class="col-sm-4">
													<div class="input-group">
														<span class="input-group-addon">Year of Passout</span> <input
															id="yop" name="employeeEducationalInfoBean[<%=i%>].yop" value="<%=employeeEducationalInfoBean.getYop()%>"
															class="form-control" placeholder="Enter Year of Passout"
															type="text">
													</div>

												</div>
											</div>

											<!-- Prepended text-->
											<div class="form-group">
												<label class="control-label col-sm-4" for="prependedtext"></label>
												<div class="col-sm-4">
													<div class="input-group">
														<span class="input-group-addon">Percentage</span> <input
															id="percentage"
															name="employeeEducationalInfoBean[<%=i%>].percentage" value="<%=employeeEducationalInfoBean.getPercentage()%>"
															class="form-control" placeholder="Enter Percentage"
															type="number">
													</div>

												</div>
											</div>

											<!-- Prepended text-->
											<div class="form-group">
												<label class="control-label col-sm-4" for="prependedtext"></label>
												<div class="col-sm-4">
													<div class="input-group">
														<span class="input-group-addon">Location</span> <input
															id="location"
															name="employeeEducationalInfoBean[<%=i%>].location" value="<%=employeeEducationalInfoBean.getLocation()%>"
															class="form-control" placeholder="Enter Location"
															type="text">
													</div>

												</div>
											</div>
</div>
	</div>
	</div>
										</fieldset>
										<%
											i++;
											}
										%>


 								<%
								List<EmployeeExperienceInfoBean> experienceInfoBeans = infoBean.getEmployeeExperienceInfoBean();
								for (EmployeeExperienceInfoBean experienceInfoBean : experienceInfoBeans) {
									int i = 0;
									%>
							<div class="card">
								<div class="card-header" id="headingSeven">
									<h2 class="mb-0">
										<button class="btn btn-link collapsed" type="button"
											data-toggle="collapse" data-target="#collapseSeven"
											aria-expanded="false" aria-controls="collapseSeven">
											Employee Experience Information</button>
									</h2>
								</div>
								<div id="collapseSeven" class="collapse"
									aria-labelledby="headingSeven" data-parent="#accordionExample">
									<div class="card-body">

										<fieldset>


											<!-- change col-sm-N to reflect how you would like your column spacing (http://getbootstrap.com/css/#forms-control-sizes) -->


											<!-- Form Name -->
											<legend>Employee Experience Details</legend>



											<!-- Prepended text http://getbootstrap.com/components/#input-groups -->
											<div class="form-group">
												<label class="control-label col-sm-2" for="companyname"></label>
												<div class="col-sm-6">
													<div class="input-group">
														<span id="companynamePrepend" class="input-group-addon">Company
															Name</span> <input id="companyname" value="<%=experienceInfoBean.getEmployeeExperienceInfoPKBean().getCompanyName()%>"
															name="employeeExperienceInfoBean[<%=i%>].employeeExperienceInfoPKBean.companyName"
															class="form-control" placeholder="Enter Company Name"
															type="text">

													</div>

												</div>
											</div>

											<!-- Prepended text http://getbootstrap.com/components/#input-groups -->
											<div class="form-group">
												<label class="control-label col-sm-2" for="Designation"></label>
												<div class="col-sm-6">
													<div class="input-group">
														<span id="DesignationPrepend" class="input-group-addon">Designation</span>
														<input id="Designation" value="<%=experienceInfoBean.getDesignation()%>"
															name="employeeExperienceInfoBean[<%=i%>].designation"
															class="form-control" placeholder="Designation"
															type="text">

													</div>

												</div>
											</div>

											<!-- Prepended text http://getbootstrap.com/components/#input-groups -->
											<div class="form-group">
												<label class="control-label col-sm-2" for="leavingdate"></label>
												<div class="col-sm-6">
													<div class="input-group">
														<span id="leavingdatePrepend" class="input-group-addon">Leaving
															Date</span> <input id="leavingdate"  value="<%=experienceInfoBean.getLeavingDate()%>"
															name="employeeExperienceInfoBean[<%=i%>].leavingDate"
															class="form-control" placeholder="dd-mm-yyyy" type="date">

													</div>

												</div>
											</div>

											<!-- Prepended text http://getbootstrap.com/components/#input-groups -->
											<div class="form-group">
												<label class="control-label col-sm-2" for="joiningdate"></label>
												<div class="col-sm-6">
													<div class="input-group">
														<span id="joiningdatePrepend" class="input-group-addon">Joining
															Date</span> <input id="joiningdate"  value="<%=experienceInfoBean.getJoiningDate()%>"
															name="employeeExperienceInfoBean[<%=i%>].joiningDate"
															class="form-control" placeholder="dd-mm-yyyy" type="date">

													</div>

												</div>
											</div>

										</fieldset>
											<%
											i++;
											}
										%>

										
 -->
									</div>
								</div>

							</div>


							<div class="row">
								<div class="col-3">
									<br> <input type="submit" class="form-control"
										style="margin-left: 200px; background: lightseagreen">
									</input>

								</div>
								<div class="col-3">
									<br> <input type="reset" class="form-control"
										style="margin-left: 280px; background: lightslategray">
									</input>

								</div>
								</form>
							</div>
						</div>
					
</div>

	
				<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
					integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
					crossorigin="anonymous"></script>
				<script
					src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
					integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
					crossorigin="anonymous"></script>
				<script
					src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
					integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
					crossorigin="anonymous"></script>
</body>
</html>