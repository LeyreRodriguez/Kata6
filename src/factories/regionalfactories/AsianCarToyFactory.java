package factories.regionalfactories;

import factories.ToyFactory;
import toyproduct.Toy;
import toyproduct.models.AmericanCarToy;
import toyproduct.models.AmericanHelicopterToy;
import toyproduct.models.AsianCarToy;
import toyproduct.models.AsianHelicopterToy;


public class AsianCarToyFactory extends ToyFactory{
    @Override
    public Toy createToy(Integer serialNumber){
        return new AsianCarToy(serialNumber);

    }
}
