import React, { Component } from 'react'

export class OtherInfo extends Component {
    render() {
        return (
            <div class="card">
				
				<div className="card-header" id="headingThree">
					<h2 className="heading">
					Employee Other Information
					</h2>
				</div>
				<div class="card-body" >
					<div class="row">

						<div class="col">
							<label for="exampleInputemergenum">Emergency Contact
								Number</label> <input type="text" class="form-control"
								name="otherInfo.emergencyContactNum" id="emerContNum"
								placeholder="Please Enter Emergency Contact Number"/>
						</div>
						<div class="col">
							<label for="exampleInputmotname">Mother Name</label> <input
								type="text" id="motherName" name="otherInfo.motherName"
								class="form-control" placeholder="Please Enter Mother Name"/>
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label for="exampleInputPan">Pan Number</label> <input
								type="text" id="pan" name="otherInfo.pan" class="form-control"
								placeholder="Please Enter Pan Number"/>
						</div>
						<div class="col">
							<label for="exampleInputemergeName">Emergency Contact
								Name</label> <input type="text" id="emergencyContactName"
								name="otherInfo.emergencyContactName" class="form-control"
								placeholder="Please Enter Emergency Contact Name"/>
						</div>
						<div class="col">
							<label for="exampleInputspouse">Spouse Name</label> <input
								type="text" id="spouseName" name="otherInfo.spouseName"
								class="form-control" placeholder="Please Enter Spouse Name"/>
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label for="inputStatus">Marital Status</label> <select
								id="inputStatus" name="otherInfo.isMarried" class="form-control">
								<option selected>Married</option>
								<option value="true">Married</option>
								<option value="false">Unmarried</option>
								<option value="divorcee">Divorcee</option>
							</select>
						</div>
						<div class="col">
							<label for="inputnationality">Nationality</label> <select
								id="inputnationality" name="otherInfo.nationality"
								class="form-control">
								<option selected>---Select One---</option>
								<option value="indian">Indian</option>
								<option value="other">Other</option>
							</select>
						</div>
						<div class="col">
							<label for="exampleInputpassport">Passport Number</label> <input
								type="text" id="passportNum" name="otherInfo.passport"
								class="form-control" placeholder="Please Enter Passport Number"/>
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label for="inputbloodgrp">Blood Group</label> <select
								id="inputbloodgrp" name="otherInfo.bloodGrp"
								class="form-control">
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
							<label for="inputreligion">Religion</label> <select
								id="inputreligion" name="otherInfo.relegion"
								class="form-control">
								<option selected>---Select One---</option>
								<option value="hindu">Hindu</option>
								<option value="christian">Christian</option>
								<option value="muslim">Muslim</option>
							</select>
						</div>
						<div class="col">
							<label for="exampleInputaadhar">Aadhar Number</label> <input
								type="text" id="adhar" name="otherInfo.adhar"
								class="form-control" placeholder="Please Enter Aadhar Number"/>
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label for="inputphysicallych">Physically Challnged</label> <select
								id="inputphysicallych" name="otherInfo.isChallenged"
								class="form-control">
								<option selected>---Select One---</option>
								<option value="true">Yes</option>
								<option value="false">No</option>
							</select>
						</div>
						<div class="col">
							<label for="exampleInputfather">Father Name</label> <input
								type="text" name="otherInfo.fatherName" class="form-control"
								placeholder="Please Enter Father Name"/>
						</div>

					</div>
				</div>
			</div>  
        )
    }
}

export default OtherInfo
