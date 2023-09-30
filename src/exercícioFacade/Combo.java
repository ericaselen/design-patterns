package exercícioFacade;

public class Combo extends Produto {
    private Bebida bebida = new Bebida();
    private Burguer burguer = new Burguer();
    private Sobremesa sobremesa = new Sobremesa();


    public void CriarCombo (int tipo) {

        switch (tipo){

            case 1:
                this.burguer.setDescricao("X-TUDO");
                this.burguer.setGramas(200);
                this.burguer.setPreco(23.99);
                this.bebida.setDescricao("COCA-COLA");
                this.bebida.setMl(600);
                this.bebida.setPreco(7.99);
                this.sobremesa.setDescricao("AÇAÍ");
                this.sobremesa.setTamanhho("G");
                this.sobremesa.setPreco(15.99);
                break;

            case 2:
                this.burguer.setDescricao("X-BACON");
                this.burguer.setGramas(120);
                this.burguer.setPreco(18.99);
                this.bebida.setDescricao("GUARANÁ");
                this.bebida.setMl(350);
                this.bebida.setPreco(4.99);
                this.sobremesa.setDescricao("COOKIE");
                this.sobremesa.setTamanhho("M");
                this.sobremesa.setPreco(7.99);
                break;

            default: System.out.println("Código não corresponde a nenhuma categoria de livro");
        }
    }

    public String toString(){
        return "Combo: " + "\n" +
                "Burguer: " + this.burguer.getDescricao()  + this.burguer.getGramas() + "g" + this.burguer.getPreco() + "\nBebida: " + this.bebida.getDescricao()  + this.bebida.getMl() + "ml" + this.bebida.getPreco() + "\nSobremesa: " + this.sobremesa.getDescricao() + this.sobremesa.getTamanhho() + this.sobremesa.getPreco();
    }
}
