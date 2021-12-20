
package componentfactories;

import toyproduct.components.Engine;
import toyproduct.components.RotorBlade;
import toyproduct.components.Wheel;

public abstract class ComponentFactory {
    public abstract Wheel createWheel();
    public abstract Engine createEngine();
    public abstract RotorBlade createRotorBlade();
}
