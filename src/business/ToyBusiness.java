package business;

import toyproduct.*;
import toyproduct.models.*;
import factories.SerialNumberGenerator;
import factories.ToyFactory;



public class ToyBusiness {
    final private ToyFactory toyFactory;
    
    public ToyBusiness(ToyFactory toyFactory){
        this.toyFactory = toyFactory;
    }
    
    public Toy produceToy(String type){
        return this.toyFactory.produceToy(type);
    }  
    
    
}