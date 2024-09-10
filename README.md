# Java-Budget-Tool
This **Java-Budget-Tool** is a simple Java program designed to help users create and manage their monthly budget. Users can input their monthly allowance and add multiple budget items, each with a name, cost, and optional duration. The tool keeps track of the total monthly allowance and deducts each item's cost as they are added.

This project is part of my learning journey in Java, specifically focusing on object-oriented programming (OOP) concepts like class creation, method overriding, and working with user input.

## Features
- Input monthly allowance.
- Add multiple budget items with:
  - Item name
  - Monthly cost
  - Duration (optional)
- Automatically update and track remaining allowance.
- Display all budget items added by the user.

## How It Works
1. The user inputs their monthly allowance.
2. The tool prompts the user to add budget items.
3. For each item, the user enters:
   - Name of the item.
   - Cost associated with the item.
   - Duration (optional, in months).
4. The program keeps subtracting the item costs from the user's monthly allowance.
5. The user can continue adding items until they decide to stop.
6. At the end, the program displays all the budget items along with the remaining monthly allowance.


## Class Structure
- `BudgetItem`: Represents an individual budget item with fields for `name`, `cost`, and `duration`. It includes a `toString()` method that provides a custom string representation of the budget item.
- `BudgetTool`: The main class where the program logic resides. It manages user input, stores budget items, and tracks the monthly allowance.

## How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/Java-Budget-Tool.git
2. Open the project in your favorite Java IDE or compile and run it from the command line:
   ```bash
   javac BudgetTool.java
   java BudgetTool
