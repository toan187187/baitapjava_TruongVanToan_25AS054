package BT3_1;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter complex number 1: ");
        double real1 = sc.nextDouble();
        double imag1 = sc.nextDouble();
        MyComplex c1 = new MyComplex(real1, imag1);

        System.out.println("Enter complex number 2: ");
        double real2 = sc.nextDouble();
        double imag2 = sc.nextDouble();
        MyComplex c2 = new MyComplex(real2, imag2);

        System.out.println("Number 1 is: "+c1.toString());
        if (c1.isReal()){
            System.out.println(c1.toString()+"is a pure real number");
        }
        else {
            System.out.println(c1.toString() + "is not a pure real number");
        }
        if (c1.isImaginary()){
            System.out.println(c1.toString()+"is a pure imaginary number");
        }
        else{
            System.out.println(c1.toString()+"is not a pure imaginary number");
        }
        System.out.println("Number 2 is: "+c2.toString());
        if (c2.isReal()){
            System.out.println(c2.toString()+"is a pure real number");
        }
        else {
            System.out.println(c2.toString()+"is not a pure real number");
        }
        if (c2.isImaginary()){
            System.out.println(c2.toString()+"is a pure imaginary number");
        }
        else{
            System.out.println(c2.toString()+"is not a pure imaginary number");
        }
        MyComplex sum = c1.addNew(c2);
        System.out.println(c1.toString()+" + "+ c2.toString()+" = "+ sum.toString());
    }
}
