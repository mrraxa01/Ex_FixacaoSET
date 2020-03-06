package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Course;

public class Program {

	public static void main(String[] args) {

		Course a = new Course("A", "Alex");
		Course b = new Course("B", "Alex");
		Course c = new Course("C", "Alex");

		Scanner sc = new Scanner(System.in);

		System.out.println("How many students for curse A?");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			a.enroll(sc.nextInt());
		}
		System.out.println("Course a students: " + a.enrolled.size());
		
		System.out.println("How many students for curse B?");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			b.enroll(sc.nextInt());

		}
		System.out.println("Course b students: " + b.enrolled.size());
		
		System.out.println("How many students for curse C?");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			c.enroll(sc.nextInt());
		}
		System.out.println("Course c students: " + c.enrolled.size());
		sc.close();
		
		Set <Integer> total = new HashSet<>(a.enrolled);
		
		total.addAll(b.enrolled);
		total.addAll(c.enrolled);
		
		System.out.println("Total Students: " + total.size());

	}

}
