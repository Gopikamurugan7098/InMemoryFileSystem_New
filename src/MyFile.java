public class MyFile extends Node {

    public MyFile(String name) {
        super(name);
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "|- " + name);
    }
}