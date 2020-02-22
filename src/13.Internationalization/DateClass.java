class DateClass {
 public static void main(String[] args){
  Date d = new Date(0);
  String ds = "December 15, 2004";
 DateFormat df = DateFormat.getDateInstance();// insert code here
 try {
 d = df.parse(ds);
 }
 catch(ParseException e) {
 System.out.println("Unable to parse " + ds);
 }
 d.setTime( (1000 * 60 * 60 * 24) + d.getTime());// insert code here too

 }//main()
}//class