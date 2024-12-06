package Animal;


public class Cachorro extends Animal {
    private String sabeLatir;

    public String getSabeLatir() {
        return sabeLatir;
    }

    public void setSabeLatir(String sabeLatir) {
        this.sabeLatir = sabeLatir;
    }

    @Override
    public void brincar() {
        System.out.println("Cachorro");
        System.out.println(getNome() + " brincando");
        System.out.println("Cor: " + getCor());
        System.out.println("Raça: " + getRaca());
        System.out.println("Peso: " + getPeso() + " kg");
        System.out.println("Sabe latir: " + getSabeLatir());
        System.out.println();  
    }
}
public class Cachorro {

}
