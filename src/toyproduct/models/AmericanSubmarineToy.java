/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toyproduct.models;

import componentfactories.ComponentFactory;
import componentfactories.regionalcomponentfactories.AmericanComponentFactory;
import toyproduct.Toy;
import toyproduct.components.Engine;

/**
 *
 * @author Leyre
 */
public class AmericanSubmarineToy implements Toy {

    final private Integer serialNumber;
    final String type;
    final private ComponentFactory factory;
    private Engine engine;

    public AmericanSubmarineToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
        this.type = "submarine";
        this.factory = new AmericanComponentFactory();
    }
    

    @Override
    public Integer getSerialNumber() {
        return this.serialNumber;
    }

    @Override
    public void pack() {
        System.out.printf("Packing '%s' '%d'\n",this.type, this.serialNumber);

    }

    @Override
    public void label() {
        System.out.printf("Labelling '%s' '%d'\n",this.type, this.serialNumber);
    }
    
    @Override
    public void prepare() {
        this.engine = this.factory.createEngine();
        
    }
    
    @Override
    public String toString() {
        return "AmericanSubmarineToy{" + "serialNumber=" + serialNumber + '}';
    }
}
