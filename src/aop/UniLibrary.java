package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
    public  void  getBook(){
        System.out.println("We take book : UniLibrary ");
    }

    public void   returnBook(){
        System.out.println("We return book : UniLibrary");
    }

    public  void  getMagazine(){
        System.out.println("We take magazine : UniLibrary");
    }

    public void returnMagazine(){
        System.out.println("We return magazine : UniLibrary");
    }

    public void addBook(){
        System.out.println("We add book : UniLibrary ");
    }

    public void addMagazine(){
        System.out.println("We add magazine : UniLibrary ");
    }
}
