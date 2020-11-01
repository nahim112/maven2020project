package com.ap.datamodel;

public class ProductData {

	private String productName;
	private String quantity;
	private String size;
	private String color;
	
	public String GetProductName() {
		return productName;
	}
	public void setProductName(String productName ) {
		this.productName = productName;
	}
	public String Getquantity() {
		return quantity;
	}
	public void setQuantity(String quantity ) {
		this.quantity = quantity;
	}
	public String Getsize() {
		return size;
	}
	public void setsize(String size ) {
		this.size = size;
	}
	public String GetColor() {
		return color;
	}
	public void setcolor(String color ) {
		this.color = color;
	}
	@Override
	public boolean equals(Object obj){
	if(this == obj)
	return true;
	if(obj == null)
	return false;
	if(getClass() != obj.getClass())
	return false;
	ProductData other = (ProductData) obj;
	if(color == null){
	if(other.color !=null)
	return false;
	}else if(!color.equals(other.color))
	return false;
	if (productName == null){
	if(other.productName != null)
	return false;
	}else if (!productName.equals(other.productName))
	return false;
	if (quantity == null){
	if(other.quantity != null)
	return false;
	    
	}else if (!quantity.equals(other.quantity))
	return false;
	if (size == null){
	if(other.size != null)
	return false;  
	}else if (!size.equals(other.size))
	return false;
	return true; 
	}
	@Override
	public String toString(){
	return "ProductData [productName=" + productName + ", quantity=" + quantity + ", size=" + size + ", color=" + color + "]";
	}
	}
