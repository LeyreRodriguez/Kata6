package toys;

import toyproduct.*;
import toyproduct.models.*;



public class ToyBusiness {
    final private SerialNumberGenerator generator = new SerialNumberGenerator();
    
    public Toy createToy(String type){
        
        switch(type) {
            case "car":
                CarToy car = new CarToy(this.generator.next());
                car.pack();
                car.label();
                return car; 
            case "helicopter":
                HelicopterToy helicopter = new HelicopterToy(this.generator.next());
                helicopter.pack();
                helicopter.label();
                return helicopter;
            default:
                return null;
        }
        
    }
    
}