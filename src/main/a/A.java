package main.a;

import main.b.BInterface;

public class A {

  BInterface bInterface;

  public A(BInterface bInterface) {
    this.bInterface = bInterface;
  }

  public int state;
  BInterface b = BInterface.createB();

  public void doIt() {
    state = b.doIt(state);
  }
}
