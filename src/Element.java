

public class Element {

    private int wartosc;
    private Element nastepny;
    private Element poprzedni;

    public Element(int wartosc) {
        this.wartosc = wartosc;
        nastepny = null;
        poprzedni = null;
    }
    public int getWartosc() {
        return wartosc;
    }
    public void setNastepny(Element nastepny) {
        this.nastepny = nastepny;
    }
    public Element getNastepny() {
        return nastepny;
    }
    public Element getPoprzedni() {
        return poprzedni;
    }
    public void setPoprzedni(Element poprzedni) {
        this.poprzedni = poprzedni;
    }
}