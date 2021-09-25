package HomeWork_3;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    protected ArrayList<T> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        this.fruits.add(fruit);
    }

    public void removeFruit() {
        this.fruits.remove(this.getBoxSize() -1);
    }

    public void moveFruitToOtherBox(Box<T> other) {
        other.addFruit(this.fruits.get(this.getBoxSize() -1));
        this.removeFruit();
    }

    public int getBoxSize() {
        return this.fruits.size();
    }

    public double getWeight() {
        double sum = 0;
        for (T fruit : this.fruits) {
            sum += fruit.getFruitWeight();
        }
        return sum;
    }

    public boolean compare(Box<?> other) {
        return Math.abs(this.getWeight() - other.getWeight()) < 0.001;
    }

    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        for (int i = 0; i < 7; i++) {
            appleBox.addFruit(new Apple());
        }

        Box<Orange> orangeBox = new Box<>();
        for (int i = 0; i < 5; i++) {
            orangeBox.addFruit(new Orange());
        }

        System.out.println("Коробка с яблоками весит = " + appleBox.getWeight());
        System.out.println("Коробка с апельсинами весит = " + orangeBox.getWeight());
        if (appleBox.compare(orangeBox)) {
            System.out.println("Вес коробок одинаковый");
        } else {
            System.out.println("Вес коробок разынй");
        }

        System.out.println("Яблок в коробке " + appleBox.getBoxSize() + " шт.");
        Box<Apple> otherAppleBox = new Box<>();
        for (int i = 0; i < 7; i++);
            appleBox.moveFruitToOtherBox(otherAppleBox);

        System.out.println("Часть яблок переложиди в другую коробку");
        System.out.println("В первой коробке " + appleBox.getBoxSize() + " яблок");
        System.out.println("Во второй коробке " + otherAppleBox.getBoxSize() + " яблок");

    }

}
