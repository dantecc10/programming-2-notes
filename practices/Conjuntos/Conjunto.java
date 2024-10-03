package practices.Conjuntos;

public class Conjunto {
    
    protected String items[];
    private int use = 0;

    // -----| Constructors |-----
    public Conjunto() {
        items = new String[0];
    }

    public Conjunto(int n) {
        items = new String[n];
    }
    
    // -----| Methods |-----
    public void add(String obj) {
        items = new String[3];
        items[use] = obj;
        use++;
    }

    public static Conjunto union(Conjunto c1, Conjunto c2) {
        int size = c1.items.length + c2.items.length;
        int index = 0;
        Conjunto union = new Conjunto(size);

        for (int i = 0; i < c1.items.length; i++) {
            union.items[index] = c1.items[i];
            index++;
        }

        for (int i = 0; i < c2.items.length; i++) {
            union.items[index] = c2.items[i];
            index++;
        }
        union.use = index - 1;

        return union;
    }
}
