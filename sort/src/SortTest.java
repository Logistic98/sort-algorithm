/**
 * 整数排序测试类
 */
public class SortTest {

    public static void main(String[] args) {
        int count=10000;

        System.out.println("========== 随机乱序 ==========");
        // 产生一个随机乱序的数组
        int[] randArr = SortUtils.generateRandomArray(count, 0, count);
        SortUtils.testSort("1.【冒泡排序】",new BubbleSort(),SortUtils.copyArray(randArr));
        SortUtils.testSort("2.【选择排序】",new SelectionSort(),SortUtils.copyArray(randArr));
        SortUtils.testSort("3.【插入排序】",new InsertSort(),SortUtils.copyArray(randArr));
        SortUtils.testSort("4.【希尔排序】",new ShellSort(),SortUtils.copyArray(randArr));
        SortUtils.testSort("5.【快速排序】",new QuickSort(),SortUtils.copyArray(randArr));

        System.out.println("========== 近乎顺序 ==========");
        // 产生一个近乎顺序的数组
        int[] orderArr = SortUtils.generateNearlyOrderedArray(count, 100);
        SortUtils.testSort("1.【冒泡排序】",new BubbleSort(),SortUtils.copyArray(orderArr));
        SortUtils.testSort("2.【选择排序】",new SelectionSort(),SortUtils.copyArray(orderArr));
        SortUtils.testSort("3.【插入排序】",new InsertSort(),SortUtils.copyArray(orderArr));
        SortUtils.testSort("4.【希尔排序】",new ShellSort(),SortUtils.copyArray(orderArr));
        SortUtils.testSort("5.【快速排序】",new QuickSort(),SortUtils.copyArray(orderArr));
    }
}