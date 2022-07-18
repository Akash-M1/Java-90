public class Product {
	long productId;
	String productName;
	float productPrice;
	
	public Product(long productId, String productName, float productPrice) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}	
	
	@Override
	public String toString() {
		//return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice				+ "]";
		String product = String.format("Product[%d | %-10s | %.2f]", productId, productName, productPrice);
		return product;
	}

	public static void main(String[] args) {
		Product prod = new Product(1, "Mobile", 73000f);
		System.out.println("prod is of type --> " + prod.getClass().getName());
		System.out.println(prod.hashCode());
		System.out.println(prod); //toString()
		
	}
}
