import java.util.HashMap;

public class Node {

private int id;

private HashMap<Integer, String> data;

private Node successor;

public Node(int id) {

this.id = id;

this.data = new HashMap<>();

}

public int getId() {

return id;

}

public void setSuccessor(Node successor) {

this.successor = successor;

}

public Node getSuccessor() {

return successor;

}

public void store(int key, String value) {

data.put(key, value);

}

public String retrieve(int key) {

return data.get(key);

}

}
