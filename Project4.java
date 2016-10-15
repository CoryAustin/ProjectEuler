public class Project4{
  public static Boolean isPalindrome(int n){
    String str = Integer.toString(n);
    for(int i = 0; i < str.length()/2; i++){
      if(str.charAt(i) != str.charAt(str.length() - 1 - i))
        return false;
    }
    return true;
  }
  public static void main(String[] args){
    int max = 0;
    int i = 999;
    while(i > 900){
      int j = i;
      while(j > 900){
        if(isPalindrome(i*j) && i*j > max)
          max = i*j;
        j--;
      }
    i--;
    }
  System.out.println(max);
  }
}
