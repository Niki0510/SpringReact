/*import { ReactComponent } from '*.svg';*/
import React from 'react';
import ProductService from './ProductService';


export default class ProdComponent extends React.Component
{
constructor(props)
{
    super(props)
    this.state={
        products:[]
    }

}
componentDidMount(){
ProductService.getproducts().then((response) => {
    this.setState({products:response.data})
});

}
render(){ 
return(
    <div>
        <table className="table table-stripped">
            <thead>
            <tr>
                <td><h5>Product id</h5></td>
                <td><h5>Product Name</h5></td>
            </tr>
            </thead>
            <tbody>
                   {
                    this.state.products.map(
                        product =>
                        <tr key={product.pid}>
                            <td>{product.pid}</td>
                            <td>{product.pName}</td>

                            </tr>
                     )
                    }
                </tbody>

            </table>

    </div>
)
}
}