import java.util.Scanner;
// this class is able to make use of the information provide on the beveragesales class
abstract class Beverage extends BeveragesSales{
  public Beverage(String n,double s)
          // superclass
  {super(n,s);}

  public String getBeverageType()
          // output or feedback
 {return "tea";}
}
abstract class coffee extends BeveragesSales{
  public coffee(String n,double s){super(n,s);}
  public String getBeverageType(){return "cofee";}
}
abstract class boba extends BeveragesSales{
  public boba(String n,double s){super(n,s);}
  public String getBeverageType(){return "boba";}
}

public class beverage{

    public beverage(String name, double sales) {
    }
  public static void main(String[] args){
      // saves what the user enterterd
    Scanner sc = new Scanner(System.in);
    //user required to type city
    System.out.print("Enter city: ");
    String name = sc.nextLine();
    // user is required to enter total amount of sales
    System.out.print("Enter Total Sales: ");
    double sales = sc.nextDouble();
    // options
    System.out.print("Choose 1=coffee 2=tea 3= boba: ");
    int c = sc.nextInt();

    beverage con; // beverage choice
    if(c==1) con = new beverage(name,sales);
    else con = new beverage(name,sales);

    System.out.println(con.getCity()+" "+con.getBeverageType()+" "+con.getTotalSales());
    con.createFile();
  }
// create the file in the folder
    private String getCity() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void createFile() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String getBeverageType() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String getTotalSales() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}