import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

import static java.lang.Math.random;

public class OneDemencialMatrix implements MatrixInterface {

    protected int[] array;
    protected int amount;
    private String nameMassive="OneDemencialMatrix";

    OneDemencialMatrix(){
        amount=5;
        array = new int[amount];
        for(int i=0; i<array.length;i++){
            array[i]=(int)((random()*12)-6);
        }

    }

    OneDemencialMatrix(int amount){
        this.amount=amount;
        array = new int[this.amount];
        for(int i=0; i<array.length;i++){
            array[i]=(int)((random()*12)-6);
        }

    }

    public void printMatrix(){
        for(int i=0; i<array.length;i++){
            System.out.println(array[i]);
        }
    }

    public int countPositive(){
        return (int)Arrays.stream(array).filter(x->x>=0).count();
    }



    public final int countNegative(){
        return (int)Arrays.stream(array).filter(x->x<0).count();
    }

    protected void printName(){
        System.out.println(nameMassive);
    }

    @Override
    public int min() {
        return Arrays.stream(array).min().getAsInt();
    }

    @Override
    public int max() {
        return Arrays.stream(array).max().getAsInt();
    }
}
