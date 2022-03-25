package coding.test.time;

public class Timer {

    private long currentTime = System.currentTimeMillis();

    public void execute() {
        System.out.println("[info] " + currentTime);
    }

    public void clear() {
        System.out.println("[info] " + currentTime);
    }
    
}