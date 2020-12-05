package Arrays;

public class BestTimeToBuyStock {
    public static int maxProfit(int[] prices) {
        if(prices.length == 0){
            return 0;
        }
        int max =0 ;
        int min = prices[0];
        for(int i = 0 ; i< prices.length ; i++){
            if(prices[i] > min ){
                max = Math.max(max  , prices[i] - min);

            }else{
                min = prices[i];

            }


        }
        System.out.println(min);
        return max;
    }

    public static void main(String[] args) {
        int[] array = {1,2,4};
        System.out.println(maxProfit(array));
    }
}
