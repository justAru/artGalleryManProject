package chainFacade;

import VisitorProxy.PaintingsHall;
import VisitorProxy.SculpturesHall;
import VisitorProxy.SmallHall;

public class Arrange extends Notifier {
    public Arrange(int priority) {
        super(priority);
    }

    @Override
    public void write(String msg) {
        System.out.println("\n**********************Arrange...*********************************\n" + msg);

        PaintingsHall paintings1 = new PaintingsHall();
        SculpturesHall sculptures1 = new SculpturesHall();
        SmallHall small1 = new SmallHall();

        paintings1.addItems();
        sculptures1.addItems();
        small1.addItems();
        System.out.println("\n****************************************************************\n");
    }

}
