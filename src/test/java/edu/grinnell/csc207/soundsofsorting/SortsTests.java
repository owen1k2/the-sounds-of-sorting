package edu.grinnell.csc207.soundsofsorting;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.function.Consumer;

import org.junit.jupiter.api.Test;

import edu.grinnell.csc207.soundsofsorting.sortevents.SortEvent;
import edu.grinnell.csc207.soundsofsorting.sorts.Sorts;

public class SortsTests {
    /**
     * @param <T> the carrier type of the array
     * @param arr the array to check
     * @return true iff <code>arr</code> is sorted.
     */
    public static <T extends Comparable<? super T>> boolean sorted(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].compareTo(arr[i + 1]) > 0) {
                return false;
            }
        }
        return true;
    }

    public static Integer[] makeTestArray() {
        return new Integer[] {
            3, 7, 9, 1, 2,
            18, 16, 15, 19, 8,
            14, 12, 5, 13, 4,
            6, 0, 17, 11, 10
        };
    }

    public static String[] makeTestArrayTwo() {
        return new String[] {
            "a", "random", "", " ",
            "b", "champ", "cap"
        };
    }

    public static Double[] makeTestArrayThree() {
        return new Double[] {
            3.0, 7.2, 9.1, 9.3, 1.1, 2.6,
            18.7, 16.6, 15.6, 19.7, 8.9,
            14.2, 12.3, 5.5, 13.6, 4.4,
            6.7, 0., 17.6, 11.4, 10.1
        };
    }

    public void testSort(Consumer<Integer[]> func) {
        Integer[] arr = makeTestArray();
        func.accept(arr);
        assertTrue(sorted(arr));
    }

    public void testSortTwo(Consumer<String[]> func) {
        String[] arr = makeTestArrayTwo();
        func.accept(arr);
        assertTrue(sorted(arr));
    }

    public void testSortThree(Consumer<Double[]> func) {
        Double[] arr = makeTestArrayThree();
        func.accept(arr);
        assertTrue(sorted(arr));
    }

    @Test
    public <T> void testSortEventBubbleTwo() {
        String[] arr1 = makeTestArrayTwo();
        String[] arr2 = makeTestArrayTwo();
        List<SortEvent<String>> events = Sorts.bubbleSort(arr1);
        Sorts.eventSort(arr2, events);
        assertTrue(sorted(arr2));
    }

    @Test
    public <T> void testSortEventExchangeTwo() {
        String[] arr1 = makeTestArrayTwo();
        String[] arr2 = makeTestArrayTwo();
        List<SortEvent<String>> events = Sorts.exchangeSort(arr1);
        Sorts.eventSort(arr2, events);
        assertTrue(sorted(arr2));
    }

    @Test
    public <T> void testSortEventInsertionTwo() {
        String[] arr1 = makeTestArrayTwo();
        String[] arr2 = makeTestArrayTwo();
        List<SortEvent<String>> events = Sorts.insertionSort(arr1);
        Sorts.eventSort(arr2, events);
        assertTrue(sorted(arr2));
    }
/* 
    @Test
    public <T> void testSortEventMergeTwo() {
        String[] arr1 = makeTestArrayTwo();
        String[] arr2 = makeTestArrayTwo();
        List<SortEvent<String>> events = Sorts.mergeSort(arr1);
        Sorts.eventSort(arr2, events);
        assertTrue(sorted(arr2));
    }
*/
    @Test
    public <T> void testSortEventQuickTwo() {
        String[] arr1 = makeTestArrayTwo();
        String[] arr2 = makeTestArrayTwo();
        List<SortEvent<String>> events = Sorts.quickSort(arr1);
        Sorts.eventSort(arr2, events);
        assertTrue(sorted(arr2));
    }

    @Test
    public <T> void testSortEventSelectionTwo() {
        String[] arr1 = makeTestArrayTwo();
        String[] arr2 = makeTestArrayTwo();
        List<SortEvent<String>> events = Sorts.selectionSort(arr1);
        Sorts.eventSort(arr2, events);
        assertTrue(sorted(arr2));
    }

    @Test
    public <T> void testSortEventBubbleThree() {
        Double[] arr1 = makeTestArrayThree();
        Double[] arr2 = makeTestArrayThree();
        List<SortEvent<Double>> events = Sorts.bubbleSort(arr1);
        Sorts.eventSort(arr2, events);
        assertTrue(sorted(arr2));
    }

    @Test
    public <T> void testSortEventExchangeThree() {
        Double[] arr1 = makeTestArrayThree();
        Double[] arr2 = makeTestArrayThree();
        List<SortEvent<Double>> events = Sorts.exchangeSort(arr1);
        Sorts.eventSort(arr2, events);
        assertTrue(sorted(arr2));
    }

    @Test
    public <T> void testSortEventInsertionThree() {
        Double[] arr1 = makeTestArrayThree();
        Double[] arr2 = makeTestArrayThree();
        List<SortEvent<Double>> events = Sorts.insertionSort(arr1);
        Sorts.eventSort(arr2, events);
        assertTrue(sorted(arr2));
    }
