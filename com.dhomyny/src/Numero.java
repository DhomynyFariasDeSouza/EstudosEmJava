public class Numero {
    private int DDDPais;
    private int DDD;
    private int numero;

    public Numero(int DDDPais, int DDD, int numero) {
        this.DDDPais = DDDPais;
        this.DDD = DDD;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Numero{"+"+"+DDDPais+" ("+DDD+") "+numero+ '}';
    }
}
