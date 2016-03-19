package hw02.pen;

/**
 * Created by Ekaterina on 19.03.16.
 */
public class Pen {
    public String mark;
    public String color;
    public int length;
    public int price;
    public boolean canWrite;

    public boolean equals(Pen p) {
        if (this.hashCode() != p.hashCode()) {
            return false;
        }
        return this.mark == p.mark && this.color == p.color && this.length == p.length && this.price == p.price && this.canWrite == p.canWrite;
    }

    @Override
    public int hashCode() {
        int result = 37;
        result = result * this.length + this.price;
        return result;
    }

    @Override
    public String toString() {
        return "Ручка марки " + this.mark + ". Цвет: " + this.color + ". Длина: " + this.length + " см. Цена: " + this.price + " руб.";
    }
}
