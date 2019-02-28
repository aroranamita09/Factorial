package com.stackroute;

public class Factorials {
    static void intFactorial()
    {
        int i = 0;
        int intVar = 1;
        while(intVar > 0)
        {
            i++;
            System.out.println("The factorial of " + (i-1) + " is : " + intVar);
            intVar = intVar * i;
        }
        System.out.println("The factorial of " + i + " is out of range");
    }

    static void longFactorial()
    {
        int i = 0;
        long longVar = 1;
        while(longVar > 0)
        {
            i++;
            System.out.println("The factorial of " + (i-1) + " is : " + longVar);
            longVar = longVar * i;
        }
        System.out.println("The factorial of " + i + " is out of range");
    }

    public static void main(String args[])
    {
        intFactorial();
        System.out.println();
        longFactorial();
    }
}
