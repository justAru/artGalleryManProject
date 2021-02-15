package Factory;

import java.util.HashMap;
import java.util.Map;

public class PaintingFactory {

    private Map<String, Painting> paint = new HashMap<String, Painting>();

    public Painting findPainting(String type) {

        if(paint.containsKey(type))
        {
            return paint.get(type);
        }
        else
        {
            Painting painting = null;

            if(type.equals("Da Vinci"))
            {
                painting = new MonaPainting();
            }
            if(type.equals("Vermeer"))
            {
                painting = new GirlWPainting();
            }
            if(type.equals("Botticelli"))
            {
                painting = new BirthOfVenusPianting();
            }
            if(type.equals("Whistler"))
            {
                painting = new ArrangementInGreyPainting();
            }
            if(type.equals("Van Gogh"))
            {
                painting = new TheStarryNightPainting();
            }
            paint.put(type, painting);
            return painting;
        }
    }
}
