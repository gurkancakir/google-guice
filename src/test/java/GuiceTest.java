import com.gurkan.guice.CalculaterManager;
import com.gurkan.guice.factory.Factory;
import org.junit.Assert;
import org.junit.Test;

public class GuiceTest {

    @Test
    public void test() {
        CalculaterManager calculater = Factory.get(CalculaterManager.class);
        int result = calculater.calculate(10, 2);
        Assert.assertEquals(20, result); //multiply impl
    }
}
