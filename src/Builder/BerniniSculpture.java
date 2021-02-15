package Builder;

public class BerniniSculpture extends AbstractSculptureBuilder {
    public BerniniSculpture(AbstractSculpture sculpture) {
        this.sculpture = sculpture;
    }

    @Override
    public void setName(String s) {
        this.sculpture.name = s;
    }

    @Override
    public void setName() {
        this.sculpture.name = "Ecstasy of Saint Teresa";
    }

    @Override
    public void setAuthor() {
    this.sculpture.author = "Gian Lorenzo Bernini";
    }

    @Override
    public void setYear() {
        this.sculpture.creationYear = 1647;
    }

    @Override
    public void setYear(int y) {
        this.sculpture.creationYear = y;
    }
}
