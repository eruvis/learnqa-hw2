import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    @Test
    public void testGetClassNumber() {
        MainClass mainClass = new MainClass();
        int classNumber = mainClass.getClassNumber();
        Assert.assertTrue(classNumber + "(classNumber) " + "< 45", classNumber > 45);
    }

}
