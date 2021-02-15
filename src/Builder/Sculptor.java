package Builder;

public class Sculptor {

    public AbstractSculpture collect(AbstractSculptureBuilder builder)
    {
        builder.setName();
        builder.setAuthor();
        builder.setYear();
        return builder.getSculpture();
    }
}
