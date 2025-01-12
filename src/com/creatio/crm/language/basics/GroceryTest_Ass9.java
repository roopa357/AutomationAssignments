package com.creatio.crm.language.basics;


public class GroceryTest_Ass9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GroceryList_Ass9 groceryList = new GroceryList_Ass9();
        
        String[] Groceries = {"Apples", "Bananas", "Carrots", "Tomatoes", "Milk", "Bread", "Eggs", "Cheese", "Butter", "Potatoes"};

        // Add random groceries
        System.out.println("Adding groceries...");
        for (int i = 0; i < Groceries.length; i++) {
            groceryList.addItem(Groceries[i]);
        }

        // View the list
        System.out.println("Viewing the grocery list:");
        groceryList.viewList();

        // Remove random groceries
        System.out.println("Removing random groceries...");
        groceryList.removeItem("Bananas");        

        // View the updated list
        System.out.println("Viewing the updated grocery list:");
        groceryList.viewList();
    }
}



