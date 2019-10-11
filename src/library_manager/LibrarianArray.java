package library_manager;


import java.util.Arrays;

public class LibrarianArray {
    public static Librarian[] findAll() {
        return new Librarian[]{
                new Librarian("Cat", "Jones"),
                new Librarian("Dog", "Man"),
                new Librarian("Happy", "Gilmore"),
                new Librarian("John", "Doe")

        };
    }


}