import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
public class Main {
    public static void main(String[] args) {
        try {
            int passwordLength = 12;
            String password = PasswordGenerator.generatePassword(passwordLength);
            System.out.println("Generated Password: " + password);

            SecretKey secretKey = PasswordEncryptor.generateSecretKey();
            String encryptedPassword = PasswordEncryptor.encryptPassword(password, secretKey);
            System.out.println("Encrypted Password: " + encryptedPassword);

            // Optionally, decrypt the password to verify
            String decryptedPassword = PasswordEncryptor.decryptPassword(encryptedPassword, secretKey);
            System.out.println("Decrypted Password: " + decryptedPassword);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
