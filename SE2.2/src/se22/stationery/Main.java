package se22.stationery;

import java.util.ArrayList;

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
        pen1.price=1.9;
        pen1.title="Pen";

        Stationery pencil1=new Stationery();
        pencil1.price=1.5;
        pencil1.title="Pencil";

        Stationery eraser = new Stationery ();
        eraser.price=0.7;
        eraser.title="Eraser";

        Stationery scissors = new Stationery();
        scissors.price = 1.7;
        scissors.title="Scissors";

        employee1.addStationery(pencil1);
        employee1.addStationery(pen1);
        employee1.addStationery(scissors);



        System.out.println("Employee: " + employee1.name + ", ID: " +employee1.employeeID+ ". Total stationery cost: $" +employee1.getSum() + ".");


        System.out.print ("Employee: " + employee1.name + ", ID: " +employee1.employeeID + ". Stationary: ");


        ArrayList<Stationery> employee1StationeryList = employee1.getStationeryList();
        int n=employee1StationeryList.size();

        for (int i=0; i<n; i++) {
            System.out.print (employee1StationeryList.get(i).title + " ($"+employee1StationeryList.get(i).price+")");
            if (i == n-1) {
                System.out.println (".");
            } else
                System.out.print (", ");
        }




    }
}
