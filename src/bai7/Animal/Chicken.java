package bai7.Animal;

import bai7.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound(){
        return " Chicken cluck- cluck" ;
    }
    @Override
    public  String howtoEat(){
        return "could be fried" ;
    }
}
