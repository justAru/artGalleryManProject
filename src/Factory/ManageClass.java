package Factory;

public class ManageClass {

    PaintingFactory factory;

    public ManageClass(PaintingFactory factory){
        this.factory = factory;
    }

    public Painting createPainting(String type){
        Painting painting = factory.findPainting(type);
        return painting;
    }
}
