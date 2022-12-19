
import java.io.*;

public class Files_working implements Serializable {

    public String read_files() throws IOException, ClassNotFoundException {

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("backup"));
        String temp = (String) in.readObject();
        return temp;
    }

    @Override
    public void write_files(String result) throws IOException {

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("backup"));
        out.writeObject(result);
        out.close();
    }
}
