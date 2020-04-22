package day17_WhileLoops;

public class Frequency {
    public static void main(String[] args) {

      String str="Java is fun,Java is cool";//aacceeeddd;

      int count = 0;
      while(str.contains("Java")){//"e"
          count++;//after counting first java we need to remove it
        str=  str.replaceFirst("Java","");//("e","")
      }
        System.out.println(count);

    }
}
