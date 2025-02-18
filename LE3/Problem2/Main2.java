public class Main2 {
    public static void main(String[] args) {

        class ConcreteTest extends AbsTest {
         
            public void display() {
                System.out.println("This is the display method from ConcreteTest class.");
            }
        }

        Testable t = new ConcreteTest();
        t.display();  
    }
}