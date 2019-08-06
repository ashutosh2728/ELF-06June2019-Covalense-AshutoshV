function Header(props) {
    return React.createElement('h1',null,'Header');
}

function  Footer(){
    return React.createElement('h1',null,'Footer');
}
function  Content(){
    return React.createElement('h1',null,'Content');
}
const header = React.createElement(Header,{item:['aashu']});
const footer = Footer.createElement(Footer);
const content = Footer.createElement(Content);
const myApp = React.createElement('div',null,header,header,footer,content)
//React.createElement('div',null,'Header')
ReactDOM.render(myApp,document.getElementById('app'));