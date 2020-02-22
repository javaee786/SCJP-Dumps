class Convert {
 public static void main(String[] args) {
 Long xL = new Long(456L);
 long x1 = Long.valueOf("123");
 Long x2 = Long.valueOf("123");
 long x3 = xL.longValue();
 Long x4 = xL.longValue();
 Long x5 = Long.parseLong("456");
 long x6 = Long.parseLong("123");
 }//main()
}//class
