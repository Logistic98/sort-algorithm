/**
 * 快速排序
 */
public class QuickSort implements Sort {
    @Override
    public void sort(int[] array) {
        quick(array, 0, array.length - 1);
    }

    private void quick(int[] array, int left, int right) {
        if (left < right) {
            int partitionIndex = partition(array, left, right);
            quick(array, left, partitionIndex - 1);
            quick(array, partitionIndex + 1, right);
        }
    }

    private int partition(int[] array, int left, int right) {
        int pivot = left;
        int index = pivot + 1;
        for (int i = index; i <= right; i++) {
            if (array[i] < array[pivot]) {
                swap(array, i, index);
                index++;
            }
        }
        swap(array, pivot, index - 1);
        return index - 1;
    }

    private void swap(int array[], int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}