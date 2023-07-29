package javarush.tasks.JavaCore.tasks06.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes imageTypes){
        if(imageTypes == null){
            throw new IllegalArgumentException("imageTypes cannot be null");
        }
        try {
            if(imageTypes == ImageTypes.JPG){
                return new JpgReader();
            } else if(imageTypes == ImageTypes.PNG){
                return new PngReader();
            } else if(imageTypes == ImageTypes.BMP){
                return new BmpReader();
            } else {
                throw new IllegalArgumentException("Invalid image type");
            }
        } catch (IllegalArgumentException ex){
            System.out.println("Caught IllegalArgumentException: " + ex.getMessage());
            return null; 
        }
        
    }
}