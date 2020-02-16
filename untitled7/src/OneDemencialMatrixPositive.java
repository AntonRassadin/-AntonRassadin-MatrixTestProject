import static java.lang.Math.random;

public class OneDemencialMatrixPositive extends  OneDemencialMatrix{
    private String nameMassive="OneDemencialMatrixPositive";

    OneDemencialMatrixPositive(){
        amount=5;
        array = new int[amount];
        for(int i=0; i<array.length;i++){
            array[i]=(int)((random()*12));
        }

    }

    OneDemencialMatrixPositive(int amount){
        this.amount=amount;
        array = new int[this.amount];
        for(int i=0; i<array.length;i++){
            array[i]=(int)((random()*12));
        }

    }


    protected final void printName(){
        System.out.println(nameMassive);
    }

}
