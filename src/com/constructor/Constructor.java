package com.constructor;
public class Constructor {

    // default constructor
    Constructor(){
        double salary=100000;
        double bonus=10000;
        double totalSalary=bonus+salary;
        System.out.println("Total salary is: "+ totalSalary);

    }

    // parameterised constructor
    
    Constructor(double salary,double bonus) {
        double totalSalary=bonus+salary;
        System.out.println("Total salary is: "+ totalSalary);
    }


    public static void main(String[] args) {

        // calling of default constructor
    	Constructor employee = new Constructor();


        //calling of parameterised constructor
    	Constructor employee1 = new Constructor(50000,5000);

    }

}