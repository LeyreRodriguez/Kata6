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

/**
 *
 * @author Leyre
 */
public class AmericanComponentFactory extends ComponentFactory {

    @Override
    public Wheel createWheel() {
        return new AmericanWheel();
    }

    @Override
    public Engine createEngine() {
        return new AmericanEngine();    
    }

    @Override
    public RotorBlade createRotorBlade() {
        return new AmericanRotorBlade();
    }
    
}
