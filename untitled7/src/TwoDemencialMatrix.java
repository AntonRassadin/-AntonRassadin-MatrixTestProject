import java.util.*;
import java.util.stream.Collectors;

import static java.lang.Math.random;

public class TwoDemencialMatrix implements MatrixInterface {

    protected int[][] array;
    protected int amountFirstDim = 5;
    protected int amountSecondDim = 5;
    private String nameMassive="TwoDemencialMatrix";

    TwoDemencialMatrix(){
        createRandomArray();
    }

    TwoDemencialMatrix(int amountFirstDim, int amountSecondDim){
        this.amountFirstDim=amountFirstDim;
        this.amountSecondDim=amountSecondDim;
        createRandomArray();
    }

/*
    TwoDemencialMatrix(int tets){
        array = new int[][]{{1,10,9},{2,11,8},{3,12,7},{4,5,6}};
        this.amountFirstDim=4;
        this.amountSecondDim=3;
    }
*/

    private void createRandomArray(){
        array = new int[amountFirstDim][amountSecondDim];
        for(int i=0; i<array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) ((random() * 12) - 6);
            }
        }
    }

    public void printMatrix(){
        for(int[] i : array){
            for(int j : i) {
                System.out.println(j);
            }
        }
    }

    public List<Integer> toListSnake(){
        ArrayList<Integer> intList = new ArrayList<Integer>();
        int count = amountFirstDim * amountSecondDim;
        int x = 0;
        int y = amountFirstDim - 1;

        while (count > 0){
            //right
            for (int i = x; i < amountFirstDim-x; i++){
                intList.add(array[i][x]);
                count--;
            }
            x++;
            //down
            for (int i = x; i <= amountSecondDim - x; i++){
                intList.add(array[y][i]);
                count--;
            }
            //left
            for (int i = y-x; i >= x; i--){
                intList.add(array[i][amountSecondDim-x]);
                count--;
            }

            //up
            for (int i = amountSecondDim-x; i >= x; i--){
                intList.add(array[x-1][i]);
                count--;
            }
        }

        return intList;
    }

    protected void printName(){
        System.out.println(nameMassive);
    }

    @Override
    public int min() {
        return Arrays.stream(array).flatMapToInt(Arrays::stream).min().getAsInt();
    }

    @Override
    public int max() {
        return Arrays.stream(array).flatMapToInt(x -> Arrays.stream(x)).max().getAsInt();
    }


}
