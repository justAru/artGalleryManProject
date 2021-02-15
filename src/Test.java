import Facade.GalleryFacade;
import Strategy.ArrangeGallery;
import Strategy.VisitGallery;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        GalleryFacade facade = new GalleryFacade();
        facade.chooseOccupation();
    }
}
