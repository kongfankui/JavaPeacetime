package com.javaSort;

public class InsertSortTest {  //插入排序
    public static void insertSort(int[] array) {  
        if (array == null || array.length < 2) {  
            return;  
        } 
        for (int i = 1; i < array.length; i++) {  
            int currentValue = array[i];  
            int position = i;  
            for (int j = i - 1; j >= 0; j--) {  
                if (array[j] > currentValue) {  
                    array[j + 1] = array[j];  
                    position -= 1;  
                } else {  
                    break;  
                } 
            }  
            array[position] = currentValue;  
        }  
    }  
  
    public static void main(String[] args) {  
        int[] array = {49,38,65,97,76,13,27,14,10};
        System.out.println("排序前：");
        for(int i=0;i<array.length;i++){  //循环输出
            System.out.print(array[i]+" ");  
        } 
        System.out.println();
        ArrayUtils.printArray(array);  //自定义函数输出
        insertSort(array);  
        System.out.println("排序后：");
        ArrayUtils.printArray(array);  
    }  
}
class ArrayUtils {  
    public static void printArray(int[] array) {  
        System.out.print("{");  
        for (int i = 0; i < array.length; i++) {  
            System.out.print(array[i]);  
            if (i < array.length - 1) {  
                System.out.print(", ");  
            }  
        }  
        System.out.println("}");  
    }  
}  
