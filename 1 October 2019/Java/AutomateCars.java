class Car{
	private String chasisNo, model;

	boolean flag;

	public void setFlag(boolean flag){
		this.flag = flag;
	}
	
	public boolean isFlag(){
		return this.flag;
	}

	public void setChasisNo(String chasisNo){
		this.chasisNo = chasisNo;
	}

	public void setModel(String model){
		this.model = model;
	}

	public String getChasisNo(){
		return this.chasisNo;
	}

	public String getModel(){
		return this.model;
	}

	Car(String chasisNo, String model){
		this.chasisNo = chasisNo;
		this.model = model;
	}

	Car(){

	}
}


class AutomateCars{
	public static void main(String[] args) {
		Car car1 = new Car("76765645","2018");

		Car car2 = new Car("265252", "2019");

		Car c3 = new Car();

		c3.setChasisNo("726762827");
		c3.setModel("2020");

		System.out.println("Ch. No of Car 3 : " + c3.getChasisNo());
	}
}