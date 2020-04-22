package day23_Methods;

public class Methods_With_Parameters2 {
    public static void main(String[] args) {
        String name1="Nurgul";
        ReverseString(name1);
        String name2="Cybertek School";
        ReverseString(name2);
    }
    //create a function that can reverse any string
    //such as "Muhtar"==>rathuM
    public static void ReverseString(String str){
        for( int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();

    }

}
