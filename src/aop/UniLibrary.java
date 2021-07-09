package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
    public  void  getBook(){
        System.out.println("We take book : UniLibrary ");
        System.out.println("--------------------------------------");
    }

    public String   returnBook(){
        System.out.println("We return book : UniLibrary");
        return "WarAndWord";
    }

    public  void  getMagazine(){
        System.out.println("We take magazine : UniLibrary");
        System.out.println("--------------------------------------");
    }

    public void returnMagazine(){
        System.out.println("We return magazine : UniLibrary");
        System.out.println("--------------------------------------");
    }

    public void addBook(String person_name,Book book){
        System.out.println("We add book : UniLibrary ");
        System.out.println("--------------------------------------");
    }

    public void addMagazine(){
        System.out.println("We add magazine : UniLibrary ");
        System.out.println("--------------------------------------");
    }
}
