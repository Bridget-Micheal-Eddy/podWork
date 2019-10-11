package library_manager;

import java.util.Scanner;

public class LibraryManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Librarian[] librarianArray = LibrarianArray.findAll();
        Admin bridget = new Admin();
//        Librarian jane = new Librarian("Jane", "Doe");
        System.out.println("Please add a new librarian first name: ");
        String librarianfN = sc.nextLine();
        System.out.println("Please add a new librarian last name: ");
        String librarianlN = sc.nextLine();

        librarianArray = bridget.addLibrarian(librarianArray, new Librarian(librarianfN, librarianlN));
        for(Librarian name: librarianArray){
        System.out.println(name.getfN() + " " + name.getlN());
        }

    }
}
