public class GC {
	public static void main(String[] args){
		 private Object o;
 private void doSomethingElse(Object obj) { o = obj; }
 public void doSomething() {
 Object o = new Object();
 doSomethingElse(o);
 o = new Object();
 doSomethingElse(null);
 o = null;
 }
}//main()
	
}//GC class

