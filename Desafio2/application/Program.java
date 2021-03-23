package Exercicio2.Desafio2.application;

import Exercicio2.Desafio2.entities.Employer;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employer emp  = new Employer();

        System.out.print("Name: ");
        emp.name = sc.nextLine();
        System.out.print("Gross salary: ");
        emp.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        emp.tax = sc.nextDouble();
        System.out.println();
        System.out.println("Employee: " + emp);
        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);
        System.out.println();
        System.out.println("Updated data: " + emp);
        
        sc.close();
    }
}
