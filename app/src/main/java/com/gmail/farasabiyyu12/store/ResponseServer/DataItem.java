package com.gmail.farasabiyyu12.store.ResponseServer;

//import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

//@Generated("com.robohorse.robopojogenerator")
public class DataItem{

	@SerializedName("Brand")
	private String brand;

	@SerializedName("Price")
	private String price;

	@SerializedName("id")
	private String id;

	@SerializedName("Name")
	private String name;

	public void setBrand(String brand){
		this.brand = brand;
	}

	public String getBrand(){
		return brand;
	}

	public void setPrice(String price){
		this.price = price;
	}

	public String getPrice(){
		return price;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	@Override
 	public String toString(){
		return 
			"DataItem{" + 
			"brand = '" + brand + '\'' + 
			",price = '" + price + '\'' + 
			",id = '" + id + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}