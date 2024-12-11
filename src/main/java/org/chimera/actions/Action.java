package org.chimera.actions;

/**
 * Basic Action interface. Use this to implement your custom actions by implementing the execute() method.
 * The execute() method should continue to return false until the action is finished.
 * After which, you should return true to finish the action's execution.
 */
public interface Action {
    boolean execute();
}
