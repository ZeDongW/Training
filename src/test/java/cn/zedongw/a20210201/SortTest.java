package cn.zedongw.a20210201;

import org.junit.Test;

import java.util.Arrays;

public class SortTest {

    Sort sort = new Sort();

    int[] array = new int[]{2,4,1,0,3,42,4,8,5,9};

    @Test
    public void selectSort() {
        System.out.println(Arrays.toString(array));
        sort.selectSort(array);
        System.out.println(Arrays.toString(array));
    }

    @Test
    public void insertSort(){
        System.out.println(Arrays.toString(array));
        sort.insertSort(array);
        System.out.println(Arrays.toString(array));
    }
}