package com.PrimeGeneratorTester;
import com.PrimeGenerator.PrimeGenerator;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Vince Ashman on 9/8/2016.
 */
public class PrimeGeneratorTester {
    @Test
    public final void whenBothInputsAre1(){
        PrimeGenerator generator = new PrimeGenerator();
        Assert.assertEquals(new ArrayList<>(), generator.generate(1,1));
    }

    @Test
    public final void whenInputsAre0and10(){
        PrimeGenerator generator = new PrimeGenerator();
        Integer[] primesArray = {2,3,5,7};
        List<Integer> primes = Arrays.asList(primesArray);
        Assert.assertEquals(primes, generator.generate(0,10));
    }

    @Test
    public final void whenInputsAre10and0(){
        PrimeGenerator generator = new PrimeGenerator();
        Integer[] primesArray = {2,3,5,7};
        List<Integer> primes = Arrays.asList(primesArray);
        Assert.assertEquals(primes, generator.generate(0, 10));
    }

    @Test
    public final void whenInputsAre7900and7920(){
        PrimeGenerator generator = new PrimeGenerator();
        Integer[] primesArray = {7901,7907,7919};
        List<Integer> primes = Arrays.asList(primesArray);
        Assert.assertEquals(primes, generator.generate(7900,7920));
    }
}
