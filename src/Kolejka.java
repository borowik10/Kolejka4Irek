

public class Kolejka {
    private Element pierwszy;
    private Element ostatni;

    public Kolejka() {
        pierwszy = null;
        ostatni = null;
    }
    public void add(int wartosc) {
        Element nowyElement = new Element(wartosc);
        if (isEmpty()) {
            pierwszy = ostatni = nowyElement;
        } else {
            nowyElement.setPoprzedni(ostatni);
            ostatni.setNastepny(nowyElement);
            ostatni = nowyElement;
        }
    }
    public int pop() {
        return pierwszy.getWartosc();
    }
    public int popLast (){
        return ostatni.getWartosc();
    }
    public int push() {
        int zwracana = pierwszy.getWartosc();
        pierwszy = pierwszy.getNastepny();
        pierwszy.setPoprzedni(null);
        return zwracana;
    }
    public int pushLast(){
        int zwracana = ostatni.getWartosc();
        ostatni = ostatni.getPoprzedni();
        ostatni.setNastepny(null);
        return zwracana;
    }
    public void swap(int index1, int index2){
        index1 = 1;
        index2 = 2;
    }
    public Element find(int szukana) {
        Element indexElement = pierwszy;
        int index = 0;
        while (indexElement != null) {
            if (szukana == indexElement.getWartosc()) {
                System.out.println("Wartosc " + szukana + " została znaleziona na indeksie " + index);
                return indexElement;
            } else {
                index++;
                indexElement = indexElement.getNastepny();
            }
        }
        System.out.println();
        System.out.println("Niestety nie znalazłem wartości "+szukana);
        return null;
    }
    public boolean delete(int usuwana) {
        Element znaleziony = find(usuwana);
        if (znaleziony != null ) {
            if (znaleziony == pierwszy) push();
            else {
                if (znaleziony == ostatni) {
                    ostatni = ostatni.getPoprzedni();
                    ostatni.setNastepny(null);
                } else {
                    znaleziony.getPoprzedni().setNastepny(znaleziony.getNastepny());
                    znaleziony.getNastepny().setPoprzedni(znaleziony.getPoprzedni());
                }
            }
            return true;
        }
        return false;
    }
    public void show() {
        Element indexElement = pierwszy;
        while (indexElement != null) {
            System.out.print(indexElement.getWartosc() + " ");
            indexElement = indexElement.getNastepny();
        }
    }
    public void showReverse(){
        Element indexElement = ostatni;
        while( indexElement != null){
            System.out.print(indexElement.getWartosc() + " ");
            indexElement = indexElement.getPoprzedni();
        }
    }
    public boolean isEmpty() {
        if (ostatni == null) return true;
        else return false;
    }
}
