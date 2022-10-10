package com.te.restaurantapp;

import java.util.Scanner;

public class MainMenu {
	static Scanner scanner = new Scanner(System.in);

	/** MENU **/

	static void getFood() {

		
		System.out.println("----WELCOME TO TECHNO BIRYANI---- \n");

		String[] menu = { "", "1-Chicken Biryani-Rs 199/-", "2-Mutton Biryani-Rs 299/-", "3-Paneer Biryani-Rs 149/-",
				"4-Mushroom Biryani-Rs 199/-", "5-Veg Biryani-Rs 129/-", "6-Coke-Rs 49/-" };
		int[] pr = { 0, 199, 299, 149, 199, 129, 49 };

		for (short s = 0; s < menu.length; s++) {
			System.out.println(menu[s]);
		}

		/** TOTAL BILL **/

		int bill = 0;
		while (true) {
			System.out.println("\n Mention how many Orders you need: ");
			int n = scanner.nextInt();
			int[] price = new int[n];
			String[] ord = new String[n];
			System.out.println("Enter the Item No. from Menu: ");
			for (int i = 0; i < n; i++) {
				int item = scanner.nextInt();
				bill = bill + pr[item];
				ord[i] = menu[item];
				price[i] = pr[item];

			}
			for (int i = 0; i < ord.length; i++) {
				System.out.println(ord[i] + "-->added to cart\n");
			}
			System.out.println("you want more press : Y or N");
			String yes = scanner.next();
			if (yes.equalsIgnoreCase("y")) {
				continue;
			} else
				break;

		}
		System.out.println("Total payable amount :" + bill + "/-\n\n THANKYOU FOR VISITING, COME AGAIN");

	}
}
