import java.util.Random;

public class RandomNumbers{
  public static void main(String[] args){
    Random rand = new Random();

    System.out.println("# [0,9]:  " + rand.nextInt(10));
    System.out.println("# [0,9]:  " + (int) (Math.random()*10));

    System.out.println("# [1,10]:  " + (rand.nextInt(10) + 1) );

    System.out.println("Student#: " + (int) (Math.random()*35+1));
  }
}
