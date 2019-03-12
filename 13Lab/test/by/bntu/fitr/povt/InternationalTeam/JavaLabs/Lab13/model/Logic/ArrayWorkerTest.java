package by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab13.model.Logic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//@RunWith(Parameterized.class)
public class ArrayWorkerTest {
    /*
    private int[][] a;
    private String expected;
    
    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = {{10}} , "[[10]]"};
        
        return Arrays.asList(data);
    }
    
    //{{-10, -7, 6, -7, -3}, {4, 1, -6, 10, 8}, {3, -5, 7, -2, -7}, {9, 3, -1, 6, 3}, {8, 1, -2, -3, 2}}, {{8, 9, 3, 4, -10}, {1, 3, -5, 1, -7}, {-2, -1, 7, -6, 6}, {-3, 6, -2, 10, -7}, {2, 3, -7, 8, -3}}
    
    
    public ArrayWorkerTest(int[][] a, String expected){
        this.a = a;
        this.expected = expected;
    }
    
    */
    /*
   
          ---------------------------------------------------------------------
   
    */
    
    @Test
    public void testSortByCharacteristic1() {
        int[][] a = {{10}};
        String expected = "[[10]]";
        
        ArrayWorker instance = new ArrayWorker();
        assertEquals(expected, instance.SortByCharacteristic(a));
    }
    
    
    @Test
    public void testSortByCharacteristic2() {
        int[][] a = {{-6, -7, 10}, {3, -2, 6}, {3, -5, 4}};
        String expected = "[[10, 6, 4], [-7, -2, -5], [-6, 3, 3]]";
        
        ArrayWorker instance = new ArrayWorker();
        assertEquals(expected, instance.SortByCharacteristic(a));
    }
    
    
    @Test
    public void testSortByCharacteristic3() {
        int[][] a = {{10, 6, 0, 4}, {-8, -7, -3, 5}, {-10, 5, -10, -7}, {-1, 8, -1, -9}};
        String expected = "[[10, -8, -10, -1], [6, -7, 5, 8], [4, 5, -7, -9], [0, -3, -10, -1]]";
        
        ArrayWorker instance = new ArrayWorker();
        assertEquals(expected, instance.SortByCharacteristic(a));
    }
    
    
}
