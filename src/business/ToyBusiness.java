package business;

import toyproduct.*;
import toyproduct.models.*;
import factories.SerialNumberGenerator;
import factories.ToyFactory;
import java.util.HashMap;
import java.util.Map;



public class ToyBusiness {
    final private Map<String, ToyFactory> toyFactories = new HashMap<>();
    final private SerialNumberGenerator generator = new SerialNumberGenerator();
    
    public void add(String type, ToyFactory toyFactory){
        this.toyFactories.put(type, toyFactory);
    }
    
    public Toy produceToy(String type){
        return toyFactories.get(type).produceToy(generator.next());
    }  
    
    
}