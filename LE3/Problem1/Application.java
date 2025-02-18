public class Application {
    public static void main(String[] args) {
        
        Bharatvanshi[] bharatvanshis = {
            new Arjun(),
            new Bheem(),
            new Duryodhan(),
            new Vikarn()
        };

        
        for (Bharatvanshi bv : bharatvanshis) {
            bv.fight();
            bv.obey();
            System.out.println("Kindness: " + bv.kind());
            System.out.println();
        }
    }
}