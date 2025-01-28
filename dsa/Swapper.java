public class Swapper {
    private int a;
    private int b;

    public Swapper(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void swap() {
        a = a + b;
        b = a - b;
        a = a - b;
    }

    public void displayValues() {
        System.out.println("a: " + a + ", b: " + b);
    }

    public static void main(String[] args) {
        Swapper obj = new Swapper(5, 10);
        System.out.println("Before Swap:");
        obj.displayValues();  // Outputs: a: 5, b: 10
        obj.swap();
        System.out.println("After Swap:");
        obj.displayValues();  // Outputs: a: 10, b: 5
    }
}
