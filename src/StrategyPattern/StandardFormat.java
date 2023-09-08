package StrategyPattern;
//Classe ConcreteStrategy

public class StandardFormat implements ArrayDisplayFormat{
    @Override
    public void printData(int[] array) {
            System.out.print( "{ " );
            for(int i=0; i < array.length-1 ; i++ )
                System.out.print( array[i] + ", " );
            System.out.println( array[array.length-1] + " }" );
        }


}
