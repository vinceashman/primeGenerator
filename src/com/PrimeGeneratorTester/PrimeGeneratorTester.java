package com.PrimeGeneratorTester;
import com.PrimeGenerator.PrimeGenerator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Vince Ashman on 9/8/2016.
 */
public class PrimeGeneratorTester {
    @Test
    public final void whenBothInputsAreTheSame(){
        PrimeGenerator generator = new PrimeGenerator();
        Assert.assertEquals(1, generator.generate(1,1));
    }
}
