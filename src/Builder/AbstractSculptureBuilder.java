package Builder;

public abstract class AbstractSculptureBuilder {
    protected AbstractSculpture sculpture;

    public abstract void setName(String s);
    public abstract void setName();
    public abstract void setAuthor();
    public abstract void setYear();
    public abstract void setYear(int y);

    public AbstractSculpture getSculpture()
    {
        return sculpture;
    } //getter for concrete sculpture
}
