class Student implements java.io.Serializable{
	private String name, gender;

	Student(String name, String gender){
		this.name = name;
		this.gender = gender;
	}

	@Override
	public String toString(){
		return "name: " + this.name + ", gender : " + this.gender;
	}
}