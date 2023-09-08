package StrategyPattern;
//Classe ConcreteStrategy
public class MathFormat implements ArrayDisplayFormat{
    @Override
    public void printData(int[] array) {
        for(int i=0; i < array.length ; i++ )
            System.out.println( "Array[ " + i + " ] = " + array[i] );
    }
}
