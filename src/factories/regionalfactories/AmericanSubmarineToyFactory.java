/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factories.regionalfactories;

import factories.ToyFactory;
import toyproduct.Toy;
import toyproduct.models.*;
import toyproduct.models.AmericanSubmarineToy;

public class AmericanSubmarineToyFactory extends ToyFactory{

    
    @Override
    public Toy createToy(Integer serialNumber){
        return new AmericanSubmarineToy(serialNumber);
    }
}
