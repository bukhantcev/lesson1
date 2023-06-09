package org.gb;

import java.util.ArrayList;
import java.util.List;

public class BottleOfWaterVendingMachine {

    private final List<Product> products;

    public BottleOfWaterVendingMachine(List<Product> products){
        this.products = products;
    }

    public BottleOfWater getBottleOfWater(String name, int volume){

        for (Product product : products){
            if (product instanceof BottleOfWater){
                if (product.getName() == name && ((BottleOfWater)product).getVolume() == volume){
                    return (BottleOfWater)product;
                }
            }
       }
        return null;
    }

    public Canabis getCanabis(String name, String grade, double weight){

        for (Product product : products){
            if (product instanceof Canabis){
                if (product.getName() == name && ((Canabis)product).getWeight() == weight &&
                        ((Canabis)product).getGrade() == grade){
                    return (Canabis) product;
                }
            }
        }
        return null;


    }

    public BottleOfMilk getBottleOfMilk(String name, int volume, int fat){

        for (Product product : products){
            if (product instanceof BottleOfMilk){
                if (product.getName() == name && ((BottleOfMilk)product).getVolume() == volume &&
                        ((BottleOfMilk)product).getFat() == fat){
                    return (BottleOfMilk) product;
                }
            }
        }
        return null;


    }




}
