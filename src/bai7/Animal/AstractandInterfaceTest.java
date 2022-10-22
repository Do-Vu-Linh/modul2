package bai7.Animal;

import bai7.edible.Edible;

public class AstractandInterfaceTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

//            không hiểu đoạn tại sao phải xét istanceof của animal, vì animal và edibler ko liên quan đến nhau
            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howtoEat());


            }
        }
    }
}
