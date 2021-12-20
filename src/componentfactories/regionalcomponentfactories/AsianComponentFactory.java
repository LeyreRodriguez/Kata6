/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentfactories.regionalcomponentfactories;

import componentfactories.ComponentFactory;
import toyproduct.components.Engine;
import toyproduct.components.RotorBlade;
import toyproduct.components.Wheel;
import toyproduct.components.american.AmericanEngine;
import toyproduct.components.american.AmericanRotorBlade;
import toyproduct.components.american.AmericanWheel;
import toyproduct.components.asian.AsianEngine;
import toyproduct.components.asian.AsianRotorBlade;
import toyproduct.components.asian.AsianWheel;

/**
 *
 * @author Leyre
 */
public class AsianComponentFactory extends ComponentFactory {

    @Override
    public Wheel createWheel() {
        return new AsianWheel();
    }

    @Override
    public Engine createEngine() {
        return new AsianEngine();    
    }

    @Override
    public RotorBlade createRotorBlade() {
        return new AsianRotorBlade();
    }
    
}
