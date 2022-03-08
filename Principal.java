public class Principal {
    public static void main(String [] args) {


        Papagaio p=new Papagaio();
        Aguia a=new Aguia();
        Cachorro c=new Cachorro();
        Gato g=new Gato();

        System.out.println("Aguia");
        a.setNome("Corinthians");
        System.out.println(a.getNome());
        System.out.println(a.voar());

        System.out.println("----------------------------------------");

        System.out.println("Papagaio");
        p.setNome("Loro");
        System.out.println(p.getNome());
        System.out.println(p.voar());

        System.out.println("----------------------------------------");

        System.out.println("Cachorro");
        c.setNome("Nike");
        c.setTamanho("Alto");
        c.setRaca("Shitsu");
        System.out.println(c.getNome());
        System.out.println(c.getTamanho());
        System.out.println(c.getRaca());
        System.out.println(c.emitirSom());

        System.out.println("----------------------------------------");

        System.out.println("Gato");
        g.setNome("Garfield");
        g.setRaca("Ciemense");
        System.out.println(g.getNome());
        System.out.println(g.getRaca());
        System.out.println(g.emitirSom());

    }
}
