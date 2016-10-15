public class Problem2{
  public static void main(String[] args){
      int i = 1, j = 1, k = 0, sum = 0;
      while(k < 4000000){
      if(k % 2 == 0)
        sum = sum + k;
      k = i + j;
      j = i;
      i = k;
      }
      System.out.println(sum);
  }
}
