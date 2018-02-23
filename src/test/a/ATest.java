package test.a;

import static org.junit.Assert.assertEquals;

import main.a.A;
import org.junit.Test;

public class ATest {

  @Test
  public void test() {
    //BInterface.massive[0] = state -> state + 2;
    A a = new A(state -> state + 2);
    a.doIt();
    assertEquals(2, a.state);
  }

}