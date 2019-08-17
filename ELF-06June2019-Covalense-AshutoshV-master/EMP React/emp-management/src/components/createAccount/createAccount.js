import React, { Component } from 'react'
import Info from './Info'
import Address from './Address'
import OtherInfo from './OtherInfo'
 import Experience from './Experience'
// import Training from './Training'
 import Education from './Education'

export class CreateAccount extends Component {
    render() {
        return (
            <div>
                <form>
                    <Info/>
                    <br/>    
                 <OtherInfo/>
                 <br/>
                 <Address/>
                 <br/>
                 <Education/>
                 <br/>
                 <Education/>
                 <br/>
                 <Experience/>
                 <br/>
                 <Experience/>
                
                </form>
            </div>
        )
    }
}

export default CreateAccount
