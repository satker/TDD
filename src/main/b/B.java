package main.b;

public class B implements BInterface {

    @Override
    public int doIt(int state) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return state + 2;
    }
}
