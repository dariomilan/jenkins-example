package com.techprimers.testing;

public class FizzBuzz {
public static void main(String[] args){
        System.out.println("Hello " +  play(Integer.parseInt(args[0]) ));
    }
    
    
    
    public String play(int number) {
 
        if (number == 0) throw new IllegalArgumentException("Number must not be 0");
        if (number % 3 == 0) return "Fizz";
        if (number % 5 == 0) return "Buzz";


        return String.valueOf(number);
    }
}
