package VisitorProxy;

public class Expert implements GalleryVisitor {
    @Override
    public String visit(PaintingsHall pHall) {
        System.out.println("\nIn the Paintings hall:");
        pHall.addItems();
        return "***Expert***: Religious scenes in high renaissance are showed exalted";
    }

    @Override
    public String visit(SculpturesHall Shall) {
        System.out.println("\nIn the Sculptures hall:");
        Shall.addItems();
        return "***Expert***: Canova's sculptures shows the true meaning of life. It's fantastic.";
    }

    @Override
    public String visit(SmallHall SmHall) {
        System.out.println("\nIn the Small hall:");
        SmHall.addItems();
        return "***ArtLover***: No words!";
    }
}
