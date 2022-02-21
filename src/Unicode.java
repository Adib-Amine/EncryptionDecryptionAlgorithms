

public class Unicode extends Cipher {

    public Unicode(ParseArgs parseArgs) {
        super(parseArgs);
    }

    public void encrypt(String data, int key) {
        for (char temp : data.toCharArray()) {
            this.new_msg.append(Character.toChars(temp + key));
        }
        this.PrintInsideFileIfExists(this.new_msg);
    }
    public void decrypt(String data, int key) {
        for (char temp : data.toCharArray()) {
            this.new_msg.append(Character.toChars(temp - key));
        }
        this.PrintInsideFileIfExists(this.new_msg);
    }

}