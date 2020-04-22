package day19_Arrays;
/*
 write a program that can return the frequency of the characters ina string
        Ex: "AABCBCA" ==> "A3B2C2"

 */
public class frequency {
    public static void main(String[] args) {
        String str="AABCC";
        String result="";
        String nonDuplicated= "";
        //count the total number of occur of each character


        for(int i=0;i<=str.length()-1;i++){
            if(!nonDuplicated.contains(""+str.charAt(i))) {
                nonDuplicated += str.charAt(i);
            }
            for(int j=0; j<=nonDuplicated.length()-1;j++){
              char ch=  nonDuplicated.charAt(j);
                int count=0;
                for(int i1=0; i1<=str.length()-1;i1++){
                    if(str.charAt(i1)==ch){
                        count++;
                    }
            }result+=""+count+ch;
        }
        //System.out.println(nonDuplicated);

        }

        System.out.println(result);
    }
}
