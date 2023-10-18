import java.util.Scanner;

public class Solution {
    static int BithDayCackCandles(){
        Scanner in  =new Scanner(System.in);
        int n =in.nextInt();
        int []candles= new int[n];


        for(int i =0;i<n;i++){
            candles[i]=in.nextInt();
        }

        int max=0;
        for(int i=0;i<n;i++){
            if(max<candles[i]){
                max  =candles[i];
            }
        }
        int tallest =0;
        for(int i=0;i<n;i++){
            if (max==candles[i]) {
                tallest++;

            }

        }
        return tallest;


    }




    public static void main(String[] args) {

        System.out.println(BithDayCackCandles());

    }
}
