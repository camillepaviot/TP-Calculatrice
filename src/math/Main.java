package math;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Calcul c = new Calcul();
		String a;
		String b;
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Ma super calculatrice");
			System.out.println("----------");
			
			System.out.println("1. Addition");
			System.out.println("2. Soustraction");
			System.out.println("3. Division");
			System.out.println("4. Multiplication");
			System.out.println("5. Racine carré");
			System.out.println("0. Appuyez sur entrer pour quitter");
			
			String str = sc.nextLine();	
			
			int rep = Integer.parseInt(str);
			System.out.println("\n\n");
			switch(rep)
			{
				case 0:
					System.out.println("Merci et à bientôt");
					return;
				case 1:
					System.out.println("ADDITION");
					System.out.println("Valeur 1 ?");
					a = sc.nextLine();
					System.out.println("Valeur 2 ?");
					b = sc.nextLine();
					try {
						System.out.println(c.addition(Double.parseDouble(a), Double.parseDouble(b)));
					} catch (Exception e) {
						System.out.println("Vous avez dû faire une erreur dans la saisie de vos valeurs"); 
					}
					System.out.println("Appuyez sur entrer pour retourner au menu");
					break;
					
				case 2:
					System.out.println("SOUSTRACTION");
					System.out.println("Valeur 1 ?");
					a = sc.nextLine();
					System.out.println("Valeur 2 ?");
					b = sc.nextLine();
					try {
						System.out.println(c.soustraction(Double.parseDouble(a), Double.parseDouble(b)));
					} catch (Exception e) {
						System.out.println("Vous avez dû faire une erreur dans la saisie de vos valeurs"); 
					}					
					System.out.println("Appuyez sur entrer pour retourner au menu");
					break;
					
				case 3:
					System.out.println("DIVISION");
					System.out.println("Valeur 1 ?");
					a = sc.nextLine();
					System.out.println("Valeur 2 ?");
					b = sc.nextLine();
					try {
						System.out.println(c.division(Double.parseDouble(a), Double.parseDouble(b)));
					} catch (ArithmeticException e) {
					    System.out.println("Impossible de diviser par 0");
					} catch (Exception e) {
						System.out.println("Vous avez dû faire une erreur dans la saisie de vos valeurs"); 
					}
					System.out.println("Appuyez sur entrer pour retourner au menu");
					break;
					
				case 4:
					System.out.println("MULTIPLIER");
					System.out.println("Valeur 1 ?");
					a = sc.nextLine();
					System.out.println("Valeur 2 ?");
					b = sc.nextLine();
					try {
						System.out.println(c.multiplication(Double.parseDouble(a), Double.parseDouble(b)));		
					} catch (Exception e) {
						System.out.println("Vous avez dû faire une erreur dans la saisie de vos valeurs"); 
					}			
					System.out.println("Appuyez sur entrer pour retourner au menu");
					break;
					
				case 5:
					System.out.println("RACINE");
					System.out.println("Valeur 1 ?");
					a = sc.nextLine();
					try {
						System.out.println(c.racine(Double.parseDouble(a)));		
					} catch (ArithmeticException e) {
					    System.out.println("Impossible d'effectuer ce calcul");
					} catch (Exception e) {
						System.out.println("Vous avez dû faire une erreur dans la saisie de vos valeurs"); 
					}
					System.out.println("Appuyez sur entrer pour retourner au menu");
					break;			
			}
			sc.nextLine();
		}		
	}

}

