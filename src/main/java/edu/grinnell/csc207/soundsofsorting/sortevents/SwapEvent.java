package edu.grinnell.csc207.soundsofsorting.sortevents;

import java.util.ArrayList;
import java.util.List;

import edu.grinnell.csc207.soundsofsorting.sorts.Sorts;

/**
 * A <code>SwapEvent</code> logs a swap between two indices of the array.
 */
public class SwapEvent<T> implements SortEvent<T> {
    List<Integer> lst = new ArrayList<>();

    /**
     * Swaps two indices
     * 
     * @param i int: index one
     * @param j int: index two
     */
    public SwapEvent(int i, int j) {
        lst.add(i);
        lst.add(j);
    }

    /**
     * Applies this event to the array.
     * 
     * @param arr the array to modify
     */
    public void apply(T[] arr) {
        Sorts.swap(arr, lst.get(0), lst.get(1));
    }

    /**
     * @return a list of the indices affected by this event
     */
    public List<Integer> getAffectedIndices() {
        return lst;
    }

    /**
     * @return <code>true</code> iff this event is emphasized
     */
    public boolean isEmphasized() {
        return true;
    }
}
