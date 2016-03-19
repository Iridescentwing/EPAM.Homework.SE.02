package hw02.pen;


/**
 * Created by Ekaterina on 19.03.16.
 */


public class Main {
    public static void main(String[] args) {
        Pen one = new Pen();
        Pen two = new Pen();
        one.mark = "Watermark";
        two.mark = "Watermark";
        one.color = "red";
        two.color = "light blue";
        one.length = 13;
        two.length = 14;
        one.price = 21;
        two.price = 21;
        if (one.equals(two)) {
            System.out.println("Объекты равны.");
        } else {
            System.out.println("Объекты не равны.");
        }
        System.out.println(one.hashCode());
        System.out.println(two.hashCode());
        System.out.println(one.toString());
        System.out.println(two.toString());
    }
}