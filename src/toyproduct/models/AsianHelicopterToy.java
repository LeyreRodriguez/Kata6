package toyproduct.models;

import componentfactories.ComponentFactory;
import componentfactories.regionalcomponentfactories.AmericanComponentFactory;
import componentfactories.regionalcomponentfactories.AsianComponentFactory;
import toyproduct.*;
import toyproduct.components.Engine;
import toyproduct.components.RotorBlade;
import toyproduct.components.Wheel;

public class AsianHelicopterToy implements Toy {

    final private Integer serialNumber;
    final String type;
    private Engine engine;
    private RotorBlade rotorBlade;
    final private ComponentFactory factory;
    
    public AsianHelicopterToy(Integer serialNumber){
        this.serialNumber = serialNumber;
        this.type = "helicopter";
        this.factory = new AsianComponentFactory();
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
        return "AsianHelicopterToy{" + "serialNumber=" + serialNumber + '}';
    }
    
    
}