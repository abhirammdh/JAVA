public class OuterClass {

    private class InnerPrivateClass {
        void displayMessage() {
            System.out.println("Hello from the private inner class!");
        }
    }

    public void useInnerClass() {
        InnerPrivateClass inner = new InnerPrivateClass();
        inner.displayMessage();
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.useInnerClass();
    }
}
