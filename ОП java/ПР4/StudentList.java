import java.util.ArrayList;
public class StudentList {
    private ArrayList<Student> Std;

    public StudentList() {
    	Std = new ArrayList<Student>();
    }

    public void Add(Student stud) {
    	Std.add(stud);
    }

    public String toString() {
        String str = "";
        for (int i=0; i<Std.size(); i++) {
            str+=Std.get(i);
            str+="\n\n";
        }
        return str;
    }
    public static void main(String[] args) {
    	StudentList list = new StudentList();
    	list.Add(new Celevoe(067123, 241, 5, "Petrunya", "Volodya", "Informacionnie Systems","Osnovi Programmirovaniya", "Grechishkin", "Yandex", 98000));
    	list.Add(new Ochnoe(067124, 242, 4, "Vatrushkin", "Vasya", "Informacionnie Systems","Osnovi Programmirovaniya", "Grechishkin", 4.45, 83));
    	list.Add(new Zaochnoe(067125, 245, 3, "Vasilin", "Dima", "Informacionnie Systems","Osnovi Programmirovaniya", "Grechishkin", "Vkusno & tochka", 110000, "Kassir"));

        System.out.println(list);
    }
}
