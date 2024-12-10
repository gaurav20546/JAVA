package New;

public class engeen {
	private String model;
	
	engeen(String model)
	{
		this.model=model;
	}
	

	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	@Override
	public String toString() {
		return "engeen [model=" + model + "]";
	}
	

}
