package day31_BulkOperataions;


import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;
public class Task {
    public static void main(String[] args) {//task 1
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));
        int count = 0;
        for (Integer each : list) {
            if (each == 0) {
                count++;
            }
        }
        list.removeAll(Arrays.asList(0));
        for (int i = 0; i <= count; i++) {
            list.addAll(Arrays.asList(0));
        }
        System.out.println(list);
        System.out.println("======================");//task 2
        ArrayList<String> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList("A","B","A", "C", "D"));
        ArrayList<String> result = new ArrayList<>();

        //remove duplicate from Array list
          for(int i=0;i<list1.size();i++) {
              int count1 = 0;

              for (String each : list1) {

                  if (each == list1.get(i)) {
                      count1++;
                  }
              }
              if (count1 > 1 && !result.contains(list1.get(i))) {
                  result.add(list1.get(i));

              }
          }

            System.out.println(result);//[A]


            }

        }













