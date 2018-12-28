package HelloWorldApp;

public class Shadow {

    public int x = 0;

    class FirstLevel {

        public int x = 1;

        void methodInFirstLevel(int x) {
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("ShadowTest.this.x = " + Shadow.this.x);
        }
    }

    public static void main(String... args) {
        Shadow st = new Shadow();
        Shadow.FirstLevel fl = st.new FirstLevel();
        fl.methodInFirstLevel(23);
    }
}
