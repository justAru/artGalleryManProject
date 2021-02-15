package Builder;

public class ConcreteSculptor extends AbstractSculpture {
    Sculptor sculptor;

    public ConcreteSculptor()
    {
        sculptor = new Sculptor();
    }

    @Override
    public void getInfo() {
        System.out.println("_________Sculpture_________");
        System.out.println("Name: " + name + "\nAuthor: " + author + "\n"
                + "The sculpture was created in: "+ creationYear + " \n");
    }
}
