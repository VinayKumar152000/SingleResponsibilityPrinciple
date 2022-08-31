
public class Client {

	// single class is having as small as small repsponsibility as needed
	// single class is having only one responsiblity
	// if structre become complex just break it
	public static void main(String args[]) {

		Hotel grandView = new Hotel();
		grandView.takeOrder();

		Chef chef = new Chef();
		chef.preparePizza();

		PaymentWithCard payment = new PaymentWithCard();
		payment.takePayment();
	}
}
