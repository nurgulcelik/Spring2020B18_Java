package tests;

import java.util.ArrayList;
import java.util.Arrays;

public class DeveloperObjects {
    public static void main(String[] args) {
        Developer developer1=new Developer();
        developer1.setInfo("Enes","Senior Developer",150000, 12345);
        Developer developer2=new Developer();
        developer2.setInfo("Talha","Junior Developer",120000,67890);

        Developer[] arr={developer1,developer2};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        for(Developer each:arr){
            System.out.println(each.name+" "+each.salary);
        }
        ArrayList<Developer>developers= new ArrayList<>(Arrays.asList(arr));
        for(Developer each:arr){
            System.out.println(each.name+ " "+each.jobTitle);
        }

    }
}
