/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toyproduct.models;

import toyproduct.Toy;

/**
 *
 * @author Leyre
 */
public class AmericanSubmarineToy implements Toy {

    final private Integer serialNumber;
    final String type;

    public AmericanSubmarineToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
        this.type = "submarine";
    }
    

    @Override
    public Integer getSerialNumber() {
        return this.serialNumber;
    }

    @Override
    public void pack() {
        System.out.printf("Packing '%s' '%d'\n",this.type, this.serialNumber);

    }

    @Override
    public void label() {
        System.out.printf("Labelling '%s' '%d'\n",this.type, this.serialNumber);
    }
    @Override
    public String toString() {
        return "AmericanSubmarineToy{" + "serialNumber=" + serialNumber + '}';
    }
}
