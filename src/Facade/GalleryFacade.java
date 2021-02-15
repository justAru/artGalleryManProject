package Facade;

import Strategy.ArrangeGallery;
import Strategy.ManagerOccupation;
import Strategy.VisitGallery;
import Strategy.VisitorOccupation;
import VisitorProxy.GalleryVisitor;
import chainFacade.*;

import java.util.Scanner;

public class GalleryFacade {
    Scanner scan;
    VisitorOccupation visitorOccupation;
    ManagerOccupation managerOccupation;


    public GalleryFacade() {
        this.scan = new Scanner(System.in);
        this.visitorOccupation = new VisitorOccupation();
        this.managerOccupation = new ManagerOccupation();
    }

    public void chooseOccupation() {
        while (true) {
            System.out.println("\n\nWelcome to the Gallery!!");
            System.out.println("*********************************************");
            System.out.println("Type 1 - if you are a visitor. Type 2 - if you are a manager");
            int input = scan.nextInt();

            if (input == 1) {
                visitorOccupation.setUserBehaviour(new VisitGallery());
                visitorOccupation.performOperation();
            } else if (input == 2) {
                managerOccupation.setUserBehaviour(new ArrangeGallery());
                managerOccupation.performOperation();
            }
        }
    }
}



