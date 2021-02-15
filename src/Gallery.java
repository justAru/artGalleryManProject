import Builder.*;
import Factory.ManageClass;
import Factory.Painting;
import Factory.PaintingFactory;
import Singleton.Fountain;

public class Gallery {
    public void createPaintingHall()
    {
        System.out.println("\n **********Painting Hall**********");
        PaintingFactory factory = new PaintingFactory();
        ManageClass desk = new ManageClass(factory);
        Painting painting = desk.createPainting("Da Vinci");
        System.out.println(painting.toString());
        painting = desk.createPainting("Vermeer");
        System.out.println(painting.toString());
        painting = desk.createPainting("Botticelli");
        System.out.println(painting.toString());
        painting = desk.createPainting("Whistler");
        System.out.println(painting.toString());
        painting = desk.createPainting("Van Gogh");
        System.out.println(painting.toString());
    }

    public void createSculpturesHall() {
        System.out.println("\n **********Sculptures Hall**********");
        AbstractSculpture a_sculpture = new ConcreteSculptor();
        AbstractSculptureBuilder builder = new CanovaSculpture(a_sculpture);
        Sculptor collector = new Sculptor();

        a_sculpture = collector.collect(builder);
        a_sculpture.getInfo();

        builder = new BerniniSculpture(a_sculpture);
        a_sculpture = collector.collect(builder);
        a_sculpture.getInfo();

        builder = new DavidSculpture(a_sculpture);
        a_sculpture = collector.collect(builder);
        a_sculpture.getInfo();

        builder.setName("The Kiss");
        builder.setYear(1889);
        AbstractSculpture copy_sculpture = (ConcreteSculptor) a_sculpture.clone();
        copy_sculpture.getInfo();
    }

    public void createFountainHall()
    {
        System.out.println("\n **********Small Hall**********");
        Fountain fireplace = Fountain.getInstance();
        fireplace.showInfo();
    }
}
