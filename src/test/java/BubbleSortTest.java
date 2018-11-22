import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class BubbleSortTest {



    @Test
    public void bubbleSorttester() {
        int[] list = {1, 3, 9, 3, 65, 2};

        int[] sorted = BubbleSort.bubbleSortFixed(list);

        for (int jj = 0; jj < sorted.length; jj++) {
            System.out.println(sorted[jj]);
        }

    }

    @Test
    public void betterBubbleSortTester() {
        int[] list = {1, 3, 9, 3, 65, 2};

        int[] sorted = BubbleSort.betterBubbleSort(list);

        for (int jj = 0; jj < sorted.length; jj++) {
            System.out.println(sorted[jj]);
        }
    }
}