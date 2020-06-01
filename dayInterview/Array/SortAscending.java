package dayInterview.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class SortAscending {
    public static void main(String[] args) {
  int[] arr= {2,4,6,3,8,5,7,20};

        System.out.println(Arrays.toString(SortAscending(arr)));
    }

    public static int[] SortAscending(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int each :arr) {
            list.add(each);
        }
        for(int i=0;i<list.size();i++){
try {
    if (list.get(i) < list.get(i + 1))
        arr[i] = list.get(i);
}catch(Exception e){}
            }

        return arr;
    }
}


