

public class Shift extends Cipher {
    public Shift(ParseArgs parseArgs) {
        super(parseArgs);
    }

    public void encrypt(String data, int key) {
        for ( char temp : data.toCharArray()) {
            if (temp >= 'a' && temp <= 'z') {
                this.new_msg.append(Character.toChars((temp + key - 97) % 26 + 97));
            }
            else if (temp >= 'A' && temp <= 'Z') {
                this.new_msg.append(Character.toChars((temp + key - 65) % 26 + 65));
            }
            else {
                this.new_msg.append(temp);
            }
        }
        this.PrintInsideFileIfExists(this.new_msg);
    }

    public void decrypt(String data, int key) {
        for ( char temp : data.toCharArray()) {
            if (temp >= 'a' && temp <= 'z') {
                this.new_msg.append(Character.toChars(((temp - key - 97) % 26 + 26) % 26 + 97));
            }
            else if (temp >= 'A' && temp <= 'Z') {
                this.new_msg.append(Character.toChars(((temp - key - 65) % 26 + 26) % 26 + 65));
            }
            else {
                this.new_msg.append(temp);
            }
        }
        this.PrintInsideFileIfExists(this.new_msg);
    }
}
