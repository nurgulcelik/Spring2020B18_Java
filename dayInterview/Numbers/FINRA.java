package dayInterview.Numbers;



public class FINRA {
    public static void main(String[] args) {
        int a=3;
        System.out.println(Finra(a));

    }
    public static String Finra(int num){
        String result;
        if (num%3==0 && num%5==0){
            result="FINRA";

        }else if(num%5==0) {
            result = "RA";
        }else if(num%3==0){
        result = "FIN";
        }else{
            result =""+num;
        }
        return result;
    }
}
