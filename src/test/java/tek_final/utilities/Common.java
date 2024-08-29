package tek_final.utilities;

public class Common {
    public static void waitTime(int wait){
        try{
            Thread.sleep(wait);
        }catch (InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }
}
