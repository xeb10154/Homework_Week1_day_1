import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle bottle;

    @Before
    public void Before(){
        bottle = new WaterBottle(100);
    }

    @Test
    public void getVolume(){
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void drinkWater(){
        bottle.drinkWater();
        assertEquals(90, bottle.getVolume());
    }

    @Test
    public void drinkWater__threeTimes(){
        bottle.drinkWater();
        bottle.drinkWater();
        bottle.drinkWater();
        assertEquals(70, bottle.getVolume());
    }

    @Test
    public void emptyBottle(){
        bottle.emptyBottle();
        assertEquals(0, bottle.getVolume());
    }

    @Test
    public void fillBottle(){
        bottle.fillBottle();
        assertEquals(100, bottle.getVolume());
    }

}
