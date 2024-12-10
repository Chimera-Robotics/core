package org.chimera.actions;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Executes actions sequentially, one-by-one. This action does not exit until all passed actions have completed execution.
 */
public class SequentialAction implements Action {
    ArrayList<Action> actions = new ArrayList<>();
    public SequentialAction(Action ...args) {
        Collections.addAll(actions, args);
    }
    @Override
    public boolean execute() {
        if (!actions.get(0).execute()) {
            return false;
        }
        actions.remove(0);
        return actions.isEmpty();
    }
}
