package coding.test.time;

class Timer {

    private long startTime = System.currentTimeMillis();
    private long estimatedTime = System.currentTimeMillis() - startTime;

    public void execute() {
        System.out.println("startTime : " + startTime);
        System.out.println("estimatedTime : " + estimatedTime);
    }

    public void setStartTime(long time) {
        startTime = time;
    }

    public void setEndTime(long time) {
        estimatedTime = time;
    }
    
}