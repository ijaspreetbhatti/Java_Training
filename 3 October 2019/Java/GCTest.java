class GCTest{
	public static void main(String[] args) {
		
		Runtime ref = Runtime.getRuntime();

System.out.println("Total Memory : " + ref.totalMemory());
System.out.println("Free Memory : " + ref.freeMemory());

for(long var = 0; var < 100000; var++){
	java.util.Date date = new java.util.Date();
}

System.out.println("Free Memory After creating 10000 Date objects : " + ref.freeMemory());

	ref.gc();

	System.out.println("Free Memory After GC : " + ref.freeMemory());


	}
}