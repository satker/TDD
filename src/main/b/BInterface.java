package main.b;

public interface BInterface {

  BInterface[] massive = new BInterface[1];

  static BInterface createB() {
    if (massive[0] == null) {
      return new B();
    } else {
      return massive[0];
    }
  }

  int doIt(int state);
}
