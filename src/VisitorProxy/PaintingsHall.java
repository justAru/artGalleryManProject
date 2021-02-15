package VisitorProxy;

import Factory.*;

import java.util.ArrayList;

public class PaintingsHall implements ItemsCollection {

    ArrayList<Painting> paintings_hall;

    public PaintingsHall()
    {
        paintings_hall = new ArrayList<>();
    }

    @Override
    public String accept(GalleryVisitor visitor) {
        return visitor.visit(this);
    }

    @Override
    public void addItems() {

        paintings_hall.add(new MonaPainting());
        paintings_hall.add(new GirlWPainting());
        paintings_hall.add(new ArrangementInGreyPainting());
        paintings_hall.add(new BirthOfVenusPianting());
        paintings_hall.add(new TheStarryNightPainting());

        for(Painting p: paintings_hall)
        {
            System.out.println(p.toString());
        }
    }
}
