package games;

public class Games {

    private String genre;
    private double memory;

    public Games(String genre, double memory){
        this.genre = genre;
        this.memory = memory;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getMemory() {
        return this.memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }
}
