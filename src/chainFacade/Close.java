package chainFacade;

public class Close extends Notifier {
    public Close(int priority) {
        super(priority);
    }

    @Override
    public void write(String msg) {
        System.out.println("**************************Close Gallery...**********************" + msg);
    }
}
