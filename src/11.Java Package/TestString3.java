public class TestString3 {
 public static void main(String[] args) {
 // insert code here
 StringBuffer s = new StringBuffer("123456789");
 s.delete(0,3).replace(1,3,"24").delete(4,6);

 StringBuilder ss = new StringBuilder("123456789");
 ss.delete(0,3).delete(1,3).delete(2,5).insert(1, "24");

 System.out.println(s);
 }
}
