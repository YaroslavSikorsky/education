package javarush.tasks.JavaCore.tasks06.task1631;


import javarush.tasks.JavaCore.tasks06.task1631.common.*;
/* 
Factory method pattern
*/

public class Solution {
    public static void main(String[] args) {
        ImageReader reader = ImageReaderFactory.getImageReader(ImageTypes.JPG);
    }
}
