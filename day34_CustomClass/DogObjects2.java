package day34_CustomClass;

public class DogObjects2 {
    public static void main(String[] args) {
        Dog dog1= new Dog();
        dog1.setDogInfo("Husky","Small",4,"White","Ghost");
        System.out.println(dog1.name);
        Dog dog2= new Dog();
        dog2.setDogInfo("Alabay","Extra big",5,"Brown","Ajdar");
        String food1="Chicken";
        String food2="Fish";
        dog2.eating(food1);
        dog1.eating(food2);
        String drink1="milk";
        String drink2="coffee";
        dog1.drinking(drink2);
        dog2.drinking(drink1);
        String toy1="Ps4";
        String toy2= "Piano";
        dog1.playing(toy1);
        dog2.playing(toy2);
        Dog dog3= new Dog();
        dog3.setDogInfo("Poodle","Miniature",2,"Brown-White","Lucy");
        Dog dog4=new Dog();
        dog4.setDogInfo("Pomerian","Small",1,"White","Lil");
        Dog[] dogPark={dog1,dog2,dog3,dog4};
        for(int i=0; i<dogPark.length;i++){
            dogPark[i].eating("Chicken");
        }
        for(Dog each: dogPark){
            each.drinking("Water");
        }
    for(int i=0; i< dogPark.length;i++){
        dogPark[i].playing("football");
    }
    }
}
