package Strategy;

import Factory.Painting;
import VisitorProxy.*;
import chainFacade.*;

public class ManagerOccupation extends GalleryAppUser {

    public ManagerOccupation(){
        userBehaviour = new ArrangeGallery();
    }

    @Override
    public void performOperation() {
        Notifier manager = new Open(Priority.Open);
        Notifier manager1 = new Arrange(Priority.Arrange);
        Notifier manager2 = new Close(Priority.Close);

        manager.setNextNotifier(manager1);
        manager1.setNextNotifier(manager2);

        manager.notifyManager("\nArt Gallery is Open!\n", Priority.Open);
        manager1.notifyManager("\nArranging Art Gallery!\n", Priority.Arrange);
        manager2.notifyManager("\nEnd of the working day!\n", Priority.Close);

    }
}
