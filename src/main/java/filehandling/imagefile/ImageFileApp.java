package filehandling.imagefile;

public class ImageFileApp {
    public static void main(String[] args) {
        String sourceImage = "img-3.jpg";
        String destinationImage = "backup_img-3.jpg";

        ImageFileReader reader = new ImageFileReader();

        byte[] imageDate = reader.readImage(sourceImage);

        ImageFileWriter writer = new ImageFileWriter();

        writer.writeImage(destinationImage,imageDate);

        System.out.println("Image copy completed.");
    }
}
