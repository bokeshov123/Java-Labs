package by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab13.model.logic;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Assume.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CalculatorTest {
    
    private int a;
    private int b;
    private int expected;
    
    public CalculatorTest(int a, int b, int expected){
        this.a = a;
        this.b = b;
        this.expected = expected;
    }
    
    @Parameters
    public static Collection<Object[]> getParameters(){
        return Arrays.asList(new Object[][] { 
            {1, 2, 3},
            {2, 3, 5},
            {5, 10, 15},
            {3, 6, 9},
            {5, 6, 10} 
        });
    }
    
    @Test
    public void testSum() {
        Calculator instance = new Calculator();
        int result = instance.sum(a, b);
        assertEquals(expected, result);
        
        //fail("The test case is a prototype.");
    }
    
}
