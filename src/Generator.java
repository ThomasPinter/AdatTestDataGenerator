import java.util.Date;
import java.util.Random;


public class Generator {
	
	private int customerID;
	private char typeOfDelivery;
	private String branchOffice;
	private Date sDate;
	private int sTime;
	private int productID;
	private char productType;
	private int orderedAmount;
	private int orderPrize;
	private int discount;
	
	
	
	
	public int getCustomerID() {
		return customerID;
	}




	public char getTypeOfDelivery() {
		return typeOfDelivery;
	}




	public String getBranchOffice() {
		return branchOffice;
	}




	public Date getsDate() {
		return sDate;
	}




	public int getsTime() {
		return sTime;
	}




	public int getProductID() {
		return productID;
	}




	public char getProductType() {
		return productType;
	}




	public int getOrderedAmount() {
		return orderedAmount;
	}




	public int getOrderPrize() {
		return orderPrize;
	}




	public int getDiscount() {
		return discount;
	}




	public Generator() {
		setCustomerID();
		setTypeOfDelivery();
		setBranchOffice();
		setSDate();
		setSTime();
		setProductID();
		setProductType();
		setOrderedAmount();
		setOrderPrize();
		setDiscount();
	}

	
	



	@Override
	public String toString() {
		return customerID + ";"+ typeOfDelivery + ";" + branchOffice + ";" + sDate + ";" + sTime + ";"
				+ productID + ";" + productType	+ ";" + orderedAmount + ";"	+ orderPrize + ";" + discount;
	}




	private void setDiscount() {
		discount = ((int)(Math.random()*3))*5;
		
	}




	private void setOrderPrize() {
		Random r = new Random();
		orderPrize = r.nextInt(200);
		
	}




	private void setOrderedAmount() {
		Random r = new Random();
		orderedAmount = r.nextInt(15);
		
	}




	private void setProductType() {
		char[] c={'c','m','g'};
		Random r = new Random();
		productType= c[r.nextInt(3)];
		
	}




	private void setProductID() {
		productID= (int) (Math.random()*850000 +1);
		
	}




	private void setSTime() {
		sTime= (int) (Math.random()*850000 +1);
		
	}




	private void setSDate() {
		sDate= new Date();
		
	}




	private void setBranchOffice() {
		String[] s = {"Vienna","Berlin","Barcelona","London"};
		Random r = new Random();
		branchOffice=s[r.nextInt(4)];
	}




	private void setTypeOfDelivery() {
		char[] c={'d','s','g'};
		Random r = new Random();
		typeOfDelivery= c[r.nextInt(3)];
	}




	public void setCustomerID(){
		customerID= (int) (Math.random()*850000 +1);
	}

}
