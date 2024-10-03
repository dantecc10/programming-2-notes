package practices.Conjuntos;

public class OperaConjunto {
    public static void main(String args[]) {
        Conjunto con1 = new Conjunto(1);
        Conjunto con2 = new Conjunto(2);
        con1.add("hola");
        con2.add(" esto es ");
        con2.add("una prueba");

        Conjunto con3 = Conjunto.union(con1, con2);
        System.out.println("Items: " + con3.items.length);
        System.out.println("" + con3.items[0] + con3.items[1] + con3.items[2]);
        con3.add("!");
        System.out.println("" + con3.items[0] + con3.items[1] + con3.items[2] + con3.items[3]);
    }
}
