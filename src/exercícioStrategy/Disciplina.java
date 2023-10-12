package exercícioStrategy;

public class Disciplina {
    
    double P1;
    double P2;
    double Media;
    String Nome;
    String Situacao;
    ICalcMedia calculo;

    public double getP1() {
        return this.P1;
    }

    public void setP1(double P1) {
        this.P1 = P1;
    }

    public double getP2() {
        return this.P2;
    }

    public void setP2(double P2) {
        this.P2 = P2;
    }

    public double getMedia() {
        return this.Media;
    }

    public void setMedia(double Media) {
        this.Media = Media;
    }

    public String getNome() {
        return this.Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSituacao() {
        return this.Situacao;
    }

    public void setSituacao(String Situacao) {
        this.Situacao = Situacao;
    }

   public ICalcMedia getCalcMedia() {
        return calculo;
    }

    public void setCalcMedia(ICalcMedia CalcMedia) {
        this.calculo = CalcMedia;
    }

    public void Calcular(){
        Media = calculo.Calcular(P1, P2);
    }
    public Disciplina(ICalcMedia calculo){
        this.calculo = calculo;
    }
}