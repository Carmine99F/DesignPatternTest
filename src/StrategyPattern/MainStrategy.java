package StrategyPattern;

public class MainStrategy {

    public static void main(String[] args) {
        MyArray array = new MyArray(10);
        array.setValue(0,12);
        array.setValue(3,34);
        array.setValue(5,89);
        array.setValue(6,54);

        array.setDisplayFormat(new StandardFormat());
        array.display();
        array.setDisplayFormat(new MathFormat());
        array.display();
    }
}
