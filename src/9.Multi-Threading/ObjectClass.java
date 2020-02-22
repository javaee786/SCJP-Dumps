class ObjectClass{
public static void main(String[] args){

void waitForSignal() {
 ObjectClass obj = new ObjectClass();
 synchronized (Thread.currentThread()) {
 obj.wait();
 obj.notify();
 }
}//waitForSignal()

}//main()

}//class