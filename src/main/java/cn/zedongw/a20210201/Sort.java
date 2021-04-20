package cn.zedongw.a20210201;

/**
 * @ClassName: Sort
 * @Description: 排序
 * @Author: ZeDongW
 * @Date: 2021/2/1 0001 7:43
 * @Version: v1.0
 * @Modified By:
 * @Modified Time:
 **/
public class Sort {

    /**
     * Description: 选择排序
     * 每次选择未排序中最小的数
     * @methodName: selectSort
     * @param array 1
     * @throws
     * @return: void
     * @author: ZeDongW
     * @date: 2021/2/1 0001 7:46
     */
    public static void selectSort(int[] array){
        int length = array.length;
        for (int i = 0; i < length; i++) {
            int min = i;
            for (int j = i+1; j < length; j++) {
                if (array[min] > array[j]){
                    min = j;
                }
            }
            swap(array, min, i);
        }
    }

    public static  void insertSort(int[] array) {
        int length = array.length;
        for (int i = 1; i < length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j]< array[j-1]){
                    swap(array, j, j-1);
                }
            }
        }
    }

    /**
     * Description: 交换数组的值
     * @methodName: swap
     * @param array 1
     * @param min 2
     * @param i 3
     * @throws
     * @return: void
     * @author: ZeDongW
     * @date: 2021/2/1 0001 7:50
     */
    private static void swap(int[] array, int min, int i) {
        int temp = array[min];
        array[min] = array[i];
        array[i] = temp;
    }

}
