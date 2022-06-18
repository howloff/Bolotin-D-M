public class Celevoe extends Student {
    private String NCP;
    private int Summa;

    public Celevoe(int NZachetki, int Group, int Ocenka, String Familiya, String Name, String Kafedra, String Descipline, String FamiliyaPrepodavatelya, String NCP, int Summa) {
        super(NZachetki, Group, Ocenka, Familiya, Name, Kafedra, Descipline, FamiliyaPrepodavatelya);
    	this.NCP = NCP;
        this.Summa = Summa;

    }
    public void setNCP(String NCP) {
        this.NCP = NCP;
    }
    public String getNCP() {
        return NCP;
    }

    public void setSumma(int Summa) {
        this.Summa = Summa;
    }
    public int getSumma() {
        return Summa;
    }

    public String toString()
    {
        return super.toString() + "\nNazvanie celevogo predpriyatiya  - " + NCP + "\nSumma obucheniya - " + Summa;
    }
}