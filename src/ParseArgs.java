import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ParseArgs
{
    private String alg = "shift";
    private String mode = "enc";
    private String data = "";
    private int key = 0;
    private Path out = null;
    public ParseArgs(String[] args) {
        for (int i = 0; i < args.length; i += 2) {
            switch (args[i]) {
                case "-in": {
                    if (!Files.exists(Path.of(args[i + 1])))
                        break;
                    try {
                        int j;
                        FileReader in = new FileReader(args[i + 1]);
                        StringBuilder test = new StringBuilder();
                        while ((j = in.read()) != -1) {
                            test.append((char) j);
                        }
                        this.data = test.toString();
                        in.close();
                    } catch (IOException e) {
                        System.out.println("Error");
                        e.printStackTrace();
                        System.exit(1);
                    }
                    break;
                }
                case "-out": {
                    this.out = Paths.get(args[i + 1]);
                    break;
                }
                case "-data": {
                    this.data = args[i + 1];
                    break;
                }
                case "-key": {
                    this.key = Integer.parseInt(args[i + 1]);
                    break;
                }
                case "-mode": {
                    this.mode = args[i + 1];
                    break;
                }
                case "-alg": {
                    this.alg = args[i + 1];
                    break;
                }
                default: {
                    System.out.println("unknown operation");
                    System.out.println(args[i]);
                    System.exit(1);
                    break;
                }
            }
        }
    }

    public String getAlg() { return this.alg; }

    public String getMode() { return this.mode; }

    public String getData() { return this.data; }

    public int getKey() { return this.key; }

    public Path getPath() { return this.out; }

    public boolean PathOutExists() { return (this.out != null); }
}
