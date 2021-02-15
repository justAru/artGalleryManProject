package Strategy;

public class VisitGallery implements GalleryUserBehaviour {
    @Override
    public void execute() {
        System.out.println("Hello, I'm a visitor!");
    }
}
