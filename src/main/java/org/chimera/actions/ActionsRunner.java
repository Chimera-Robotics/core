package org.chimera.actions;

/**
 * Helper class to run a provided action.
 */
public class ActionsRunner {

    /**
     * Runs an action until it finishes synchronously.
     * @param action The action to be run.
     */
    public static void runSync (Action action) {
        while (!action.execute());
    }
}
