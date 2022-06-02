import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Assert;

public  class SampleCalculatorTest{

    /*

    }*/
    private SampleCalculator calObj = new SampleCalculator();



    @Test
    public void test() {
        Assert.assertEquals("Hello, Neo", calObj.greeting("Neo"));
    }

    @Test
    public void test2() {

        int sum = calObj.evaluate("1+2+3");
        assertEquals(6, sum);
    }
}