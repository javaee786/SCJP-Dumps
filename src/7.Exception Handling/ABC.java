class ABC {
 public void process() { System.out.print("A"); } 
 class B extends A {
 public void process() throws RuntimeException {
 super.process();
 if (true) throw new RuntimeException();
 System.out.print("B"); 
 }
 }
 public static void main(String[] args) {
 try { ((A)new B()).process(); }
 catch (Exception e) { 
	 System.out.print("Exception"); 
	 }
 }
}

