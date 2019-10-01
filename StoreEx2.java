import java.util.Scanner;
import java.util.Random;
public class StoreEx2{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
final double COST_BOOKS = 9.0;
final double costPeanuts = 1.72;
final double costMovies = 13.97;
final double shippingBooks = 0.95;
final double shippingPeanuts = 0.3;
final double shippingMovies = 0.04;

System.out.println("enter the number of books bought");
double Books = input.nextDouble();
System.out.println("enter how many pounds of peanuts bought");
double Peanuts = input.nextDouble();
System.out.println("enter the number of movies bought");
double Movies = input.nextDouble();

double totalBooksCost = Math.round(Books*costBooks*100.0)/100.0;

double totalPeanutCost = Math.round(Peanuts*costPeanuts*100.0)/100.0;

double totalMoviesCost = Math.round(Movies*costMovies*100.0)/100.0;


double Subtotal = Math.round(((Books*costBooks) + (Peanuts*costPeanuts) + (Movies*costMovies))*100.0)/100.0;

double shippingCost = (Math.round((Books*.95) + (Peanuts*.3) + (Movies*costMovies*.04)*100.0))/100.0;

double taxes = Math.round(((totalMoviesCost + totalBooksCost)*0.072)*100.0)/100.0;

double grandTotal = Math.round((shippingCost + Subtotal + taxes)*100.0)/100.0;


String cashier = "Greg";
String store = "Steve's S-mart";

Random rand = new Random();
int date1 = rand.nextInt(12)+1;
int date2 = rand.nextInt(28)+1;
String date = date1 +"/"+ date2;
int time1 = rand.nextInt(23)+1;
int time2 =  rand.nextInt(60)+1;
String time = time1 + ":" + time2;

System.out.println("************************");
System.out.println("  "+store+"   ");
System.out.println("  "+cashier+"  "+date+" "+time);
System.out.println(Books + " Books $" + totalBooksCost);
System.out.println(Peanuts + " Peanuts $" + totalPeanutCost);
System.out.println(Movies + " Movies $" + totalMoviesCost);
System.out.println("Subtotal is $" + Subtotal);
System.out.println("Shipping cost is $" + shippingCost);
System.out.println("Taxes are $"+ taxes);
System.out.println("Grand total is $" + grandTotal);
System.out.println("************************");
}
}
