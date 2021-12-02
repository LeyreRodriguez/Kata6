package business;

import toyproduct.*;
import toyproduct.models.*;
import toys.SerialNumberGenerator;



public abstract class ToyBusiness {
    final protected SerialNumberGenerator generator = new SerialNumberGenerator();
    
    public abstract Toy createToy(String type);
       
    
    
}