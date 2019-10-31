package com.ibm.takehome.ui;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ibm.takehome.bean.Product;
import com.ibm.takehome.service.ProductService;
import com.ibm.takehome.service.ValidationService;

public class Client {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		Scanner scan = new Scanner(System.in);
		int menuOption = 1;

		String quantity;
		String productCode;
		ValidationService validationService = context.getBean("validationService", ValidationService.class);
		ProductService productService = context.getBean("productService", ProductService.class);

		while (menuOption == 1) {
			System.out.println("1) Generate Bill by entering Product code and quantity \n2) Exit");
			menuOption = scan.nextInt();
			scan.nextLine();
			if (menuOption == 1) {
				Boolean isToRunForEntryOfProductCode = true;
				while (isToRunForEntryOfProductCode) {
					System.out.println("Enter the product code: ");
					productCode = scan.nextLine();
					if (validationService.validateProductId(productCode)) {
						Boolean isToRunForEntryOfQuantity = true;
						while (isToRunForEntryOfQuantity) {
							System.out.println("Enter quantity: ");
							quantity = scan.nextLine();

							if (validationService.validateQuantity(quantity)) {
								Product product = productService.getProductDetails(productCode);
								if (product != null) {
									System.out.println("Product Name: " + product.getProductName()
											+ "\nProduct Category: " + product.getProductCategory()
											+ "\nProduct Description: " + product.getProductDescription()
											+ "\nProduct Price (Rs): " + product.getProductPrice() + "\nQuantity: "
											+ quantity + "\nLine Total (Rs): "
											+ (product.getProductPrice() * Integer.parseInt(quantity)));
								} else {
									System.out.println(
											"Sorry ! The Product Code<<" + productCode + ">> is not available.");
								}
								isToRunForEntryOfQuantity = false;
							} else {
								System.out.println("Quantity should be atleast 1!");
							}
						}
						isToRunForEntryOfProductCode = false;
					} else {
						System.out.println("ProductCode should be 4 digit!");
					}
				}
			}
		}
		scan.close();
		context.close();
	}
}
