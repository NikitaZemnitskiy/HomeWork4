import java.util.ArrayList;
import java.util.*;

public class Solution6 {
    //Дан одномерный массив A[N]. Найти: mаx(а2, а4, ..., a2k) + min(а1, а3, ..., a2k-1).
    public static int summMaxEvenNumberAndMinOddNumber(int[] arr) {
        ArrayList<Integer> listEven = new ArrayList<Integer>();
        ArrayList<Integer> listOdd = new ArrayList<Integer>();
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] % 2 == 0) {
                listEven.add(arr[i]);
            }
            else{
                listOdd.add(arr[i]);
            }
        }

       return Collections.max(listEven) + Collections.min(listOdd);

    }
}
