package test.a;

import main.a.A;
import main.b.BInterface;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ATest {
    @Test(timeout = 10)
    public void test() {
        //BInterface.massive[0] = state -> state + 2;
        A a = new A(state -> state + 2);
        a.doIt();
        assertEquals(2, a.state);
    }

}