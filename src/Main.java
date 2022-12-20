import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FamilyTree familyTree = new FamilyTree();

        // разкомментировать для создания файла backup ниже
//         Human h1 = new Human("Ivan", "Male");
//         Human h2 = new Human("Ola", "FeMale");
//         Human h3 = new Human("Sana", "Male", h1, h2);
//         Human h4 = new Human("Kola", "Male", h1, h2);
//         Human h5 = new Human("Tana", "FeMale", h1, h2);
//         Human h6 = new Human("dasha", "FeMale", h3, h5);
//         familyTree.addHuman(h1);
//         familyTree.addHuman(h2);
//         familyTree.addHuman(h3);
//         familyTree.addHuman(h4);
//         familyTree.addHuman(h5);
//         familyTree.addHuman(h6);
//         familyTree.write_files(familyTree.resToSave()); // запись файла


        familyTree.parsing(familyTree.read_files()); // чтение файла

        familyTree.printAllTree();

        System.out.println("Поиск по имени человека ");
        System.out.println(familyTree.findByName("Ola").toString());
        System.out.println(familyTree.findChild(familyTree.findByName("Ola")));
        System.out.println(familyTree.findParents(familyTree.findByName("Ola")));
        System.out.println(" ");
        System.out.println("Поиск по имени человека ");
        System.out.println(familyTree.findByName("Tana").toString());
        System.out.println(familyTree.findChild(familyTree.findByName("Tana")));
        System.out.println(familyTree.findParents(familyTree.findByName("Tana")));

    }
}