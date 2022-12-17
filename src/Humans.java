import java.util.ArrayList;
import java.util.List;


public class Humans {

    private String name;
    private String gender;
    private Humans father;
    private Humans mother;


    private List<Humans> children = new ArrayList<>();


    public Humans(String name, String gender, Humans father, Humans mother) {
        this.name = name;
        this.gender = gender;
        this.father = father;
        this.mother = mother;
        father.children.add(this);
        mother.children.add(this);


    }

    public Humans(String name, String gender) {
        this.name = name;
        this.gender = gender;
        this.father = null;
        this.mother = null;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Humans getFather() {
        return father;
    }

    public Humans getMother() {
        return mother;
    }


    public String getChildren() {
        String res ="";
        for (Humans child : children) {
            res += child + "\n";
        }
        return "Дети этого человека\n " + res;
    }

    @Override
    public String toString() {
        return "Имя ='" + name + '\'' +
                ", Пол ='" + gender + '\'';
    }

    public String printParents() {
        if (father == null || mother == null) {
            return "Нет данных о родителей данного человека";
        } else {
            return
                    "Родители данного человека \n" +
                    "Отец = " + father + "\n"+
                     "Мать = " + mother;
        }
    }



    }





