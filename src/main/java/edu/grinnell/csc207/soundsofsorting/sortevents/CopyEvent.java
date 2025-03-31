package edu.grinnell.csc207.soundsofsorting.sortevents;

import java.util.ArrayList;
import java.util.List;

/**
 * A <code>CopyEvent</code> logs a copy of a value into an index of the array.
 */
public class CopyEvent<T> implements SortEvent<T> {

    /**
     * Filler to make spacing better
     */
    public CopyEvent() {

    }

    List<Integer> lst = new ArrayList<>();

    /**
     * Applies this event to the array.
     * 
     * @param arr the array to modify
     */
    public void apply(T[] arr) {

    }

    /**
     * @return a list of the indices affected by this event
     */
    public List<Integer> getAffectedIndices() {
        return lst;
    }

    /**
     * @return <code>true</code> if this event is emphasized
     */
    public boolean isEmphasized() {
        return true;
    }
}
