import React, { Component } from 'react'

export class Experience extends Component {
    render() {
        return (
                <div class="card">
				<div >
					<div class="card-body">
						
							<fieldset>

                            <div className="card-header" id="headingThree">
					<h2 className="heading">
					Employee Experience Information
					</h2>
				        </div>
								<div class="form-group">
									<label class="control-label col-sm-2" for="companyname"></label>
									<div class="col-sm-6">
										<div class="input-group">
											<span id="companynamePrepend" class="input-group-addon">Company
												Name</span> <input id="companyname" name="employeeExperienceInfoBean[0].employeeExperienceInfoPKBean.companyName"
												class="form-control" placeholder="Enter Company Name"
												type="text"/>

										</div>

									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-sm-2" for="Designation"></label>
									<div class="col-sm-6">
										<div class="input-group">
											<span id="DesignationPrepend" class="input-group-addon">Designation</span>
											<input id="Designation" name="employeeExperienceInfoBean[0].designation"
												class="form-control" placeholder="Designation" type="text"/>

										</div>

									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-sm-2" for="leavingdate"></label>
									<div class="col-sm-6">
										<div class="input-group">
											<span id="leavingdatePrepend" class="input-group-addon">Leaving
												Date</span> <input id="leavingdate" name="employeeExperienceInfoBean[0].leavingDate"
												class="form-control" placeholder="dd-mm-yyyy" type="date"/>

										</div>

									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-sm-2" for="joiningdate"></label>
									<div class="col-sm-6">
										<div class="input-group">
											<span id="joiningdatePrepend" class="input-group-addon">Joining
												Date</span> <input id="joiningdate" name="employeeExperienceInfoBean[0].joiningDate"
												class="form-control" placeholder="dd-mm-yyyy" type="date"/>

										</div>

									</div>
								</div>
                                </fieldset>
            </div>
            </div>
            </div>
        )
    }
}

export default Experience
