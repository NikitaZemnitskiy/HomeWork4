import java.util.*;
import java.util.Collection;
import java.util.Collections;

public class Solution9 {
    //Дан массив действительных чисел. Среди них есть равные. Найти первый максимальный элемент
    //массива и заменить его нулем.
    public  static int[] SwapMaxNumberInArrayOnZero(int[]arr){
        int Max = arr[0];
        int IndexFirstMaxNumber = 0;
        for (int i = 1; i<arr.length; i++){
            Max = Max>arr[i]?Max:arr[i];
        }
        for (int i = 0; i<arr.length; i++){
            if(arr[i]==Max){
                IndexFirstMaxNumber = i;
                break;
            }
        }
        arr[IndexFirstMaxNumber] = 0;
        return arr;
    }
}
