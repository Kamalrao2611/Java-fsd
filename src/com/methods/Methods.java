package com.methods;
public class Methods {

    public int add(int a,int b) {
        return a+b;
    }

    // call by value
    public int sub(int a,int b) {
        return a-b;
    }

    // method overloading
    public int add(int a,int b,int c) {
        return a+b+c;
    }



    public static void main(String[] args) {
        Methods methodObj= new Methods();

        int sumOfTwoNumber=methodObj.add(1, 2);
        System.out.println("Sum of two number is: "+sumOfTwoNumber);

        System.out.println("Subtraction of two number is:"+methodObj.sub(3, 4));

        //method overloading
        int sumOfThreeNumber = methodObj.add(1, 2, 3);
        System.out.println("Sum of three numbers are:" +sumOfThreeNumber);
    }

}