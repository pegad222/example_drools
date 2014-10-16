package springaop;



public class SimpleServiceImpl  implements SimpleService {
	
	
	private static final long serialVersionUID = 1L;
	

	public SimpleServiceImpl() {
		super();
	}
	
	@Commision(active = 1, type = 1)
	public double payCommisionRule1 (){
		
		double importe = 120.0;
		
		System.out.println("Cobro de comision regla 1");
		
		return importe;
		
	}
	
	@Commision(active = 1, type = 2)
	public double payCommisionRule2 (){
		
		double importe = 40.0;
		
		System.out.println("Cobro de comision regla 2");
		
		return importe;
		
	}

}
