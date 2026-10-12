import java.io.FileWriter;
public abstract class BeveragesSales implements IBeverage {
  String city; double sales;
  public BeveragesSales(String name, double sales){
    this.city=city; this.sales=sales;
  }
  public String getCity(){ return city; }
  public double getTotalSales(){ return sales; }
  public abstract String getBeverageType();
  public void createFile(){
    try{
      FileWriter f = new FileWriter(city+".txt");
      f.write(city+"\n"+getBeverageType()+"\n"+sales);
      f.close();
      System.out.println("File created: "+city+".txt");
    }catch(Exception e){}
  }
}