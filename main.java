public class Main {

public static void main(String[] args) {

DHT dht = new DHT();

Node node1 = new Node(10);

Node node2 = new Node(20);

Node node3 = new Node(30);

dht.addNode(node1);

dht.addNode(node2);

dht.addNode(node3);

dht.store(25, "File 1");

dht.store(15, "File 2");

System.out.println("Retrieving key 25: " + dht.retrieve(25));

System.out.println("Retrieving key 15: " + dht.retrieve(15));

}

}
