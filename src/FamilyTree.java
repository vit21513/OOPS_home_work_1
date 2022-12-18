import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FamilyTree implements Serializable {

    private List<Human> famTree;
    public FamilyTree(List<Human> Tree) {
        this.famTree = Tree;
    }
    public FamilyTree() {
        this(new ArrayList<>());
    }

    public void addHuman(Human hum) {
        famTree.add(hum);
    }

    @Override
    public String toString() {
        String res = "";
        for (Human hum : famTree) {
            res += hum + "\n";}
            return res;
    }
    public void printAllTree() {
        System.out.println("Список всех членов дерева");
        String res = "";
        for (Human hum : famTree) {
            res += hum + "\n";}
        System.out.println(res);
    }
    public Human findByName(String name){
        for (Human hum: famTree) {
            if ((hum.getName().equals(name))){
                return hum;}
        }
        return null;
        }
    public  String findChild (Human hum) {
        return hum.getChildren();};
    public  String findParents (Human hum) {
        return hum.printParents();}

    public List<Human> getFamTree() {
        return famTree;
    }

    @Override
    public String read_files() throws IOException, ClassNotFoundException{

        Serializable work = new Files_working();
        String temp = work.read_files();
//         List <Human> temp = new ArrayList<>(work.read_files());

         return temp;
    }

    @Override
    public void write_files(List famTree) throws IOException {

        Serializable work = new Files_working();
        work.write_files(this.famTree);

    }



    }