import java.util.ArrayList;
import java.util.List;

public class FamilyTree {

    private List<Humans> famTree;

    public FamilyTree(List<Humans> Tree) {
        this.famTree = Tree;
    }

    public FamilyTree() {
        this(new ArrayList<>());
    }


    public void addHuman(Humans hum) {

        famTree.add(hum);

    }



    @Override
    public String toString() {
        String res = "";

        for (Humans hum : famTree) {
            res += hum + "\n";}
            return res;
    }

    public void printAllTree() {
        System.out.println("Список всех членов дерева");
        String res = "";
        for (Humans hum : famTree) {
            res += hum + "\n";}
        System.out.println(res);
    }
    public  Humans findByName(String name){

        for (Humans hum: famTree) {
            if ((hum.getName().equals(name))){
                return hum;}
        }
        return null;

        }

    public  String findChild (Humans hum) {
        return hum.getChildren();};

    public  String findParents (Humans hum) {
        return hum.printParents();}





}













