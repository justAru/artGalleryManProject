package VisitorProxy;

import Singleton.Fountain;

public class SmallHall implements ItemsCollection{
    @Override
    public String accept(GalleryVisitor visitor) {
        return null;
    }

    @Override
    public void addItems() {
        System.out.println("\n **********Small Hall**********");
        Fountain fireplace = Fountain.getInstance();
        fireplace.showInfo();
    }
}
