class MixingGenerics{
	public static void main(String[] args) {
		java.util.List<Integer> list = new java.util.ArrayList<>();

		list.add(266);
		list.add(312);
		list.add(-8765);

		//list.add(7788.00);

		//Integer value = list.get(2);


		new PreJava5().cal(list);


	}
}

class PreJava5{
	void cal(java.util.List myList){
		//String value = (String)myList.get(0);// Fingers crossed
		myList.add(789.76);

	}
}