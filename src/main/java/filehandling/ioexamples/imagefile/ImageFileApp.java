package filehandling.ioexamples.imagefile;

public class ImageFileApp {

    public static void main(String[] args) {

        String sourceImage = "profile.jpg";
        String destinationImage = "profile_backup.jpg";

        ImageFileReader reader = new ImageFileReader();

        byte[] imageData = reader.readImage(sourceImage);

        ImageFileWriter writer = new ImageFileWriter();

        writer.writeImage(destinationImage, imageData);

        System.out.println("Image copy completed.");
    }
}
