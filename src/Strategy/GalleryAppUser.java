package Strategy;

public abstract class GalleryAppUser {
    GalleryUserBehaviour userBehaviour;

    public GalleryAppUser(){}

    public void setUserBehaviour(GalleryUserBehaviour u_b){
        userBehaviour = u_b;
    }

    public void performOperation(){
        userBehaviour.execute();
    }
}
