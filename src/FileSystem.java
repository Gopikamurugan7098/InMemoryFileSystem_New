public class FileSystem {

    private Directory root;

    public FileSystem() {
        root = new Directory("Root");
    }

    public void createFolder(String name) {
        root.addNode(new Directory(name));
    }

    public void createFile(String name) {
        root.addNode(new MyFile(name));
    }

    public void delete(String name) {
        root.deleteNode(name);
    }

    public void search(String name) {

        Node node = root.search(name);

        if (node != null)
            System.out.println(name + " Found");
        else
            System.out.println(name + " Not Found");
    }

    public void display() {
        root.display("");
    }
}
