import java.util.Base64;
public class Main {
    public static void main(String[] args){
        byte[] decodedBytes = Base64.getDecoder().decode("SmF2YSDQvdC1INGC0L7RgNC80L7Qt9C40YIhCg==");
        System.out.println(new String(decodedBytes) + "\n");
        }
    }