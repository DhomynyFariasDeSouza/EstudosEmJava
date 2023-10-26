public class Main {
    public static void main(String[] args) {
        Pessoa dhomyny = new Pessoa("Dhomyny ryan farias de souza",20,Nacionalidades.BRASIL,"706.889.274-40");
        Pessoa sophia = new Pessoa("Sophia Kamilly Elaine Lopes",40,Nacionalidades.BRASIL,"845.349.485-14");
        Pessoa Sebastiana = new Pessoa("Sebastiana Mirella Cecília Baptista", 80,Nacionalidades.CHILE,"221.544.656-09");
        Pessoa barbara = new Pessoa("Bárbara Alana Martins",50,Nacionalidades.ARGENTINA,"116.525.433-68");
        Pessoa marcelo = new Pessoa("Marcelo Nelson Felipe Almeida",24,Nacionalidades.BOLIVIA,"976.602.943-18");
        Pessoa bento = new Pessoa("Bento Manoel Viana",25,Nacionalidades.BRASIL,"433.888.759-10");
        Pessoa raimundo = new Pessoa("Raimundo Raimundo Severino Lima",32,Nacionalidades.CHILE,"188.693.130-50");

        dhomyny.setNumero(new Numero(55,84,981477219));
        dhomyny.setNumero(new Numero(55,21,992138264));

        System.out.println(dhomyny.getNumero());

    }
}