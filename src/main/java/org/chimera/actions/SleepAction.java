package org.chimera.actions;

public class SleepAction implements Action {
    long waitTime;
    long targetTime = -1;
    public SleepAction(float seconds) {
        waitTime = (long) (seconds*1000);
    }
    @Override
    public boolean execute() {
        if (targetTime < 0) {
            targetTime = System.currentTimeMillis() + waitTime;
        }
        return System.currentTimeMillis() >= targetTime;
    }
}
