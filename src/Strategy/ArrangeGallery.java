package Strategy;

public class ArrangeGallery implements GalleryUserBehaviour {
    @Override
    public void execute() {
        System.out.println("I am a manager. All I need to do is to order the paintings");
    }
}
