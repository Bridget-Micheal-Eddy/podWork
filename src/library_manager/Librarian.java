package library_manager;

public class Librarian extends User {
    String fN;
    String lN;


    public Librarian(String firstName, String lastName) {
        this.fN = firstName;
        this.lN = lastName;
    }

    public String getfN() {
        return fN;
    }

    public void setfN(String fN) {
        this.fN = fN;
    }

    public String getlN() {
        return lN;
    }

    public void setlN(String lN) {
        this.lN = lN;
    }

}
