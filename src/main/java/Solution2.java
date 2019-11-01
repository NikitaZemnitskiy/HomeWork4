import java.util.ArrayList;

public class Solution2 {
    //В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих
    //элементов.
    public static int[] ArrayOfIndexZeroElements (int[]arr){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i<arr.length; i++){
                if ( arr[i] == 0){
                    list.add(i);
            }
        }
        int [] newArr = new int[list.size()];
        for (int i=0; i<list.size(); i++){
            newArr[i]=list.get(i);
        }
        return newArr;
}
}
