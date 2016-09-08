package com.PrimeGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.JarEntry;

/**
 * Created by Vince Ashman on 9/8/2016.
 */
public class PrimeGenerator implements PrimeNumberGenerator {

    public List<Integer> generate(int startingValue, int endingValue){
        //generate primes
        int greater, less;

        //throw new UnsupportedOperationException();
        //figure out which number is larger
        if(startingValue > endingValue){
            greater = startingValue;
            less = endingValue;
        }
        else{
            greater = endingValue;
            less = startingValue;
        }
        List<Integer> listOfPrimes = new ArrayList<Integer>();
        for(int i = less; i <= greater; i++){
            if(isPrime(i)){
                listOfPrimes.add(i);
            }
        }
        return listOfPrimes;

    }
    public boolean isPrime(int value){
        //do some more stuff
        if(value <= 1){
            return false;
        }
        else if(value <= 3){
            return true;
        }
        else if (value % 2 == 0 || value % 3 == 0){
            return false;
        }
        int i = 5;
        while(i*i <= value){
            if(value % i == 0 || value % (i+2) == 0){
                return false;
            }
            i += 6;
        }
        return true;
    }
}
