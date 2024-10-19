import java.util.TreeMap;

public class DHT {

private TreeMap<Integer, Node> nodes;

public DHT() {

nodes = new TreeMap<>();

}

public void addNode(Node node) {

nodes.put(node.getId(), node);

updateSuccessors();

}

public void removeNode(Node node) {

nodes.remove(node.getId());

updateSuccessors();

}

public void store(int key, String value) {

Node responsibleNode = findNodeForKey(key);

responsibleNode.store(key, value);

}

public String retrieve(int key) {

Node responsibleNode = findNodeForKey(key);

return responsibleNode.retrieve(key);

}

private Node findNodeForKey(int key) {

return nodes.ceilingEntry(key) != null ? nodes.ceilingEntry(key).getValue() : nodes.firstEntry().getValue();

}

private void updateSuccessors() {

Node previous = null;

for (Node node : nodes.values()) {

if (previous != null) {

previous.setSuccessor(node);

}

previous = node;

}

}

}
