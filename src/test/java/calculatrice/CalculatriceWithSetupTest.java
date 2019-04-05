package calculatrice;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatriceWithSetupTest {

    private Calculatrice calculatrice;

    @Before
    public void customSetup() {
        calculatrice = new Calculatrice();
    }

    @Test
    public void test_add_nominal() {
        int res = calculatrice.add(1, 2);

        Assert.assertEquals(3, res);
    }

    @Test
    public void test_sub_nominal() {
        int res = calculatrice.sub(1, 2);

        Assert.assertEquals(-1, res);
    }
}