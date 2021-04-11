public class Bankszamla{
    private String tulajdonos;
    private int osszeg;

    public Bankszamla(String tulajdonos) {
        this.tulajdonos = tulajdonos;
        osszeg = 1000;
    }

    public boolean jovairas(int osszeg){
        this.osszeg += osszeg;
        return true;
    }

    public boolean koltes(int osszeg){
        if (this.osszeg >= osszeg) {
            this.osszeg -= osszeg;
            return true;
        }

        return false;
    }
}
