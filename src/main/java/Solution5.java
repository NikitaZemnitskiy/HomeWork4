import java.util.ArrayList;

public class Solution5 {
    //Сделать из имеющегося массива массив только с четными числами

    public static int[] returnedEvenArray(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] % 2 == 0) {
                list.add(arr[i]);
            }
        }
            if (list.size() == 0){
                System.out.println("В данном массиве небыло четных чисел");
                return new int[0];
            }

        int [] newArr = new int[list.size()];
        for (int i=0; i<list.size(); i++){
            newArr[i]=list.get(i);
        }
        return newArr;

    }
}
