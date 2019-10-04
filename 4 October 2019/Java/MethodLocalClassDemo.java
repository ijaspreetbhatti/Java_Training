// Method Local Inner Classes



	class Outer{
			int v;
		void func(){
			boolean flag;
			flag = true;
			class Inner{
				float g;
				void met(){
					Outer.this.v = 89;
					this.g = 987.00f;
					System.out.println(flag); // Accessible here only if it's final or starting with Java 8 - effectively final
					System.out.println("Within met...");
				}
			}
			// Just here...
			Inner in = new Inner();
			in.met();
		}

	}

	class MethodLocalClassDemo{
		public static void main(String[] args) {
			new Outer().func();
		}
	}