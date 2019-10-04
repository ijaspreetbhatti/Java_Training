class ObjectsPlay{
	ObjectsPlay play;
	int var;
	public static void main(String[] args) {
		ObjectsPlay ref = new ObjectsPlay();
		ObjectsPlay play = new ObjectsPlay();

		ref.var = 1010;

		ref.play = ref;

		System.out.println(play);


	}
}