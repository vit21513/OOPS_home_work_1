
import java.io.IOException;

public interface Serializable {
    String read_files() throws IOException, ClassNotFoundException;

    void write_files(String string) throws IOException;

}
