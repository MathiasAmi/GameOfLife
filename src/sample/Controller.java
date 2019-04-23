package sample;

import javafx.event.ActionEvent;

public class Controller {




    public void test(ActionEvent actionEvent) {


        Cell cell1 = new Cell(2,true);
        Cell cell2 = new Cell(3,true);
        Cell cell3 = new Cell(2, false);
        Cell cell4 = new Cell(3,false);
        Cell cell5 = new Cell(10, true);

        cell1.update(); //Should turn out alive
        cell2.update(); //Should turn out alive
        cell3.update(); //Should turn out dead
        cell4.update(); //Should turn out alive
        cell5.update(); //Should turn out dead


        System.out.println("Cell 1 is " + cell1.isAlive() + " and should be alive!");
        System.out.println("Cell 2 is " + cell2.isAlive() + " and should be alive!");
        System.out.println("Cell 3 is " + cell3.isAlive() + " and should be dead!");
        System.out.println("Cell 4 is " + cell4.isAlive() + " and should be alive!");
        System.out.println("Cell 5 is " + cell5.isAlive() + " and should be dead!");




    }
}
