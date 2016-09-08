package com.PrimeGenerator;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int first, second;
        PrimeGenerator generator = new PrimeGenerator();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Please enter the first number in the range");
            String input = bufferedReader.readLine();
            first = Integer.parseInt(input);
            System.out.println("Please enter the second number in the range");
            String input1 = bufferedReader.readLine();
            second = Integer.parseInt(input1);
            System.out.println(generator.generate(first, second));
        }
        catch(Exception e){
            System.err.println("There was an error: " + e.getMessage());
        }
    }
}
