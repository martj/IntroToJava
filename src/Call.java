public class Call {
    private int data;
    private int startTime;
    private int callTime;
    private Call[] callHistory = new Call[16];
    private int callCounter;
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getCallTime() {
        return callTime;
    }

    public void setCallTime(int callTime) {
        this.callTime = callTime;
    }

    public Call[] getCallHistory() {
        return callHistory;
    }

    public void setCallHistory(Call[] callHistory) {
        this.callHistory = callHistory;
    }

    public int getCallCounter() {
        return callCounter;
    }

    public void setCallCounter(int callCounter) {
        this.callCounter = callCounter;
    }

    
}
