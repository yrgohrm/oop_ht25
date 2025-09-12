public class DoWhile1 {
    public static void main(String[] args) {

        boolean success = false;
        int retries = 0;

        while (!success && retries < MAX_RETRIES) {
            success = retrieveResource();
            retries++;
        } 

    }
}
