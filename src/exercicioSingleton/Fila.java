package exercicioSingleton;

public class Fila {
    private String nomeDocumento;
    private static Fila fila;
    public static Fila getInstancia () {
        if (fila == null) {
            fila = new Fila();
        }
        return fila;
    }
    public void setNomeDocumento (String nomeDocumento) {
        this.nomeDocumento = nomeDocumento;
    }
    public String getNomeDocumento () {
        return nomeDocumento;
    }

    public void ImprimeDocumeto () {

    }
    public void RemoveDocumeto () {

    }
    public void RemoveTodosDocumetos () {

    }
}
