class CandyCount {
    public static void main(String[] args) {
        double real = 12.4;
        double price = 1.2;
        int candies = 0;
        if(real > 0 && price > 0){
            while((real - price) >=0 ){
                candies = candies + 1;
                real = real - price;

            }
        }
        System.out.println(candies);
    }
}


