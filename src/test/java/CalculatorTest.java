import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calc;

    @Before
    public void before(){
        calc = new Calculator();
    }

    @Test
    public void addNum(){
        assertEquals(5, calc.addNum(2, 3), 0.01);
    }

    @Test
    public void subNum(){
        assertEquals(5, calc.subNum(12, 7), 0.01);
    }

    @Test
    public void divNum(){
        assertEquals(2, calc.divNum(4,2), 0.01);
    }

    @Test
    public void divNum__double(){
        assertEquals(2.5, calc.divNum(5,2), 0.01);
    }

    @Test
    public void multiplyNum(){
        assertEquals(10, calc.multiplyNum(5,2), 0.01);
    }

}
