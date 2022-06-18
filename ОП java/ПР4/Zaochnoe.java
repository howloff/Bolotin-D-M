public class Zaochnoe extends Student {
    private String MestoRaboti;
    private int Summa;
    private String Doljnost;

    public Zaochnoe(int NZachetki, int Group, int Ocenka, String Familiya, String Name, String Kafedra, String Descipline, String FamiliyaPrepodavatelya, String MestoRaboti, int Summa, String Doljnost) {
        super(NZachetki, Group, Ocenka, Familiya, Name, Kafedra, Descipline, FamiliyaPrepodavatelya);
    	this.MestoRaboti = MestoRaboti;
        this.Summa = Summa;
        this.Doljnost = Doljnost;
    }
    
    public void setMestoRaboti(String MestoRaboti) {
        this.MestoRaboti = MestoRaboti;
    }
    public String getMestoRaboti() {
        return MestoRaboti;
    }

    public void setDoljnost(String Doljnost) {
        this.Doljnost = Doljnost;
    }
    public String getDoljnost() {
        return Doljnost;
    }
    
    public void setSumma(int Summa) {
        this.Summa = Summa;
    }
    public int getSumma() {
        return Summa;
    }

    public String toString()
    {
        return super.toString() + "\nMesto Raboti  - " + MestoRaboti + "\nDoljnost - " + Doljnost + "\nSumma obucheniya  - " + Summa;
    }
}