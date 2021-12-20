

import business.*;
import factories.regionalfactories.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toyproduct.*;
import toyproduct.models.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Toy> toys = new ArrayList<>();
        ToyBusiness toyBusiness = new ToyBusiness();
        toyBusiness.add("car", new AmericanCarToyFactory());
        toyBusiness.add("helicopter", new AsianCarToyFactory());
        toyBusiness.add("submarine", new AmericanSubmarineToyFactory());

        
        Scanner in = new Scanner(System.in);
        String line = "";
        while(!line.equals("exit")) {
            line = in.nextLine();
            
            switch (line) {
                case "car":
                case "helicopter":
                case "submarine":
                    toys.add(toyBusiness.produceToy(line));
                    System.out.println(
                                        "Built toys: "+toys.stream()
                                                .map(c -> c.toString())
                                                .collect(Collectors.joining(", ")));
                    break;
                case "exit":
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Command unknown!");
            }
            
        }
        
    }
    
}
