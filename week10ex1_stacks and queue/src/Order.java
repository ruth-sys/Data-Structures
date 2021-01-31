public class Order {
	private int OrderId;
	private String Description;
	private float Price;
	
	public Order(){
		OrderId = 0;
		Description = "";
		Price = 0.0f;
	}
	
	public Order( int orders, String desc, float price){
		OrderId = orders;
		Description = desc;
		Price = price;
	}
	
	public void setOrder(int orders){
		OrderId = orders;
	}
	
	public void setDescription(String desc){
		Description = desc;
	}
	
	public void setPrice( float price){
		Price = price;
	}
	
	public int getOrderId()
	{
		return OrderId;
	}
	
	public String Description(){
		return Description;
		
	}
	
	public float Price(){
		return Price;
	}

	@Override
	public String toString() {
		return "Order [OrderId=" + OrderId + ", Description=" + Description + ", Price=" + Price + "]";
	}
}

