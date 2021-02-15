package Factory;

public abstract class Painting {
    String name;
    String author;
    int creationYear;



    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return  "\n-----------Painting-----------\n" +
                "Name: '" + name + "\n" +
                "Author: " + author + "\n" +
                "Painting was created in: " + creationYear + "\n";
    }
}
