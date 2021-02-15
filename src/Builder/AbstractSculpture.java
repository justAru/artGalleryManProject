package Builder;

public abstract class AbstractSculpture implements Cloneable{

        String name = "";
        String author = "";
        int creationYear;

        public abstract void getInfo();

        @Override
        public Object clone() {
            try
            {
                return super.clone();
            }
            catch(CloneNotSupportedException e)
            {
                return null;
            }
        }
    }
