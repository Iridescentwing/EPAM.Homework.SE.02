package se22.stationery;

import java.util.ArrayList;

/**
 * Created by Ekaterina on 19.03.16.
 */
public class Employee {

    public String name;
    public String position;
    public int employeeID;

   private ArrayList<Stationery> stationeryList= new ArrayList<Stationery>();

    public void addStationery(Stationery stationery) {
        stationeryList.add(stationery);

    }

    public void removeStationery (Stationery stationery) {
        stationeryList.remove(stationery);
    }

    public double getSum () {
        double sum =0;
        for (int i=0; i<stationeryList.size(); i++) {
            sum += stationeryList.get(i).price;
        }
        return sum;
    }

}
