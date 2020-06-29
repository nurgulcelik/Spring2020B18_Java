package day54_Maps;

public class String_vs_Buffer_Builder {
    public static void main(String[] args) {
         String str1= "cybertek";
         str1.concat("school");
        System.out.println(str1);//cybertek
        StringBuilder builder= new StringBuilder("cybertek");
        builder.append("school");
        System.out.println(builder);

        StringBuffer buffer= new StringBuffer("cybertek");
        buffer.append("school");
        System.out.println(buffer);
        System.out.println("=================================");
        String word= "abcd";
        StringBuilder sb= new StringBuilder("abcd");
        System.out.println(sb.reverse());
        word= sb.toString();
        System.out.println(word);
    }
}
