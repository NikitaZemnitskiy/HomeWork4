public class Solution3 {
    //Дана последовательность целых чисел a1
    //, a2
    //, ..., an
    //. Выяснить, какое число встречается раньше –
    //
    //положительное или отрицательное.

    public static boolean isFirstPositiveNumber (int[]arr){
        for (int i:arr){
            if (i != 0){
                if(i>0){
                    return true;
                }
                else if (i<0){
                    return false;
                }
            }
        }
        return true;

    }
}
