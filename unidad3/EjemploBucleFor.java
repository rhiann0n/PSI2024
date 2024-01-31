package unidad3;

public class EjemploBucleFor {
    public static void main(String[] args) {
        int i=0;
        for (i=0; i<=10; i++){
            System.out.println("El valor de i es -> " + i);
        }
        /* Si la variable i está declarada dentro del for, solo se puede obtener su valor
         * dentro del bloque for por tener ámbito local. */
        System.out.println("Ultimo valor de i " + i);
    }
}
