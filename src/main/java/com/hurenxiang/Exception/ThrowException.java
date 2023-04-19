package com.hurenxiang.Exception;

public class ThrowException {
    public static void main(String[] args) {
        int[] arr = null;
        int e = getElement(arr,0);
    }

    public static int getElement(int[] arr,int index){
        //对传递过来的参数数组进行合法性校验，如果是数组arr的值为null，
        //抛出空指针异常，告知方法的调用者"传递的数组的值是null"
        if (arr == null){
            throw new NullPointerException("传递的数组的值是null");
        }
        int ele = arr[index];
        return ele;
    }
}
