package exercícioFacade;

public class Combo {
    private Bebida bebida = new Bebida();
    private Burguer burguer = new Burguer();
    private Sobremesa sobremesa = new Sobremesa();


    public void CriarCombo(int tipo) {

        switch (tipo){

            case 1: {
                burguer.setDescricao("X-TUDO");
                burguer.setGramas(200);
                burguer.setPreco(23.99);

                bebida.setDescricao("COCA-COLA");
                bebida.setMl(600);
                bebida.setPreco(7.99);

                sobremesa.setDescricao("AÇAÍ");
                sobremesa.setTamanhho("G");
                sobremesa.setPreco(15.99);
                break;
            }

            case 2: {
                burguer.setDescricao("X-BACON");
                burguer.setGramas(120);
                burguer.setPreco(18.99);

                bebida.setDescricao("GUARANÁ");
                bebida.setMl(350);
                bebida.setPreco(4.99);

                sobremesa.setDescricao("COOKIE");
                sobremesa.setTamanhho("M");
                sobremesa.setPreco(7.99);
                break;
            }

            default: System.out.println("Código não corresponde a nenhuma categoria de livro");
        }
    }

    public String toString(){
        return "Combo: " +
                "\nBurguer: " + burguer.getDescricao() + " - " + burguer.getGramas() + "g - " + burguer.getPreco() +
                "\nBebida: " + bebida.getDescricao()  + " - " + bebida.getMl() + "ml - " + bebida.getPreco() +
                "\nSobremesa: " + sobremesa.getDescricao() + " - " + sobremesa.getTamanhho() + " - " + sobremesa.getPreco();
    }
}
