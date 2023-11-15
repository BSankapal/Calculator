import org.example.Main;
import org.junit.Assert;
import org.junit.Test;
public class CalculatorTest {
    @Test
    public void test_add_positive(){
        int a = 1;
        int b = 1;
        int expectedResult = 2;
        Assert.assertEquals(expectedResult, Main.add(a,b));
    }
    @Test
    public void test_add_negative(){
        int a = 10;
        int b = 20;
        int expectedResult = 0;
        Assert.assertNotEquals(expectedResult, Main.add(a,b));
    }

    @Test
    public void test_sub_positive(){
        int a = 2;
        int b = 2;
        int expectedResult = 0;
        Assert.assertEquals(expectedResult, Main.sub(a, b));
    }
    @Test
    public void test_sub_negative(){
        int a = 2;
        int b = 2;
        int expectedResult = 1;
        Assert.assertNotEquals(expectedResult, Main.sub(a, b));
    }@Test
    public void test_mul_positive(){
        int a = 1;
        int b = 3;
        int expectedResult = 3;
        Assert.assertEquals(expectedResult, Main.mul(a, b));
    }
    @Test
    public void test_mul_negative(){
        int a = 1;
        int b = 2;
        int expectedResult = 0;
        Assert.assertNotEquals(expectedResult, Main.mul(a, b));
    }@Test
    public void test_div_positive(){
        int a = 4;
        int b = 2;
        int expectedResult = 2;
        Assert.assertEquals(expectedResult, Main.div(a,b));
    }
    @Test
    public void test_div_negative(){
        int a = 4;
        int b = 2;
        int expectedResult = 0;
        Assert.assertNotEquals(expectedResult, Main.div(a,b));
    }
}
