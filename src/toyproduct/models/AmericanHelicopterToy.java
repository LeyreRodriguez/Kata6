package toyproduct.models;

import componentfactories.ComponentFactory;
import componentfactories.regionalcomponentfactories.AmericanComponentFactory;
import toyproduct.*;
import toyproduct.components.*;

public class AmericanHelicopterToy implements Toy {

    final private Integer serialNumber;
    private final String type;
    private Engine engine;
    private RotorBlade rotorBlade;
    final private ComponentFactory factory;
    
    
    public AmericanHelicopterToy(Integer serialNumber){
        this.serialNumber = serialNumber;
        this.type = "helicopter";
        this.factory = new AmericanComponentFactory();
    }
    
    @Override
    public Integer getSerialNumber() {
        return serialNumber;
    }
    
    public String getType() {
        return type;
    }
    
    @Override
    public void pack(){
        System.out.printf("Packing '%s' '%d'\n",this.type, this.serialNumber);
    }
    
    @Override
    public void label() {
        System.out.printf("Labelling '%s' '%d'\n",this.type, this.serialNumber);
    
    }
    
    @Override
    public void prepare() {
        this.engine = this.factory.createEngine();
        this.rotorBlade = this.factory.createRotorBlade();
    }

    @Override
    public String toString() {
        return "AmericanHelicopterToy{" + "serialNumber=" + serialNumber + '}';
    }
    
    
}