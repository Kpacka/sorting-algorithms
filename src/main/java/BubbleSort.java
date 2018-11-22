public class BubbleSort {

    //Constant O(n^2) time complexity implementation
    public static int[] bubbleSortFixed(int[] list) {

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length - 1; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        return list;
    }

    //Can break out of loop at a mininum of O(n)
    public static int[] betterBubbleSort(int[] list) {

        boolean sorted = false;
        while (!sorted) {
            boolean sortedInLine = false;
            for (int j = 0; j < list.length - 1; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    sortedInLine = true;
                }
            }

            if (!sortedInLine) {
                sorted = true;
            }

        }
        return list;
    }

}
