import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void Before(){
        printer = new Printer(100, 200);
    }

    @Test
    public void checkPaper(){
        assertEquals(100, printer.checkPaper());
    }

    @Test
    public void print(){
        printer.print(2,10);
        assertEquals(80, printer.checkPaper());
    }

    @Test
    public void refill(){
        printer.refill();
        assertEquals(100, printer.checkPaper());
    }

    @Test
    public void checkToner__full(){
        assertEquals(200, printer.checkToner());
    }

    @Test
    public void checkToner_printTen(){
        printer.print(2,5);
        assertEquals(190, printer.checkToner());
    }

    @Test
    public void checkToner_printMore(){
        printer.print(2,5);
        printer.print(10, 5);
        assertEquals(140, printer.checkToner());
    }


}
