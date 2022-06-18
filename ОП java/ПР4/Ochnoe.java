public class Ochnoe extends Student {
    private double SrBal;
    private int BallEge;

    public Ochnoe(int NZachetki, int Group, int Ocenka, String Familiya, String Name, String Kafedra, String Descipline, String FamiliyaPrepodavatelya, double SrBal, int BallEge) {
        super(NZachetki, Group, Ocenka, Familiya, Name, Kafedra, Descipline, FamiliyaPrepodavatelya);
    	this.SrBal = SrBal;
        this.BallEge = BallEge;
    }
        
    public void setSrBal(double SrBal) {
        this.SrBal = SrBal;
    }
    public double getSrBal() {
        return SrBal;
    }

    public void setBalEge(int BalEge) {
        this.BallEge = BalEge;
    }
    public int getBalEge() {
        return BallEge;
    }

    public String toString()
    {
        return super.toString() + "\nSredniy ball - " + SrBal + "\nBall EGE - " + BallEge;
    }
}