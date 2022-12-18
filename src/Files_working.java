import java.io.*;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public  class Files_working implements Serializable {

    private Files_working  file_object;

    public String read_files() throws IOException, ClassNotFoundException{

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("backup.txt"));
       // List array = (List) in.readObject();
        String temp =(String) in.readObject();
        return temp;
    }



    @Override
    public void write_files(List array) throws IOException {

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("backup.txt"));
//        for (Object person: array
//             ) {
            out.writeObject(array.toString());
//        out.writeObject(array);
          out.close();
    }

}



