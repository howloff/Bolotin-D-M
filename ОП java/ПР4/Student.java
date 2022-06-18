public class Student {
    private int NZachetki;
    private int Group;
    private int Ocenka;
    private String Familiya;
    private String Name;
    private String Kafedra;
    private String Descipline;
    private String FamiliyaPrepodavatelya;
    
    public Student(int NZachetki, int Group, int Ocenka, String Familiya, String Name, String Kafedra, String Descipline, String FamiliyaPrepodavatelya) {
        this.NZachetki = NZachetki;
        this.Group = Group;
        this.Ocenka = Ocenka;
        this.Familiya = Familiya;
        this.Name = Name;
        this.Kafedra = Kafedra;
        this.Descipline = Descipline;
        this.FamiliyaPrepodavatelya = FamiliyaPrepodavatelya;
    }
    
    
    public void setNZachetki(int NZachetki) {
        this.NZachetki = NZachetki;
    }
    public int getNZachetki() {
        return NZachetki;
    }

    public void setGroup(int Group) {
        this.Group = Group;
    }
    public int getGroup(){
        return Group;
    }

    public void setOcenka(int Ocenka) {
        this.Ocenka = Ocenka;
    }
    public int getOcenka() {
        return Ocenka;
    }

    public void setFamiliya(String Familiya) {
        this.Familiya = Familiya;
    }
    public String getFamiliya() {
        return Familiya;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    public String getName() {
        return Name;
    }

    public void setKafedra(String Kafedra) {
        this.Kafedra = Kafedra;
    }
    public String getKafedra() {
        return Kafedra;
    }

    public void setDescipline(String Descipline) {
        this.Descipline = Descipline;
    }
    public String getDescipline() {
        return Descipline;
    }

    public void setFamiliyaPrepodavatelya(String FamiliyaPrepodavatelya) {
        this.FamiliyaPrepodavatelya = FamiliyaPrepodavatelya;
    }
    public String getFamiliyaPrepodavatelya() {
        return FamiliyaPrepodavatelya;
    }
    
    
    public String toString() {
        return "Student:\n" + "Nomer Zachetki - " + NZachetki + "\nGruppa - " + Group + "\nOcenka - " + Ocenka + "\nFamiliya - " + Familiya + "\nImya - " + Name + "\nKafedra - " + Kafedra + "\nDisciplina - " + Descipline + "\nFamiliya Prepodavatelya - " + FamiliyaPrepodavatelya;
    }

}