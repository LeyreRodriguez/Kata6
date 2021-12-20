package toyproduct.models;

import componentfactories.ComponentFactory;
import componentfactories.regionalcomponentfactories.AmericanComponentFactory;
import toyproduct.*;
import toyproduct.components.*;

public class AmericanCarToy implements Toy {

    final private Integer serialNumber;
    private final String type;
    private Wheel wheels[] = new Wheel[4];
    private Engine engine;
    final private ComponentFactory factory;
    
    
    public AmericanCarToy(Integer serialNumber){
        this.serialNumber = serialNumber;
        this.type = "car";
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
        for ( int i = 0; i < this.wheels.length-1; i++) {
            this.wheels[i] = this.factory.createWheel();
        }
    }
    
    

    @Override
    public String toString() {
        return "AmericanCarToy{" + "serialNumber=" + serialNumber + '}';
    }
    
    
}
