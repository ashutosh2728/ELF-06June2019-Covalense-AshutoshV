import React, { Component } from 'react'

export class Address extends Component {
    render() {
        return (
                <div className="card">
				<div className="card-header" id="headingThree">
					<h2 className="heading">
					Employee Address Information
					</h2>
				</div>
					<div className="card-body">
						<div className="row">
							<div className="col">
									<label for="AddressType">Address Type</label> <input type="text"
										name="addressInfoBeanList[0].addressPKBean.addressType" className="form-control" placeholder="Enter AddressType"/>
								</div>
								<div className="col">
									<label for="exampleInputCity">City</label> <input type="text" name="addressInfoBeanList[0].city"
										className="form-control" placeholder="Enter City"/>
								</div>
							</div>
							<div className="row">
								<div className="col">
									<label for="exampleInputState">State</label> <input type="text" name="addressInfoBeanList[0].state"
										className="form-control" placeholder="Enter State"/>
								</div>
							</div>
							<div className="row">
								<div className="col">
									<label for="exampleInputAddress1">Address1</label> <input
										type="text" name="addressInfoBeanList[0].address1" className="form-control"
										placeholder="Enter Address Line1"/>
								</div>
								<div className="col">
									<label for="exampleInputCountry">Country</label> <input name="addressInfoBeanList[0].country"
										type="text" className="form-control" placeholder="Enter Country"/>
								</div>
							</div>
							<div className="row">
								<div className="col">
									<label for="exampleInputAddress2">Address2</label> <input
										type="text" className="form-control" name="addressInfoBeanList[0].address2"
										placeholder="Enter Address Line2"/>
								</div>
								<div className="col">
									<label for="exampleInputPincode">Pincode</label> <input name="addressInfoBeanList[0].pincode"
										type="text" className="form-control" placeholder="Enter Pincode"/>
								</div>
							</div>
							<div className="row">

								<div className="col-6">
									<label for="exampleInputLandmark">Landmark</label> <input name="addressInfoBeanList[0].landmark"
										type="text" className="form-control" placeholder="Enter Landmark"/>
								</div>
                                </div>
            </div>
		
			
			<div className="card-header" id="headingThree">
					<h2 className="heading">
					Employee Address Information
					</h2>
				</div>
					<div className="card-body">
						<div className="row">
							<div className="col">
									<label for="AddressType">Address Type</label> <input type="text"
										name="addressInfoBeanList[0].addressPKBean.addressType" className="form-control" placeholder="Enter AddressType"/>
								</div>
								<div className="col">
									<label for="exampleInputCity">City</label> <input type="text" name="addressInfoBeanList[0].city"
										className="form-control" placeholder="Enter City"/>
								</div>
							</div>
							<div className="row">
								<div className="col">
									<label for="exampleInputState">State</label> <input type="text" name="addressInfoBeanList[0].state"
										className="form-control" placeholder="Enter State"/>
								</div>
							</div>
							<div className="row">
								<div className="col">
									<label for="exampleInputAddress1">Address1</label> <input
										type="text" name="addressInfoBeanList[0].address1" className="form-control"
										placeholder="Enter Address Line1"/>
								</div>
								<div className="col">
									<label for="exampleInputCountry">Country</label> <input name="addressInfoBeanList[0].country"
										type="text" className="form-control" placeholder="Enter Country"/>
								</div>
							</div>
							<div className="row">
								<div className="col">
									<label for="exampleInputAddress2">Address2</label> <input
										type="text" className="form-control" name="addressInfoBeanList[0].address2"
										placeholder="Enter Address Line2"/>
								</div>
								<div className="col">
									<label for="exampleInputPincode">Pincode</label> <input name="addressInfoBeanList[0].pincode"
										type="text" className="form-control" placeholder="Enter Pincode"/>
								</div>
							</div>
							<div className="row">

								<div className="col-6">
									<label for="exampleInputLandmark">Landmark</label> <input name="addressInfoBeanList[0].landmark"
										type="text" className="form-control" placeholder="Enter Landmark"/>
								</div>
                                </div>
            </div>
			</div>
           



			
        )
    }
}

export default Address
