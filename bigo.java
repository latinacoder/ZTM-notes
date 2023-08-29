import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] nemo = {"nemo"};
        String[] everyone = {"dory", "bruce", "marlin", "nemo", "gill", "bloat", "nigel", "squirt", "darla", "hank"};
        String[] large = new String[100000];
        Arrays.fill(large, "nemo");
        
        findNemo(large);
    }
    
    public static void findNemo(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("nemo")) {
                System.out.println("Found Nemo!");
            }
        }
    }
}
