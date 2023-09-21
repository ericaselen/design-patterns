package exercicioSingleton;

public class Main {

    public static void main(String[] args) {
        Fila fila1 = Fila.getInstancia();
        fila1.setNomeDocumento("Documento 1");
        System.out.println(fila1.getNomeDocumento());

        Fila fila2 = Fila.getInstancia();
        fila2.setNomeDocumento("item 1");
        System.out.println(fila2.getNomeDocumento());
    }
}
