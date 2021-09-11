/**
 * 冒泡排序
 */
public class BubbleSort implements Sort {
    @Override
    public void sort(int[] array) {
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j + 1] < array[j]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}