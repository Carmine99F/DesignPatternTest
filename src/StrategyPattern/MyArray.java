package StrategyPattern;
//Classe context che utilizza l'intrfaccia Strategy
public class MyArray {
    private int array[];
    private int size;
    private ArrayDisplayFormat format;


    public MyArray( int size ) {
        array = new int[ size ];
    }

    public void setDisplayFormat( ArrayDisplayFormat adf ) {
        format = adf;
    }
    public void display() {
        format.printData( array );
    }

    public void setValue( int pos, int value ) {
        array[pos] = value;
    }
    public int getValue( int pos ) {
        return array[pos];
    }
    public int getLength( int pos ) {
        return array.length;
    }
}
