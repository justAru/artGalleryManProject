package VisitorProxy;

import org.w3c.dom.UserDataHandler;

public class ProxyVisitor implements GalleryVisitor {
    ArtLover artLover;
    Expert expert;
    String visitor;
    String result = " ";

    public ProxyVisitor(String visitor) {
        this.visitor = visitor;
    }

    @Override
    public String visit(PaintingsHall pHall) {
        if (visitor.matches("expert")){
            Expert expert = new Expert();
            result = expert.visit(pHall);
        } else if (visitor.matches("artLover")){
            ArtLover artLover = new ArtLover();
            result = artLover.visit(pHall);
        }
        return result;
    }

    @Override
    public String visit(SculpturesHall Shall) {
        if (visitor.matches("expert")){
            Expert expert = new Expert();
            result = expert.visit(Shall);
        } else if (visitor.matches("artLover")){
            ArtLover artLover = new ArtLover();
            result = artLover.visit(Shall);
        }
        return result;
    }

    @Override
    public String visit(SmallHall SmHall) {
        if (visitor.matches("expert")){
            Expert expert = new Expert();
            result = expert.visit(SmHall);
        } else if (visitor.matches("artLover")){
            ArtLover artLover = new ArtLover();
            result = "Acces to the Small hall is limited!";
        }
        return result;
    }
}
