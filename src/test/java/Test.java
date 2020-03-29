import zone.nora.simpleencryption.SimpleEncryption;

public class Test {
    public static void main(String[] args) {
        String content = "Extremely secret message!!!";
        String key = "ExampleKey1234";

        System.out.println(content);
        String encryptedMessage = SimpleEncryption.encrypt(content, key);
        System.out.println(encryptedMessage);
        System.out.println(SimpleEncryption.decrypt(encryptedMessage, key));
    }
}
