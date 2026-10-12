package monthlysale;

import java.util.Scanner;

public class Monthlysale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ROWS = 3 cities
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
        int rows = 3;
        int cols = 3;

        // 2D array [rows][cols]
        int[][] sales = new int[rows][cols];

        // INPUT using rows and cols
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (c == 0) {
                    System.out.print("Enter the number of coffee sales for " + cities[r] + ": ");
                } else {
                    System.out.print("Enterthe number of tea " + cities[r] + ": ");
                
            System.out.print("Enterthe number of boba tea " + cities[r] + ": ");
                }
                sales[r][c] = sc.nextInt();
            }
        }

        // REPORT using rows and cols
        System.out.println("------------------------------------------------");
        System.out.println("sales REPORT");
        System.out.println("------------------------------------------------");
        System.out.println("City\t\tcoffee\ttea\tbobatea");

        for (int r = 0; r < rows; r++) {
            System.out.print(cities[r] + "\t");
            for (int c = 0; c < cols; c++) {
                System.out.print(sales[r][c] + "\t");
            }
            System.out.println();
        }

        // TOTALS using rows and cols
        System.out.println("------------------------------------------------");
        System.out.println("TOTALS");
        System.out.println("------------------------------------------------");

        int biggest = 0;
        String topCity = "";

        for (int r = 0; r < rows; r++) {
            int total = 0;
            for (int c = 0; c < cols; c++) {
                total = total + sales[r][c]; // add row
            }
            System.out.println(cities[r] + " " + total);

            if (total > biggest) {
                biggest = total;
                topCity = cities[r];
            }
        }

        System.out.println("\nMOST sales: " + topCity);
    }
}