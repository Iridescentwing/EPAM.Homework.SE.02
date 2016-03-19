package se22.stationery;

/**
 * Created by Ekaterina on 19.03.16.
 */
public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.name="Jack Dowson";
        employee1.position="SEO";
        employee1.employeeID=8342;

        Stationery pen1= new Stationery();
        pen1.price=1;
        pen1.title="Pen";

        Stationery pencil1=new Stationery();
        pencil1.price=2;
        pencil1.title="Pencil";

        Stationery eraser = new Stationery ();
        eraser.price=7;
        eraser.title="Eraser";

        Stationery scissors = new Stationery();
        scissors.price = 1;
        scissors.title="Scissors";

        employee1.addStationery(pencil1);
        employee1.addStationery(pen1);
        employee1.addStationery(scissors);

        System.out.println(employee1.getSum());



    }
}
