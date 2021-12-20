/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factories.regionalfactories;

import factories.ToyFactory;
import toyproduct.Toy;
import toyproduct.models.AmericanCarToy;
import toyproduct.models.AmericanHelicopterToy;

/**
 *
 * @author Leyre
 */
public class AmericanToyFactory extends ToyFactory{
    @Override
    public Toy createToy(String type){
        
        switch(type) {
            case "car":
                return new AmericanCarToy(this.generator.next());
            case "helicopter":
                return new AmericanHelicopterToy(this.generator.next());
            default:
                return null;
        }

    }
}
