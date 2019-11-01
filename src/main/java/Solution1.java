public class Solution1 {
    //Дан массив натуральных чисел. Найти сумму элементов, кратных данному K.
    public static int summ (int[]arr, int k){
        int summ = 0;
        for (int i:arr){
            if (i%k == 0){
                summ+=i;
            }
        }
        return summ;
    }
}
