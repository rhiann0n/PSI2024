package unidad3;

public class EjemploBucle {
    public static void main(String[] args) {
        int i = 1; //valor inicial
        boolean t = true;
        while (t) { //el bucle iterará mientras i sea menor o igual que 3
            System.out.println(i); //mostramos i
            i++; //incrementamos i
            if (i >= 3) {
                t=false;
            }
        }
    }
}
