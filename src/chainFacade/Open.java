package chainFacade;

public class Open extends Notifier {
    public Open(int priority) {
        super(priority);
    }

    @Override
    public void write(String msg) {
        System.out.println("***************************Open ArtGallery...*********************************" + msg);
    }
}
