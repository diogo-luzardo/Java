package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Employee:" + 1 + ": ");
			System.out.print("ID: ");
			int id = sc.nextInt();
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.println("Salary");
			double salary = sc.nextDouble();
			
			
		}
	}

}
