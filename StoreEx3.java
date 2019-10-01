import java.util.*;
import java.text.DecimalFormat;
public class StoreEx3 {
  public static void main (String[] args){
    Scanner input= new Scanner(System.in);
    DecimalFormat fmt=new DecimalFormat("0.00");
    int bookNumber;
    System.out.println("Number of books: ");
    bookNumber=input.nextInt();
    double bookCost;
    final double COSTPERBOOK=9.00;
    bookCost=bookNumber*9.00;
    double bookShipping;
    final double SHIPPINGBOOKCOST=0.95;
    bookShipping=bookNumber*0.95;

    double peanutPounds;
    System.out.println("Pounds of peanuts: ");
    peanutPounds= input.nextDouble();
    double peanutCost;
    final double COSTPEANUT=1.72;
    peanutCost=peanutPounds*1.72;
    double peanutShipping;
    final double SHIPPINGPEANUT;
    peanutShipping=peanutPounds*0.30;

    int movieNumber;
    System.out.println("Number of movies: ");

    movieNumber=input.nextInt();
    double movieCost;
    final double COSTMOVIE=13.97;
    movieCost=movieNumber*13.97;
    double movieShipping;
    movieShipping=movieCost*0.04;
    //printing of actual recipt
    System.out.println("\nSteve's S-Mart");
    System.out.println("Served by: Bob");
    int dateMonth;
    dateMonth= (int) (Math.random()*12+1);
    int dateDay;
    dateDay= (int)(Math.random ()*28 +1);
    int timeHour;
    timeHour= (int)(Math.random()*24);
    int timeMinute;
    timeMinute= (int)(Math.random()*60);
    int timeSecond;
    timeSecond= (int)(Math.random()*60);


    System.out.println("Date: "+ dateMonth + "/" + dateDay + "/2019");
    System.out.println("Time: " + (timeHour) +":"+ (timeMinute) + ":"+ timeSecond);
    System.out.println("\n" + bookNumber + " Books: $ " + fmt.format(bookCost));
    fmt.applyPattern("0.#");
    System.out.print (fmt.format(peanutPounds));
    fmt.applyPattern("0.00");
    System.out.println( " Peanuts: $ "+ fmt.format(peanutCost));
    System.out.println(movieNumber + " Movie: $ " + fmt.format(movieCost));
    System.out.println("-------------------------------");
    double taxes;
    taxes=0.072*(movieCost+bookCost);
    System.out.println("Taxes: $ " + fmt.format(taxes));
    double totalShipping;
    totalShipping=movieShipping+bookShipping+peanutShipping;
    System.out.println("Shipping: $ " + fmt.format(totalShipping));
    double grandTotal;
    grandTotal= movieCost+bookCost+peanutCost+totalShipping+taxes;
    System.out.println("Grand Total: $ " + fmt.format(grandTotal));
    System.out.println("\nIt's always a breeze with Steve!");
}







}
