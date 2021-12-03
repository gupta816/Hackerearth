import java.util.*;



 

class TestClass {

  public static void main(String args[] ) throws Exception {

      Scanner s = new Scanner(System.in);

      int t = s.nextInt();

      for (int i = 0; i < t; i++) {

      String num = s.next();

      int matches = findNumberOfMatches(num); 

      System.out.println(findMaxNumber(matches)); 



  }

  }

  static int findNumberOfMatches(String num)

  {

      int sum=0;

      int a[] = {6,2,5,5,4,5,6,3,7,6};

      for (int i =0; i<num.length(); i++){

      sum = sum + a[num.charAt(i)-'0'];

      }

      return sum;

  }

  static String findMaxNumber(int matches){

            String sum="";

            if(matches%2==0){

            while(matches>0){

            sum = sum + "1";

            matches = matches-2;



            }

            }

            else{

            sum="7";

            while(matches>3){

            sum = sum + "1";

            matches = matches-2;

            }

            }

            return sum;

  }

}
