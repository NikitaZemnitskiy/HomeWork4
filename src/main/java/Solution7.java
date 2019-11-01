public class Solution7 {
    //Дано простое число. Составить функцию, которая будет выводить следующее за ним простое
    //число.
    public static int nextSimpleNumber(int number){
        boolean isSimple = true;
        int count = 0;
        int TestCount = 0;
        for (int i = number+1; i<2147483647; i++){
            count = i-2;
            TestCount = 0;
            for (int k = i-1; k>1;k--){
                if (i%k == 0){
                    break;
                }
                TestCount++;
                if (TestCount == count){
                    return i;
                }
            }
            }
        return -1;
    }
}
