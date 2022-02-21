import java.io.FileWriter;
import java.io.IOException;


public class Cipher {
    public ParseArgs parseArgs;
    public StringBuilder new_msg = new StringBuilder();


    public Cipher(ParseArgs parseArgs) {
        this.parseArgs = parseArgs;
    }

    public void encrypt(String data, int key) {}

    public void decrypt(String data, int key) {}

    public void PrintInsideFileIfExists(StringBuilder new_msg) {
        if (this.parseArgs.PathOutExists()) {
            try {
                FileWriter myWriter = new FileWriter(this.parseArgs.getPath().toString());
                myWriter.write(new_msg.toString());
                myWriter.close();
            } catch (IOException e) {
                System.out.println("Error");
                e.printStackTrace();
            }
        } else {
            System.out.println(new_msg);
        }
    }

    public void run() {
        switch (this.parseArgs.getMode()) {
            case "enc": {
                this.encrypt(this.parseArgs.getData(), this.parseArgs.getKey());
                break;
            }
            case "dec": {
                this.decrypt(this.parseArgs.getData(), this.parseArgs.getKey());
                break;
            }
            default: {
                System.out.println("unknown operation");
                System.out.println(this.parseArgs.getData() + " " + this.parseArgs.getMode());
            }
        }
    }
}