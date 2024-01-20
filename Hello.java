public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello Automation World");
        secondclass seconobject = new secondclass();
        seconobject.displayMessage();
    }
}
 class secondclass {
    void displayMessage() {
        System.out.println("Hello Second class in Hello ");
    }
 }
