class Test {
public static void main(String[] args){
public static void test(String str) {
 int check = 4;
 if (check = str.length()) {
 System.out.print(str.charAt(check -= 1) +", ");
 } else {
 System.out.print(str.charAt(0) + ", ");
 }//else
}//test()

//and the invocation:
 test("four");
 test("tee");
 test("to");

 }//main()
}