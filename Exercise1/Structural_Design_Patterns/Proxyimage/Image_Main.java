// Image.java
interface Image {
    void display();
}

// RealImage.java
class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("Loading " + filename + " from disk");
    }

    public void display() {
        System.out.println("Displaying " + filename);
    }
}

// ProxyImage.java
class ProxyImage implements Image {
    private String filename;
    private RealImage realImage;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}

// Main.java
public class Image_Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("photo.jpg");
        image.display();  // Loading and displaying from disk
        image.display();  // Only displaying, no loading from disk
    }
}
