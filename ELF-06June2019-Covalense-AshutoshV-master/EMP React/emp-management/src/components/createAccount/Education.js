import React, { Component } from 'react'

export class Education extends Component {
    render() {
        return (
			<div>
				<div className="card-header">
					<h2 className="heading">
							Employee Educational Information 
					</h2>
				</div>
				<div>
					<div className="card-body">
								<legend className="h3" >Education
									Details</legend>
<fieldset>
								<div className="form-group">
									<label className="control-label col-sm-4" for="prependedtext"></label>
									<div className="col-sm-4">
										<div className="input-group">
											<span className="input-group-addon">Education Type</span> <input
												id="educationtype" name="employeeEducationalInfoBean[0].educationalInfoPKBean.educationType" className="form-control"
												placeholder="Enter Educational Type" type="text"/>
										</div>

									</div>
								</div>

								<div className="form-group">
									<label className="control-label col-sm-4" for="prependedtext"></label>
									<div className="col-sm-4">
										<div className="input-group">
											<span className="input-group-addon">Degree Type</span> <input
												id="degreetype" name="employeeEducationalInfoBean[0].degreetype" className="form-control"
												placeholder="Enter Degree Type" type="text"/>
										</div>

									</div>
								</div>

								<div className="form-group">
									<label className="control-label col-sm-4" for="prependedtext"></label>
									<div className="col-sm-4">
										<div className="input-group">
											<span className="input-group-addon">Branch</span> <input
												id="branch" name="employeeEducationalInfoBean[0].branch" className="form-control"
												placeholder="Enter Branch" type="text"/>
										</div>

									</div>
								</div>

								<div className="form-group">
									<label className="control-label col-sm-4" for="prependedtext"></label>
									<div className="col-sm-4">
										<div className="input-group">
											<span className="input-group-addon">College Name</span> <input
												id="college" name="employeeEducationalInfoBean[0].college" className="form-control"
												placeholder="Enter College Name" type="text"/>
										</div>

									</div>
								</div>

					
								<div className="form-group">
									<label className="control-label col-sm-4" for="prependedtext"></label>
									<div className="col-sm-4">
										<div className="input-group">
											<span className="input-group-addon">University</span> <input
												id="university" name="employeeEducationalInfoBean[0].university" className="form-control"
												placeholder="Enter University Name" type="text"/>
										</div>

									</div>
								</div>

								
								<div className="form-group">
									<label className="control-label col-sm-4" for="prependedtext"></label>
									<div className="col-sm-4">
										<div className="input-group">
											<span className="input-group-addon">Year of Passout</span> <input
												id="yop" name="employeeEducationalInfoBean[0].yop" className="form-control"
												placeholder="Enter Year of Passout" type="text"/>
										</div>

									</div>
								</div>

								<div className="form-group">
									<label className="control-label col-sm-4" for="prependedtext"></label>
									<div className="col-sm-4">
										<div className="input-group">
											<span className="input-group-addon">Percentage</span> <input
												id="percentage" name="employeeEducationalInfoBean[0].percentage" className="form-control"
												placeholder="Enter Percentage" type="number"/>
										</div>

									</div>
								</div>

								<div className="form-group">
									<label className="control-label col-sm-4" for="prependedtext"></label>
									<div className="col-sm-4">
										<div className="input-group">
											<span className="input-group-addon">Location</span> <input
												id="location" name="employeeEducationalInfoBean[0].location" className="form-control"
												placeholder="Enter Location" type="text"/>
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

export default Education
