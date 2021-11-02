import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class cylinderTest 
{
    @Test
    public void volumeTest()
    {
        cylinder cylinder = new cylinder(); //instantiating cylinder object
        double result = cylinder.volume(10, 32); //using 10 as radius and 32 as height to calculate volume of a cylinder
        assertEquals(10053.097, result, 10053); //test will be successful if result for volume is between 10053.097 and 10053
    }
}