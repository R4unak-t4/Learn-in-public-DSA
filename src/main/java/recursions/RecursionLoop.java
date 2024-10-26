package recursions;
//If you want hand Written Notes reach out to me on Linkedin or wait for the link to be uploaded
public class RecursionLoop {
    public static void main(String[] args) {
        OnetoFive(1);
    }

    //Function to print 1 - 5
    static void OnetoFive(int n) {
        if (n <= 5) {
            System.out.println(n);
            OnetoFive(n+1);
        }

    }
}