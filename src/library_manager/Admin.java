package library_manager;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Admin extends User  {

    public boolean admin;
    ArrayList<Librarian> addLibrarian = new ArrayList<>();

    public Admin() {

    }
    public boolean isAdmin() {
        return admin;
    }

    public Librarian[] addLibrarian(Librarian[] addLibrarian, Librarian name) {
    Librarian[] newLibrarian= Arrays.copyOf(addLibrarian, addLibrarian.length + 1);
    newLibrarian[addLibrarian.length] = name;
    return newLibrarian;
}


}


