	class Outer{
			int var;

			private boolean flag;

			public static void main(String[] args) {
				// Inner in = new Inner(); WOuldn't work, refer to Scenario #2
				//  in.met();
			}

			void func(){
				//For Scenario #1
				// Inner in = new Inner();
				// in.met();
			}

			class Inner{
				int var;
				void met(){
					int var = 0;
System.out.println("var: " + var);
System.out.println("Instance var : " + this.var);
System.out.println("Outer Instance var : " + Outer.this.var);

					// System.out.println("Inside Inner's met... " + flag);
				}
			}
		}

// For creating the inner class object from somewhere within the Outer Class except from within static contexts of the Outer class
// For creating the inner class object from somewhere outside the Outer Class


class InnerClassDemo{
	public static void main(String[] args) {
		// For Scenario #2
		// Outer out = new Outer();

		Outer.Inner in = new Outer().new Inner();

		in.met();
	}
}