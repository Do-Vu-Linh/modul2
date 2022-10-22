package bai11.btth;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> animal = new Stack<>() ;
       for(int i = 0;i<10;i++){
           animal.push((int) (Math.random()*100)+1) ;
       }
        System.out.println(animal);
       Stack <Integer> revert_animal = new Stack<>();
       for (int i = 0;i<10;i++){
    revert_animal.push(animal.pop());
       }
        System.out.println(revert_animal);
    }


    }


