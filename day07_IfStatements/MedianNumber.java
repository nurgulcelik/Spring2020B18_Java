package day07_IfStatements;
/* write a java program that accepts three numbers and rteurn the mediam number
				(assume that none of them are equal)

 */
public class MedianNumber {
    public static void main(String[] args) {
  double a= 100;
  double b= 200;
  double c= 300;
  /*
  a: if (a <b && a>b) or (a>b && a<c)
  b= if (b<a && b>c) or (b>a && b<c)
  c= if (c<a && c>b) or ( c>a && c<b)
   */
      boolean aMedium= (a <b && a>b) || (a>b && a<c);
      boolean bMedium= (b<a && b>c) || (b>a && b<c);
      boolean cMedium= (c<a && c>b) || ( c>a && c<b);
      if ( aMedium){
          System.out.println( a + "is the medium number");
      }
      if (bMedium){
          System.out.println( b+ " is the medium number");
      }
      if ( cMedium){
          System.out.println( c+ " is the medium number");
      }


    }
}
