package Azterketa;

import java.util.Scanner;

public class Azterketa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Sartu zenbaki bat: ");
		int zk1 = sc.nextInt();
		
		System.out.println("Sartu zenbaki bat: ");
		int zk2 = sc.nextInt();
		
		System.out.println("Sartu zenbaki bat: ");
		int zk3 = sc.nextInt();
		
		int bataz = (zk1 + zk2 + zk3)/3;
		
		System.out.println("Bataz bestekoa: " + bataz);
	}

}
