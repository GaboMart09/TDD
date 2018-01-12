/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDD;

import org.junit.Test;
import static org.junit.Assert.*;


public class NumeroPrimoTest {
    
    public NumeroPrimoTest() {
    }

    @Test
    public void testCalcularNumPrimo() {
        
       NumeroPrimo primo= new NumeroPrimo();
       assertTrue(primo.CalcularNumPrimo(4));
        
    }
    
}
