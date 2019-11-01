import java.util.ArrayList;
import java.util.Objects;

public class Solution8 {
    //Дан целочисленный массив с количеством элементов n. Напечатать те его элементы, индексы
    //которых являются степенями двойки (1, 2, 4, 8, 16, ...).
    public static Object [] ArrayElementsThatArePowersOfTwo(int[]arr){
        ArrayList<Integer> PowersofTwo = new ArrayList<Integer>();
        ArrayList<Integer> newList = new ArrayList<Integer>();
        PowersofTwo.add(1);
        for (int i=0; i<26; i++){
            PowersofTwo.add(PowersofTwo.get(i)*2);
        }
        for (int i:arr){
            if (PowersofTwo.contains(i)){
               newList.add(i);
            }
        }
        return newList.toArray();
    }
}
