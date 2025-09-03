import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) {
        // Normal HashMap
        HashMap<Object, String> hashMap = new HashMap<>();

        // WeakHashMap
        WeakHashMap<Object, String> weakHashMap = new WeakHashMap<>();

        Object key1 = new Object();
        Object key2 = new Object();

        hashMap.put(key1, "HashMap Value");
        weakHashMap.put(key2, "WeakHashMap Value");

        // Remove strong reference for key2
        key2 = null;

        // Suggest Garbage Collection
        System.gc();

        // Small delay to let GC run
        try { Thread.sleep(1000); } catch (InterruptedException e) {}

        System.out.println("HashMap: " + hashMap);
        System.out.println("WeakHashMap: " + weakHashMap);
    }
}
