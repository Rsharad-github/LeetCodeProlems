class Q8BuySellStockII{
  public static void main(String[] args){
    int [] prices={7,1,5,3,6,4};
    int profit=0;
    for(int i=1;i<prices.length;i++){
      if(prices[i]>prices[i-1]){
        profit+=prices[i]-prices[i-1];
      }
      
    }
    System.out.println("profit"+profit);
  }
}