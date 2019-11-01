public class Solution4   {
//Дана последовательность действительных чисел a1, a2..., an. Выяснить, будет ли она возрастающей.

    public static boolean isArrayProgressive (int[]arr){
        for (int i = 0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
