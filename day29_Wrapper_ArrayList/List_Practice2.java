package day29_Wrapper_ArrayList;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
public class List_Practice2 {
    /*
        1.create a list of integer
        2.add five integer
        3.return the max num from array list
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(20);
        list.add(300);
        list.add(400);
        list.add(50);
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > maximum) {
                maximum = list.get(i);
            }
        }
        int max3= max(list);
        System.out.println(max3);
        System.out.println(maximum);
        int max2 = Integer.MIN_VALUE;
        for (Integer each : list) {
            if (each > max2) {
                max2 = each;

            }
        }
        System.out.println(max2);
    }
    public static int max(ArrayList<Integer>list ){
            int maximum=Integer.MIN_VALUE;
            for(int i=0; i<list.size();i++){
                if(list.get(i)>maximum){
                    maximum= list.get(i);
                }
            }
            return maximum;
    }
}

