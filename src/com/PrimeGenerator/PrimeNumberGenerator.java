package com.PrimeGenerator;

import java.util.List;

/**
 * Created by Vince Ashman on 9/8/2016.
 */

public interface PrimeNumberGenerator{
        List<Integer> generate(int startingValue, int endingValue);
        boolean isPrime(int value);
}
