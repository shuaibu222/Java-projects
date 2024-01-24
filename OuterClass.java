public class OuterClass {
    int x = 10;

    /**
     * InnerClass: are achieved through below
     */
    class InnerClass {
        int y = 2;
        public int getX() {
            return x;
        }
    }

    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myOuter.x + myInner.y);
        System.out.println(myInner.getX());
    }
}
