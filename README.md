# CostLessBites PoS Simulation

## 📋 Project Overview

**CostLessBites Catering** is a new service launching at Concordia University to provide healthy and budget-friendly meals for students, employees, and their families. This project simulates the **Point of Sale (PoS)** system that processes both on-demand and prepaid card-based orders.

The system includes:
- `Sales`: Tracks meal categories and totals.
- `PrePaiCard`: Stores prepaid meal card data.
- `PoS`: Handles combined sales and card logic.
- `PoSDemo`: A menu-driven program to test system functionalities.

---

## 🍽️ Meal Categories & Pricing

| Meal Size   | Price |
|-------------|-------|
| Junior      | $5    |
| Teen        | $10   |
| Medium      | $12   |
| Big         | $15   |
| Family      | $20   |

Each meal can be ordered under one of the following diet types:
- Carnivore
- Halal
- Kosher
- Pescatarian
- Vegetarian
- Vegan

---

## 💳 PrePaiCard Class

Represents yearly prepaid cards with attributes:
- `Diet Type`
- `Holder ID` (student or employee)
- `Expiry Day` and `Month` (validated and formatted as `dd/mm`)

Includes:
- Constructors (default, parameterized, copy)
- Validated setters
- `toString()` with leading zeros for formatting
- `equals()` for comparison

---

## 📦 Sales Class

Tracks the number of meals sold in each category and calculates total revenue.

Includes:
- Constructors (default, parameterized, copy)
- `addSales()` to update meal counts
- `SalesTotal()` for total $ calculation
- `equals()` to compare meal counts
- `toString()` for summary output

---

## 🧾 PoS Class

Represents a full point-of-sale system that aggregates sales and prepaid cards.

Attributes:
- One `Sales` object
- Array of `PrePaiCard` objects (can be empty or null)

Methods include:
- Equality checks (`equals()` based on total $ and number of cards)
- Adding/removing/updating prepaid cards
- Adding to sales
- Counting cards
- Summary `toString()` methods

---

## 💻 PoSDemo Driver

The main interface for interacting with PoS objects. Functionality includes:

1. Display all PoS contents
2. Display one PoS
3. List PoSs with same total sales $
4. List PoSs with same meal distribution
5. List PoSs with equal total sales and card count
6. Add a new prepaid card
7. Remove a prepaid card
8. Update a prepaid card’s expiry date
9. Add meals to a PoS
0. Quit

Static methods are used to reduce redundancy and simplify structure.

---

