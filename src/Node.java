public abstract class Node {
    protected String name;

    public Node(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void display(String indent);
}