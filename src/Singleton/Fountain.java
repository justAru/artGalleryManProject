package Singleton;

public class Fountain {
    private static Fountain instance = new Fountain();
    private Fountain(){};

    public static Fountain getInstance()
    {
        return instance;
    }

    public void showInfo()
    {
        System.out.println("\n_________Fountaine 17_________");
        System.out.println("Authors: Marcel Duchamp");
        System.out.println("Year: 1917\n");
    }
}
