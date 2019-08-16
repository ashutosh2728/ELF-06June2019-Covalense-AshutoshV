import React, { Component } from 'react'

export class Education extends Component {
    render() {
        return (
            <div>
                <div class="card">
				<div class="card-header" id="headingFive">
					<h2 class="mb-0">
						<button class="btn btn-link collapsed" type="button"
							data-toggle="collapse" data-target="#collapseFive"
							aria-expanded="false" aria-controls="collapseFive">
							Employee Educational Information </button>
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
												id="educationtype" name="employeeEducationalInfoBean[0].educationalInfoPKBean.educationType" class="form-control"
												placeholder="Enter Educational Type" type="text">
										</div>

									</div>
								</div>

								<!-- Prepended text-->
								<div class="form-group">
									<label class="control-label col-sm-4" for="prependedtext"></label>
									<div class="col-sm-4">
										<div class="input-group">
											<span class="input-group-addon">Degree Type</span> <input
												id="degreetype" name="employeeEducationalInfoBean[0].degreetype" class="form-control"
												placeholder="Enter Degree Type" type="text">
										</div>

									</div>
								</div>

								<!-- Prepended text-->
								<div class="form-group">
									<label class="control-label col-sm-4" for="prependedtext"></label>
									<div class="col-sm-4">
										<div class="input-group">
											<span class="input-group-addon">Branch</span> <input
												id="branch" name="employeeEducationalInfoBean[0].branch" class="form-control"
												placeholder="Enter Branch" type="text">
										</div>

									</div>
								</div>

								<!-- Prepended text-->
								<div class="form-group">
									<label class="control-label col-sm-4" for="prependedtext"></label>
									<div class="col-sm-4">
										<div class="input-group">
											<span class="input-group-addon">College Name</span> <input
												id="college" name="employeeEducationalInfoBean[0].college" class="form-control"
												placeholder="Enter College Name" type="text">
										</div>

									</div>
								</div>

								<!-- Prepended text-->
								<div class="form-group">
									<label class="control-label col-sm-4" for="prependedtext"></label>
									<div class="col-sm-4">
										<div class="input-group">
											<span class="input-group-addon">University</span> <input
												id="university" name="employeeEducationalInfoBean[0].university" class="form-control"
												placeholder="Enter University Name" type="text">
										</div>

									</div>
								</div>

								<!-- Prepended text-->
								<div class="form-group">
									<label class="control-label col-sm-4" for="prependedtext"></label>
									<div class="col-sm-4">
										<div class="input-group">
											<span class="input-group-addon">Year of Passout</span> <input
												id="yop" name="employeeEducationalInfoBean[0].yop" class="form-control"
												placeholder="Enter Year of Passout" type="text">
										</div>

									</div>
								</div>

								<!-- Prepended text-->
								<div class="form-group">
									<label class="control-label col-sm-4" for="prependedtext"></label>
									<div class="col-sm-4">
										<div class="input-group">
											<span class="input-group-addon">Percentage</span> <input
												id="percentage" name="employeeEducationalInfoBean[0].percentage" class="form-control"
												placeholder="Enter Percentage" type="number">
										</div>

									</div>
								</div>

								<!-- Prepended text-->
								<div class="form-group">
									<label class="control-label col-sm-4" for="prependedtext"></label>
									<div class="col-sm-4">
										<div class="input-group">
											<span class="input-group-addon">Location</span> <input
												id="location" name="employeeEducationalInfoBean[0].location" class="form-control"
												placeholder="Enter Location" type="text">
										</div>

									</div>
								</div>
            </div>
        )
    }
}

export default Education
