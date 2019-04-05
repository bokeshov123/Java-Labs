package by.bntu.fitr.povt.InternationalTeam.Task4.model;

import by.bntu.fitr.povt.InternationalTeam.Task4.model.entity.Matrix;
import by.bntu.fitr.povt.InternationalTeam.Task4.model.Logic.ArrayWorker;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayWorkerTest {
    private Matrix matrix;
    
    public ArrayWorkerTest() {
    }

    @Test
    public void FindSumOfColumns() {
        Matrix matrix = new Matrix(new int [][] {
                {10, 6, 0, 4}, 
                {-8, -7, -3, 5}, 
                {-10, 5, -10, -7}, 
                {-1, 8, -1, -9} 
        });
                
        
        String expected = "10 -8 -10 -1 6 -7 5 8 4 5 -7 -9 0 -3 -10 -1 ";
        
        String result = ArrayWorker.SortByCharacteristic(matrix);
        assertEquals(expected, result);
    }
    
    
    @Test
    public void FindSumOfColumns1() {
        String expResult = "[]";
        
        String result = ArrayWorker.SortByCharacteristic(null);
        assertEquals(expResult, result);
    }
    
    
}
