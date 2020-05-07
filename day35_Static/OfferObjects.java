package day35_Static;
import java.util.*;
public class OfferObjects {
    /*
       Create 5 offer objects, and add them into the list of offers, and then:
            1. use for loop to print out the info of each offer
            2. write a program that can only retain the offers if:
                    1. the offer is for fulltime position
                    2. offer is from your local area
                    3. salary is greater than 100K
     */
    public static void main(String[] args) {
        Offer offer1=new Offer();
        offer1.setInfo("Maryland","Bank of America",120000,true);
        Offer offer2= new Offer();
        offer2.setInfo("Pennsylvania","Capital One",95000,false);
        Offer offer3= new Offer();
        offer3.setInfo("Virginia","WellsFargo",130000,true);
        Offer offer4=new Offer();
        offer4.setInfo("New York","Google",150000,false);
        Offer[] arr={offer1,offer2,offer3,offer4};
        String myLocation="Maryland";
        ArrayList<Offer>offers= new ArrayList<>(Arrays.asList(arr));
        //for(Offer each:offers){
           // System.out.println(each);//(offer1.toString(),automatically calls)
        //}
        ArrayList<Offer>Accept= new ArrayList<>(Arrays.asList(arr));
       // Accept.removeIf(each->each.salary<100000 ||each.isFullTime==false ||!each.location.equals(myLocation));
        Accept.removeIf(each->each.salary<100000);
        Accept.removeIf(each->each.isFullTime==false);
        Accept.removeIf(each->!each.location.equals(myLocation));
                System.out.println(Accept.size());
        for(Offer eachOffer:Accept){
            System.out.println(eachOffer);
        }


    }
}
