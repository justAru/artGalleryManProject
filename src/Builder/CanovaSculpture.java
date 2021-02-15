package Builder;

public class CanovaSculpture extends AbstractSculptureBuilder {
    public CanovaSculpture(AbstractSculpture sculpture){
        this.sculpture = sculpture;
    }

    @Override
    public void setName(String s) {
    this.sculpture.name = s;
    }

    @Override
    public void setName() {
        this.sculpture.name = "Perseus with the Head of Medusa";
    }

    @Override
    public void setAuthor() {
        this.sculpture.author = "Antonio Canova";
    }

    @Override
    public void setYear() {
        this.sculpture.creationYear = 1804;
    }

    @Override
    public void setYear(int y) {
        this.sculpture.creationYear = y;
    }
}
