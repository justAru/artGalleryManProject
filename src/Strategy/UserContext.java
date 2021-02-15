package Strategy;

public class UserContext {
    private GalleryUserBehaviour userBehaviour;

    public UserContext(){
        this.userBehaviour = new VisitGallery();
    }
    public UserContext(GalleryUserBehaviour userBehaviour){
        this.userBehaviour = new VisitGallery();
    }

    public void performOperation(){
        userBehaviour.execute();
    }

    public void setUserBehaviour(GalleryUserBehaviour userBehaviour){
        this.userBehaviour = userBehaviour;
    }
}
