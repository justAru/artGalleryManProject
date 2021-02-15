package Strategy;

import VisitorProxy.*;

public class VisitorOccupation extends GalleryAppUser {
    public VisitorOccupation(){
        userBehaviour = new VisitGallery();
    }

    @Override
    public void performOperation() {
        PaintingsHall paintings1 = new PaintingsHall();
        SculpturesHall sculptures1 = new SculpturesHall();
        SmallHall small1 = new SmallHall();

        System.out.println("\n__________First visitors go to the gallery__________");
        System.out.println("\nThe expert visits gallery");
        GalleryVisitor visitor = new ProxyVisitor("expert");
        System.out.println(visitor.visit(paintings1));
        System.out.println(visitor.visit(sculptures1));
        System.out.println(visitor.visit(small1));

        System.out.println("\nThe artlover visit gallery");
        visitor = new ProxyVisitor("artLover");
        System.out.println(visitor.visit(paintings1));
        System.out.println(visitor.visit(sculptures1));
    }
}
