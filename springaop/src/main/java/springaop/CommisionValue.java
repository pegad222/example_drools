package springaop;

public class CommisionValue {
	
	private int type;
	
	private double valueProduct;
	
	private double valueCommision = 0.0;
	
	
	public CommisionValue(int type, double valueProduct) {
		super();
		this.type = type;
		this.valueProduct = valueProduct;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public double getValueProduct() {
		return valueProduct;
	}

	public void setValueProduct(double valueProduct) {
		this.valueProduct = valueProduct;
	}

	public double getValueCommision() {
		return valueCommision;
	}

	public void setValueCommision(double valueCommision) {
		this.valueCommision = valueCommision;
	}

}
