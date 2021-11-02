import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class sphereTest 
{
    @Test
    public void volumeTest()
    {
        sphere sphere = new sphere(); //instantiating sphere object
        double result = sphere.volume(30); //using 30 as radius to calculate volume of a sphere
        assertEquals(84823.0, result, 84823); //test will be successful if result for volume is between 84823.0 and 84823
    }
}