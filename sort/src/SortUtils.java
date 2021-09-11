import java.text.SimpleDateFormat;
import java.util.Random;

/**
 * 整数排序测试工具类
 */
public class SortUtils {

    /**
     * 生成一个乱序的数组
     *
     * @param count       数组的数量
     * @param startRanger 数字范围起始值
     * @param endRanger   数字范围终止值
     * @return 乱序的整数数组
     */
    public static int[] generateRandomArray(int count, int startRanger, int endRanger) {
        if (startRanger <= endRanger) {
            int[] arr = new int[count];
            Random random = new Random();
            for (int i = 0; i < count; i++) {
                arr[i] = startRanger + random.nextInt(endRanger - startRanger );
            }
            return arr;
        } else {
            return null;
        }

    }

    /**
     * 生成一个从0开始的近乎顺序的整型数组
     *
     * @param count     数组的数量
     * @param swapCount 数字范围起始值
     * @return 近乎顺序的整型数组
     */
    public static int[] generateNearlyOrderedArray(int count, int swapCount) {

        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = i;
        }
        Random random = new Random();
        for (int i = 0; i < swapCount; i++) {
            int x = random.nextInt(count);
            int y = random.nextInt(count);
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
        }
        return arr;

    }

    /**
     * 对整型数组做完全拷贝
     *
     * @param source 源数组
     * @return 数组拷贝
     */
    public static int[] copyArray(int[] source) {
        if (source != null) {
            int dest[] = new int[source.length];
            for (int i = 0; i < source.length; i++) {
                dest[i] = source[i];
            }
            return dest;
        } else {
            return null;
        }
    }

    /**
     * 判断整型数组是否已经升序排列
     *
     * @param arr 整型数组
     * @return 已经升序排列为true否则为false
     */
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * 遍历打印数组
     * @param arr 整型数组
     */
    public static void printArray(int[] arr) {
        if (arr!=null) {
            System.out.print("[");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
                if (i != arr.length - 1) {
                    System.out.print(",");
                } else {
                    System.out.println("]");
                }
            }
        }else{
            System.out.println("数组为空!");
        }
    }

    /**
     * 通过排序接口，调用各种排序算法进行测试
     * @param sortName 排序算法名称
     * @param sort 排序统一接口
     * @param arr 整型数组
     */
    public static void testSort(final String sortName,Sort sort,int[] arr){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        Long start = System.currentTimeMillis();
        //System.out.println(sortName+"排序开始时间：" + sdf.format(start));
        sort.sort(arr);
        Long end = System.currentTimeMillis();
        //System.out.println(sortName+"排序结束时间：" + sdf.format(end));
        System.out.println(sortName+"排序耗用了" + (end - start) + "毫秒");
        //断言判断该数组是否已实现升序排序
        assert(isSorted(arr));
    }

}
