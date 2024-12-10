package org.chimera.actions;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Runs actions in parallel. Executes passed actions simultaneously until all of them finish.
 */
public class ParallelAction implements Action {
    ArrayList<Action> actions = new ArrayList<>();
    public ParallelAction(Action ...args) {
        Collections.addAll(actions, args);
    }

    @Override
    public boolean execute() {
        boolean isDone = true;
        for (Action action : actions) {
            if (action.execute()) {
                actions.remove(action);
            } else {
                isDone = false;
            }
        }
        return isDone;
    }
}
