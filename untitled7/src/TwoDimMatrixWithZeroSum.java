import java.util.Arrays;
import static java.lang.Math.random;

public class TwoDimMatrixWithZeroSum extends TwoDemencialMatrix{
    private String nameMassive="TwoDemencialMatrixWIthZeroSum";
    TwoDimMatrixWithZeroSum(){
        array = new int[][]{{4,-1,2},{5,-3,-1},{-3,-2,-1}};
        isSumZero();
    }

    TwoDimMatrixWithZeroSum(int amountFirstDim, int amountSecondDim){
        super(amountFirstDim, amountSecondDim);
        isSumZero();
    }

    public int[][] getArray(){
        return array;
    }

    public void setArray(int[][] array){
        this.array = array;
        isSumZero();
    }

    private void isSumZero(){
        if(Arrays.stream(array).flatMapToInt(Arrays::stream).sum() != 0){
            throw new AssertionError("Sum of all items is not zero");
        }
    }
/*    private void createRandomArrayWithZeroSum(){
        array = new int[amountFirstDim][amountSecondDim];
        for(int i=0; i<array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(i==0&&j==0){
                    array[i][j] = (int) ((random() * 12) - 6);
                }else {
                    while (true) {
                        int randomInt = (int) ((random() * 12) - 6);
                        if (Arrays.stream(array).flatMapToInt(Arrays::stream).sum() + randomInt == 0)
                            array[i][j] = randomInt;
                        break;
                    }
                }
            }
        }
    }*/
}
