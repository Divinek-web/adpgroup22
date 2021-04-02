/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adpgroup22;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Divine Kamalandua 219212031
 */
public class DivProgramTest {
    
   private DivProgram Display1;
   private DivProgram Display2;
   private DivProgram Display3;
    
   
    @BeforeEach
    public void setUp() {
   Display1=  new DivProgram();
   Display2= new DivProgram();
   Display3=Display1;
   
    }
    
    
//Equality test
    @Test
    public void testEquality()
    {
    assertEquals(Display1,Display3);
    assertNotEquals(Display1,Display2);
   
    }
    
    @Test
    public void testIdentity()
    {
     assertSame(Display1,Display3);
     assertNotSame(Display1,Display2);
      
    }
    
   
    //Timeout test
    @Test
    @Timeout(value=500,unit=TimeUnit.MILLISECONDS)
    public void timeoutTest(){
        
        assertEquals(Display1,Display3);
    }
    
     //Disabled test
    @Test
    @Disabled("because it will fail")
    public void disabledTest()
    {
    assertEquals(Display1,Display3);
    }
    //test fail
    @Test
    public void failingTest()
    {
    assertEquals(Display1,Display2);
    fail("purposly failing this test");
    }
    
   
    
}
