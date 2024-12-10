package Day_17;

public class InventoryItem {
	private String itemname;
	private double priceperunit;
	private int quantityInStock;
	public InventoryItem(String itemname,double priceperunit,int quantityInStock)
	{
		this.itemname=itemname;
		this.priceperunit=priceperunit;
		this.quantityInStock=quantityInStock;
		
	}
	public String getitemname()
	{
		return itemname;
	}
	public void setitemname(String itemname)
	{
		this.itemname=itemname;
	}
	public double getpriceperunit()
	{
		return priceperunit;
		
	}
	public void setgetpriceperunit(double priceperunit)
	{
		this.priceperunit=priceperunit;
		
	}
	public int getquantityInStock()
	{
		return quantityInStock;
		
	}
	public void setquantityInStock(int quantityInStock)
	{
		if(quantityInStock>0)
		{
		this.quantityInStock=quantityInStock;
		}
		else 
		{
			System.exit(0);
		}
	}
	
	
	public double calculateTotalValue()
	{
		if(priceperunit>0 )
		{
		this.priceperunit=this.priceperunit*this.quantityInStock;
		return priceperunit;
		}
		else 
		{
			System.out.println("enter valid price ");
			System.exit(0);
			return 0;
		}
			
	}
	@Override
	public String toString() {
		return "InventoryItem [itemname=" + itemname + ", priceperunit=" + priceperunit + ", quantityInStock="
				+ quantityInStock + "]";
		
	}
	
	
	
	
}
