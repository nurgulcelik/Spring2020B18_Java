package dayInterview.Array;

import day30_ArrayList.ArrayList_Methods;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZeroToEnd {
    public static void main(String[] args) {
int[] arr={0,1,2,0,5,6,9,0,8};
        System.out.println(Arrays.toString(MoveZero(arr)));
    }

    public static int[] MoveZero(int[] arr) {
        int countZero=0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int each : arr) {
                list.add(each);
                countZero+= (each==0)?1:0;
            }
        list.removeAll(Arrays.asList(0));
        arr=new int[arr.length];

        for (int i = 0; i < arr.length-countZero; i++) {
           arr[i]=list.get(i);
        }
        return arr;
    }
}