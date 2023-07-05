package javarush.tasks.JavaCore.tasks04.task1421;


public class Singleton {
    private static Singleton instance;
    private Singleton(){
        
    }
    
    public static Singleton getInstance(){
        if (instance == null) {
            instance = new Singleton();
        } 
            return Singleton.instance;
        
            
     }
    
    
}
    