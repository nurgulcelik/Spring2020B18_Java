package day19_Arrays;

public class Arrays_Practice1 {
    public static void main(String[] args) {

        String[] myFriends={"Zeynep","Nedime","Ayla","Gulay","Zuleyha","Ayse","Nurgul"};

       /* String name1=myFriends[3];
        System.out.println(name1);
        String name2=myFriends[0];
        System.out.println(name2);
        */
        for( int i=0; i<7; i++){
            String name= myFriends[i];
            System.out.println(name);
        }
        String[] emails= {"cybertek@yahoo.com","cybertek@gmail.com","cybertek@hotmail.com","cybertek@outlook.com"};

        for(int i=0; i<=3; i++) {
            String email = emails[i];
            if(email.endsWith("gmail.com")){
                System.out.println(email);
            }
        }
        }
    }

