package com.creatio.crm.language.basics;

public class Arrays_Ass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Categories and sub-categories
		String[] categories = {"Groceries", "Electronics"};
		String[] subCategories = {"Beverages", "Snacks", "Dairy Products", "Produce"};
		
		//3D array to store products
		String[][][] products = new String[2][4][5];
		
		//Category1 : Groceries
		//SubCategory1 : Beverages
		products[0][0][0] = "Cola";
		products[0][0][1] = "Orange Juice";
		products[0][0][2] = "Lemonade";
		products[0][0][3] = "Green Tea";
		products[0][0][4] = "Black Coffee";
		
		//SubCategory2 : Snacks
		products[0][1][0] = "Popcorn";
		products[0][1][1] = "Trail Mix";
		products[0][1][2] = "Beef Jerky";
		products[0][1][3] = "Salted Nuts";
		products[0][1][4] = "Rice Cakes";
		
		//SubCategory3 : Dairy Products
		products[0][2][0] = "Cottage Cheese";
		products[0][2][1] = "Heavy Cream";
		products[0][2][2] = "Ice Cream";
		products[0][2][3] = "Parmesan Cheese";
		products[0][2][4] = "Eggnog";
		
		//SubCategory4 : Produce
		products[0][3][0] = "Apples";
		products[0][3][1] = "Banans";
		products[0][3][2] = "Carrots";
		products[0][3][3] = "Potatoes";
		products[0][3][4] = "Onions";
		
		//Category2 : Electronics
		//SubCategory1 : Beverages
		products[1][0][0] = "Cola";
		products[1][0][1] = "Orange Juice";
		products[1][0][2] = "Lemonade";
		products[1][0][3] = "Green Tea";
		products[1][0][4] = "Black Coffee";
		
		//SubCategory2 : Snacks
		products[1][1][0] = "Popcorn";
		products[1][1][1] = "Trail Mix";
		products[1][1][2] = "Beef Jerky";
		products[1][1][3] = "Salted Nuts";
		products[1][1][4] = "Rice Cakes";
		
		//SubCategory3 : Dairy Products
		products[1][2][0] = "Cottage Cheese";
		products[1][2][1] = "Heavy Cream";
		products[1][2][2] = "Ice Cream";
		products[1][2][3] = "Parmesan Cheese";
		products[1][2][4] = "Eggnog";
		
		//SubCategory4 : Produce v
		products[1][3][0] = "Apples";
		products[1][3][1] = "Banans";
		products[1][3][2] = "Carrots";
		products[1][3][3] = "Potatoes";
		products[1][3][4] = "Onions";
		
		//print data in single array
		System.out.println("categories, subCategories: " + products[0][0][0]);
		
		
		
			}
}
