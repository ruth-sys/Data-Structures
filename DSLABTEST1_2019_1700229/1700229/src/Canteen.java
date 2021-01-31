/*Name : Ruth Elliott
 *Id : 1700229
 */
public class Canteen {
	private int ProductId;
	private String ProductName;
	private float Price;
	
	public Canteen(){
		ProductId = 0;
		ProductName = "";
		Price = 0.0f;
	}
	
	public Canteen(int id, String name, float price){
		ProductId = id;
		ProductName = name;
		Price = price;
	}
	
	public void setProductId(int id){
		ProductId = id;
	}
	
	public void setProductName( String name){
		ProductName = name;
	}
	
	public void setPrice(float price){
		Price = price;
	}
	
	
	public int getProductId(){
		return ProductId;
	}
	
	public String getProductName( ){
		return ProductName;
	}
	
	public float getPrice(){
		return Price;
	}

	@Override
	public String toString() {
		return "Canteen [ProductId=" + ProductId + ", ProductName="
				+ ProductName + ", Price=" + Price + "]";
	}
	

}
