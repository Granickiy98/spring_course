package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary library = context.getBean("uniLibrary", UniLibrary.class);
      Book book = context.getBean("book",Book.class);
        library.getBook();
        library.addBook("Yuriy",book);
        library.addMagazine();

//        library.returnMagazine();
//        library.addBook();

        context.close();
    }
}
