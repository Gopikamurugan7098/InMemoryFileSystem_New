import java.util.ArrayList;

public class Directory extends Node {

    private ArrayList<Node> children;

    public Directory(String name) {
        super(name);
        children = new ArrayList<>();
    }

    public void addNode(Node node) {
        children.add(node);
    }

    public void deleteNode(String name) {
        children.removeIf(node -> node.getName().equals(name));
    }

    public Node search(String name) {

        if (this.name.equals(name))
            return this;

        for (Node node : children) {

            if (node.getName().equals(name))
                return node;

            if (node instanceof Directory) {

                Node result = ((Directory) node).search(name);

                if (result != null)
                    return result;
            }
        }

        return null;
    }

    @Override
    public void display(String indent) {

        System.out.println(indent + name);

        for (Node node : children) {
            node.display(indent + "   ");
        }
    }
}