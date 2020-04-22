package day13_StringClass;

public class StringManipulation2 {
    public static void main(String[] args) {
  String str= "Cybertek School is the best";
  //           01234567
  String schoolName= str.substring(0,8);//ending index is excluded,be careful
        System.out.println(schoolName);
        String fullName= "Nurgul Celik";
                      //  01234567891011
        String firstName= fullName.substring(0,6);
                String lastName= fullName.substring(7,12);//11+1=12//index cannot be out of range
        System.out.println(firstName+" "+lastName);
//gmail:lastName_firstName@gmail.com
        String Murtaza= "Murtaza Nazeeri";
        String firstname= Murtaza.substring(0,7);
        String lastname= Murtaza.substring(7,15);
        String gmail=lastname.concat("_").concat(firstname).concat("@gmail.com");
        String email=lastname+"_"+firstname+"@gmail.com";
        System.out.println(email);
        System.out.println(gmail);

        String s1= "I love Java Programming Language";
//                  01234567
        String className= s1.substring(7);// one parameter
        System.out.println(className);

        String s2= "I like C# Programming";
        s2=s2.replace("C#","Java");
        System.out.println(s2);
        String name= "COVID 18";
        name=name.replace("8","9");
        System.out.println(name);

        String r1= "I like C#,C# is fun,C# is cool";
        r1= r1.replaceFirst("C#","Java");
        System.out.println(r1);
        String r2= "Tomorrow is Monday,Tomorrow is Tuesday";
        r2=r2.replaceFirst("Tomorrow","Today");
        System.out.println(r2);










    }
}
