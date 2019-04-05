package calculatrice;


import org.junit.Assert;
import org.junit.Test;

public class CalculatriceTest {

    @Test
    public void test_add_nominal() {
        Calculatrice calculatrice = new Calculatrice();
        int res = calculatrice.add(1, 2);

        Assert.assertEquals(3, res);
    }

    @Test
    public void test_sub_nominal() {
        Calculatrice calculatrice = new Calculatrice();
        int res = calculatrice.sub(1, 2);

        Assert.assertEquals(-1, res);
    }
}