package AmazonWebsite;

import java.util.Date;
import java.util.List;

public class ECommerceWebsite {
Product search(String name,ProductCategory productCategory) {
	return null;
}
Account login(Customer user){
return null;	
}

//addProductstoCart(Product product,User user)
}
class Product{
	int ProductId;
	String productName;
	ProductCategory productCategory;
	int price;
	List<Seller> sellerList;
}

class ProductCategory{
	int productCategoryId;
	String productCatergoryName;
}

class Seller {
	int accountId;
	int SellerId;
	String name;
	
}
class Account{
	int accontId;
	Date dob;
	String email;
	List<CreditCard> creditCards;
}
class CreditCard{
	int number;
	Date dateOfExpiry;
}
class Customer{
	String userName;
	int accountId;
	Cart cart;
	List<order> orders;
	//addItemToCart(Item);
	
	//removeItemFromCart(Item);
	//placetheOrder(Order order)
}
class Item{
	String productId;
	int quantity;
	double price;
	boolean updateQuantity(int quantity) {
		return false;
	}
}
class Cart{
	List<Item> items;
	//addItem(Item item)
	//updateItemQuantity(Item item)
	//removeItem(Item item);
	//checkout()
	
}
class order{
	int orderId;
	int userId;
	Product product;
	Shipment shipment;
	OrderStatus status;
	List<OrderLog> orderLog;
}
class OrderLog{
	int orderId;
	Date creationDate;
	OrderStatus status;
}
enum OrderStatus{
	cancelled,Delevered,inProgress
}
class Shipment{
	int shipmentId;
	Date dateOfArrival;
	List<ShipmentLog> shipmentLog;
	ShipmentStatus status;
	
}
class ShipmentLog{
	int shipmentId;
	ShipmentStatus status;
	Date creationDate;
}
enum ShipmentStatus{
	onTheWay,DeliveryToday,shippingInprogress
}

