import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class coneTest 
{
    @Test
    public void volumeTest()
    {
        cone cone = new cone(); //instantiating cone object
        double result = cone.volume(12, 25); //using 12 as radius and 25 as height to calculate volume of a cone
        assertEquals(3619.1147, result, 3619); //test will be successful if result for volume is between 3619.1147 and 3619
    }
}
