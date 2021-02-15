package VisitorProxy;

public class ArtLover implements GalleryVisitor {
    @Override
    public String visit(PaintingsHall pHall) {
        System.out.println("\nIn the Paintings hall:");
        pHall.addItems();
        return "***ArtLover***: This is luxury!";
    }

    @Override
    public String visit(SculpturesHall Shall) {
        System.out.println("\nIn the Sculptures hall:");
        Shall.addItems();
        return "***ArtLover***: Canova leaves such a great impression!";
    }

    @Override
    public String visit(SmallHall SmHall) {
        System.out.println("\nIn the Small hall:");
        SmHall.addItems();
        return "***ArtLover***: Marvelous work of art!";
    }
}
