public class Gato extends Mamifero {
    
    private String raca;

    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    @Override
    public String amamentar() {
        // TODO Auto-generated method stub
        return "Amamenta Bem";
    }
    
    @Override
    public String emitirSom() {
        // TODO Auto-generated method stub
        return "Emite som baixo!";
    }
}
