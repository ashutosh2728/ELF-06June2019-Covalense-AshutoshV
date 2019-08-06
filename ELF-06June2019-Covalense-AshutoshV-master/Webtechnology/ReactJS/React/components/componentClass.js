class Header extends React.Component{
    constructor(props){
        super(props);
        console.log(this.props);
    }



    render(){
    return React.createElement('h1',null,'Header');
}
}

class  Footer extends React.Component{
    render( ) {
    return React.createElement('h1',null,'Footer');
    }
}
class  Content extends React.Component{ 
    constructor(props){
        super(props);
        console.log(this.props);
    }
    render(){
    return  React.createElement('ul',null,
     this.props.item.map((value,index)=>{
        return  React.createElement('li',{key:index},value)
     })
     
     ) }
}
const items= ['bag','pencil','book'];
const header = React.createElement(Header,{item:['aashu']});
const footer = React.createElement(Footer);
const content = React.createElement(Content,{item:items});
const myApp = React.createElement('div',null,header,footer,content)
//React.createElement('div',null,'Header')
ReactDOM.render(myApp,document.getElementById('app'));