/*
    @Test
    public <T> void testSortEventMergeThree() {
        Double[] arr1 = makeTestArrayThree();
        Double[] arr2 = makeTestArrayThree();
        List<SortEvent<Double>> events = Sorts.mergeSort(arr1);
        Sorts.eventSort(arr2, events);
        assertTrue(sorted(arr2));
    }
*/
    @Test
    public <T> void testSortEventQuickThree() {
        Double[] arr1 = makeTestArrayThree();
        Double[] arr2 = makeTestArrayThree();
        List<SortEvent<Double>> events = Sorts.quickSort(arr1);
        Sorts.eventSort(arr2, events);
        assertTrue(sorted(arr2));
    }

    @Test
    public <T> void testSortEventSelectionThree() {
        Double[] arr1 = makeTestArrayThree();
        Double[] arr2 = makeTestArrayThree();
        List<SortEvent<Double>> events = Sorts.selectionSort(arr1);
        Sorts.eventSort(arr2, events);
        assertTrue(sorted(arr2));
    }

    @Test
    public <T> void testSortEventBubble() {
        Integer[] arr1 = makeTestArray();
        Integer[] arr2 = makeTestArray();
        List<SortEvent<Integer>> events = Sorts.bubbleSort(arr1);
        Sorts.eventSort(arr2, events);
        assertTrue(sorted(arr2));
    }

    @Test
    public <T> void testSortEventExchange() {
        Integer[] arr1 = makeTestArray();
        Integer[] arr2 = makeTestArray();
        List<SortEvent<Integer>> events = Sorts.exchangeSort(arr1);
        Sorts.eventSort(arr2, events);
        assertTrue(sorted(arr2));
    }

    @Test
    public <T> void testSortEventInsertion() {
        Integer[] arr1 = makeTestArray();
        Integer[] arr2 = makeTestArray();
        List<SortEvent<Integer>> events = Sorts.insertionSort(arr1);
        Sorts.eventSort(arr2, events);
        assertTrue(sorted(arr2));
    }
/*
    @Test
    public <T> void testSortEventMerge() {
        Integer[] arr1 = makeTestArray();
        Integer[] arr2 = makeTestArray();
        List<SortEvent<Integer>> events = Sorts.mergeSort(arr1);
        Sorts.eventSort(arr2, events);
        assertTrue(sorted(arr2));
    }
*/
    @Test
    public <T> void testSortEventQuick() {
        Integer[] arr1 = makeTestArray();
        Integer[] arr2 = makeTestArray();
        List<SortEvent<Integer>> events = Sorts.quickSort(arr1);
        Sorts.eventSort(arr2, events);
        assertTrue(sorted(arr2));
    }

    @Test
    public <T> void testSortEventSelection() {
        Integer[] arr1 = makeTestArray();
        Integer[] arr2 = makeTestArray();
        List<SortEvent<Integer>> events = Sorts.selectionSort(arr1);
        Sorts.eventSort(arr2, events);
        assertTrue(sorted(arr2));
    }

    @Test
    public void testBubbleSort() {
        testSort(Sorts::bubbleSort);
    }
    
    @Test
    public void testInsertionSort() {
        testSort(Sorts::insertionSort);
    }
    
    @Test
    public void testSelectionSort() {
        testSort(Sorts::selectionSort);
    }

    @Test
    public void testMergeSort() {
        testSort(Sorts::mergeSort);
    }
    
    @Test
    public void testQuickSort() {
        testSort(Sorts::quickSort);
    }

    @Test
    public void testExchangeSort() {
        testSort(Sorts::exchangeSort);
    }

    @Test
    public void testBubbleSortTwo() {
        testSortTwo(Sorts::bubbleSort);
    }
    
    @Test
    public void testInsertionSortTwo() {
        testSortTwo(Sorts::insertionSort);
    }
    
    @Test
    public void testSelectionSortTwo() {
        testSortTwo(Sorts::selectionSort);
    }

    @Test
    public void testMergeSortTwo() {
        testSortTwo(Sorts::mergeSort);
    }
    
    @Test
    public void testQuickSortTwo() {
        testSortTwo(Sorts::quickSort);
    }

    @Test
    public void testExchangeSortTwo() {
        testSortTwo(Sorts::exchangeSort);
    }

    @Test
    public void testBubbleSortThree() {
        testSortThree(Sorts::bubbleSort);
    }
    
    @Test
    public void testInsertionSortThree() {
        testSortThree(Sorts::insertionSort);
    }
    
    @Test
    public void testSelectionSortThree() {
        testSortThree(Sorts::selectionSort);
    }

    @Test
    public void testMergeSortThree() {
        testSortThree(Sorts::mergeSort);
    }
    
    @Test
    public void testQuickSortThree() {
        testSortThree(Sorts::quickSort);
    }

    @Test
    public void testExchangeSortThree() {
        testSortThree(Sorts::exchangeSort);
    }

}