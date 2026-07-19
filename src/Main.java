public class Main {

    public static void main(String[] args) {

        FileSystem fs = new FileSystem();

        fs.createFolder("Documents");
        fs.createFolder("Images");

        fs.createFile("Resume.pdf");
        fs.createFile("Photo.jpg");

        System.out.println("Initial File System");
        fs.display();

        System.out.println();

        fs.search("Resume.pdf");
        fs.search("Songs");

        System.out.println();

        fs.delete("Photo.jpg");

        System.out.println("After Deleting Photo.jpg");
        fs.display();
    }
}