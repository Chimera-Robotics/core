package org.chimera.actions;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Continues to execute all passed actions until one of them finishes.
 * After any one of the actions finish, RaceAction will exit without waiting for the rest.
 */
public class RaceAction implements Action {
    ArrayList<Action> actions = new ArrayList<>();

    public RaceAction(Action ...args) {
        Collections.addAll(actions, args);
    }

    @Override
    public boolean execute() {
        for (Action action : actions) {
            if (action.execute()) {
                return true;
            }
        }
        return false;
    }
}
