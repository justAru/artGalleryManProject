package VisitorProxy;

import Builder.*;

public class SculpturesHall implements ItemsCollection {
    @Override
    public String accept(GalleryVisitor visitor) {
        return visitor.visit(this);
    }

    @Override
    public void addItems() {
        System.out.println("\n **********Sculptures Hall**********");



        AbstractSculpture a_sculpture = new ConcreteSculptor();
        AbstractSculptureBuilder builder = new CanovaSculpture(a_sculpture);
        Sculptor collector = new Sculptor();

        a_sculpture = collector.collect(builder);
        a_sculpture.getInfo();

        builder = new BerniniSculpture(a_sculpture);
        a_sculpture = collector.collect(builder);
        a_sculpture.getInfo();

        builder = new DavidSculpture(a_sculpture);
        a_sculpture = collector.collect(builder);
        a_sculpture.getInfo();

        builder.setName("The Kiss41");
        builder.setYear(1889);
        AbstractSculpture copy_sculpture = (ConcreteSculptor) a_sculpture.clone();
        copy_sculpture.getInfo();
    }
}
