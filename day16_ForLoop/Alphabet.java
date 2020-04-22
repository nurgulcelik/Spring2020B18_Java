package day16_ForLoop;

public class Alphabet {
    public static void main(String[] args) {
    String upperCase="";
    String lowerCase="";
    for(char ch='A';ch<='Z';ch++){
        upperCase+=ch;
    }
        System.out.println(upperCase);
    for(char ch='a'; ch<='z';ch++){
        lowerCase+=ch;
    }
        System.out.println(lowerCase);
        //Aa Bb Cc Dd Ee Ff....
        String result="";
        for(int i=0; i<= upperCase.length()-1; i++){
            result+=upperCase.charAt(i)+""+lowerCase.charAt(i)+" ";

        }
        System.out.print(result);


    }


}
