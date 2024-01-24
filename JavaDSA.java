import java.util.*;

public class JavaDSA {
    public static void main(String[] args) {
        // RESIZABLE ARRAY
        // Arraylist implementation
        // ArrayList<String> cars = new ArrayList<String>();
        // cars.add("Volvo");
        // cars.add("BMW");
        // cars.add("Honda");
        // System.out.println(cars);
        // Collections.sort(cars);
        // System.out.println(cars);

        // LIST WITH ADDRESS
        // LinkedList implementation
        // LinkedList<String> cars = new LinkedList<String>();
        // cars.add("Volvo");
        // cars.add("BMW");
        // cars.add("Honda");
        // cars.addLast("Toyota");
        // cars.addFirst("Mercedes");

        // // Deleting using iterator is essential in List DSA
        // Iterator<String> i = cars.iterator();

        // while (i.hasNext()) {
        //     String car = i.next();
        //     if (car.equals("BMW")){
        //         i.remove();
        //     }
        // }
        // System.out.println(cars);
        

        // KEY/VALUE
        // HashMap implementation
        // HashMap<String, String> cities = new HashMap<String, String>();
        // cities.put("Nigeria", "Kano");
        // cities.put("UK", "London");
        // System.out.println(cities);

        // for (String city : cities.keySet()){
        //     System.out.println("key: " + city + " | value: " + cities.get(city));
        // }

        // UNIQUE
        // HashSet<String> cars = new HashSet<String>();
        // cars.add("Volvo");
        // cars.add("BMW");
        // cars.add("BMW");
        // cars.add("Honda");
        // cars.add("Toyota");
        // cars.add("Mercedes");

        //  // using iterator to iterate over an iterable
        // Iterator<String> it = cars.iterator();
        // while (it.hasNext()) {
        //     String c = it.next();
        //     if (c == "BMW"){
        //         it.remove();
        //     }
        // }
        // System.out.println(cars);

        // KEY/VALUE pairs
        // Map<String ,Integer> cars = new HashMap<>();
        // cars.put("Volvo", 2);
        // cars.put("BMW", 5);
        // cars.put("BMW", 1);
        // cars.put("Honda", 4);
        // cars.put("Toyota", 34);
        // cars.put("Mercedes", 8);

        // LIFO principle
        // Stack<Integer> num = new Stack<>();
        // num.push(1);
        // num.push(2);
        // num.push(3);
        // num.push(4);
        // num.push(5);
        // num.push(6);

        // System.out.println(num);
        // num.pop();
        // System.out.println(num);
        // // return last in element
        // int p = num.peek();
        // System.out.println(p);

        // int s = num.search(1);
        // System.out.println(s);

        // LIFO principle better than STACK!. Deque is an interface that extends queue interface(and it's double-ended)
        // Deque<Integer> num = new ArrayDeque<>(); // ArrayDeque is a class that implements Queue
        // num.push(1);
        // num.push(2);
        // num.push(3);
        // num.push(4);
        // num.push(5);
        // num.push(6);

        // System.out.println(num);
        // num.pop();
        // System.out.println(num);
        // // return last in element
        // int p = num.peek();
        // System.out.println(p);

        Queue<Integer> num = new ArrayDeque<>(); // ArrayDeque is a class that implements Queue
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);

        System.out.println(num);
        num.remove();
        System.out.println(num);
        // return head of the element
        int po = num.poll();
        System.out.println(po);

    }
}