public class Main {
    public static void main(String[] args) {

        FamilyTree familyTree = new FamilyTree();
        Humans h1 = new Humans("Ivan", "Male");
        Humans h2 = new Humans("Ola", "FeMale");
        Humans h3 = new Humans("Sana", "Male", h1, h2);
        Humans h4 = new Humans("Kola", "Male", h1, h2);
        Humans h5 = new Humans("Tana", "FeMale", h1, h2);
        Humans h6 = new Humans("dasha", "FeMale", h3, h5);

        familyTree.addHuman(h1);
        familyTree.addHuman(h2);
        familyTree.addHuman(h3);
        familyTree.addHuman(h4);
        familyTree.addHuman(h5);
        familyTree.addHuman(h6);

        familyTree.printAllTree();
        System.out.println("Поиск по имени человека ");
        System.out.println(familyTree.findByName("Ola").toString());
        System.out.println(familyTree.findChild(familyTree.findByName("Ola")));
        System.out.println(familyTree.findParents(familyTree.findByName("Ola")));

        System.out.println("Поиск по имени человека ");
        System.out.println(familyTree.findByName("Tana").toString());
        System.out.println(familyTree.findChild(familyTree.findByName("Tana")));
        System.out.println(familyTree.findParents(familyTree.findByName("Tana")));







    }}



