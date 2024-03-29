package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public int totalValueInStock() {
		return quantity;
	}
	public int addProducts(int quantity) {
		return this.quantity += quantity;
	}
	public int removeProducts(int quantity) {
		return this.quantity -= quantity;
	}
	public double totalPrice() {
		return price * quantity;
	}
	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ " + String.format("%.2f", totalPrice());
	}
}
