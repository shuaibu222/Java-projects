public class GarbageCollector {
    public void finalize() {
        System.out.println("Object is garbage collected");
    }

    public static void main(String[] args) {
        GarbageCollector s1 = new GarbageCollector();
        GarbageCollector s2 = new GarbageCollector();
        s1 = null;
        s2 = null;
        System.gc();
    }
}
