package day25_MethodsRecap;

public class Frequency {
    public static void main(String[] args) {
        String str1= "javajavajavajava";
        String str2="java";

        int count=0;
        while (str1.contains(str2)){
            count++;
          str1  =str1.replaceFirst(str2," ");
          //we need to make sure that we are not counting the same index over again
        }
        System.out.println(str1);
        System.out.println(count);
        String a="PYTHON PYTHON PYTHON PYTHON";
        String b="PYTHON";
        int count1=getFrequency1(a,b);
        System.out.println(count1);
        String str3="zeyzeyzeyz";
        String str4="ze";
        int count2=getFrequency2(str3,str4);
        System.out.println(count2);

    }
    public static int getFrequency1(String str1,String str2){
        int count=0;
        while (str1.contains(str2)){
            count++;
            str1  = str1.replaceFirst(str2," ");
        }
        return count;
    }
    public static int getFrequency2(String str1,String str2){
        int count1=0;
        for (int i=0;i<str1.length();i++){
        if(str1.contains(str2)) {
            count1++;
            str1 = str1.replaceFirst(str2, " ");
        }
        }
        return count1;
    }
}
