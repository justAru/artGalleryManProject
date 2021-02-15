package VisitorProxy;

public interface ItemsCollection {
    public String accept(GalleryVisitor visitor);
    public abstract void addItems();
}
