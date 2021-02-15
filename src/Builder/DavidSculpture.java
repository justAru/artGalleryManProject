package Builder;

public class DavidSculpture extends AbstractSculptureBuilder{
    public DavidSculpture(AbstractSculpture sculpture) {
        this.sculpture = sculpture;
    }

    @Override
    public void setName(String s) {
        this.sculpture.name = s;
    }

    @Override
    public void setName() {
        this.sculpture.name = "David";
    }

    @Override
    public void setAuthor() {
        this.sculpture.author = "Michelangelo";
    }

    @Override
    public void setYear() {
        this.sculpture.creationYear = 1501;
    }

    @Override
    public void setYear(int y) {
        this.sculpture.creationYear = y;
    }
}
