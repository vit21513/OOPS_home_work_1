import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface Serializable {
    String read_files() throws IOException, ClassNotFoundException;
//    void write_files(List array) throws IOException;
    void write_files(List array) throws IOException;

}
