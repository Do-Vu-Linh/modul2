package bai4.hinhchunhat;

import bai4.hinhchunhat.Rectangle;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the width :");
            double width = sc.nextDouble() ;
            System.out.println("Enter the height :");
            double height = sc.nextDouble() ;
            Rectangle rectangle = new Rectangle(width,height);
            System.out.println("Your rectangle\n" +rectangle.display());
            System.out.println("Area is : " + rectangle.getArea());
            System.out.println("Permirate is : " + rectangle.getPerimeter());

        }

    }

