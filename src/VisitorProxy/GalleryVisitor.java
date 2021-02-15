package VisitorProxy;

public interface GalleryVisitor {

    String visit(PaintingsHall pHall);
    String visit(SculpturesHall Shall);
    String visit(SmallHall SmHall);

}
