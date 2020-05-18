package day41_Inheritance;

public class BooksObjects {
    public static void main(String[] args) {
        Ebook obj1= new Ebook();
        obj1.title="Hamlet";
        obj1.author="Shakespeare";
        obj1.price=20;
        obj1.size="1.5 MB";
        obj1.pages=432;
        System.out.println(obj1);
        System.out.println("Size: "+obj1.size);
        System.out.println("Pages: "+obj1.pages);
        obj1.readBook();
        AudioBook obj2= new AudioBook();
        obj2.title="Becoming";
        obj2.author="Michelle Obama";
        obj2.price= 30;
        obj2.length="19 hours and 3 minutes" ;
        System.out.println("Length of the audio book \""+obj2.title+"\" is "+obj2.length);
        System.out.println(obj2);

    }
}
