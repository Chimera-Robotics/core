package org.chimera.actions;

public class PrintAction implements Action {
    String printData;
    public PrintAction(String printData) {
        this.printData = printData;
    }

    @Override
    public boolean execute() {
        System.out.println(printData);
        return true;
    }
}
