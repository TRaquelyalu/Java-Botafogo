package zoo;

public class Gato extends Animal {
    private String gostaDeArranhar;

    public String getGostaDeArranhar() {
        return gostaDeArranhar;
    }

    public void setGostaDeArranhar(String gostaDeArranhar) {
        this.gostaDeArranhar = gostaDeArranhar;
    }

    @Override
    public void brincar() {
        System.out.println("Gato");
        System.out.println(getNome() + " brincando");
        System.out.println("Cor: " + getCor());
        System.out.println("Raça: " + getRaca());
        System.out.println("Peso: " + getPeso() + " kg");
        System.out.println("Gosta de arranhar: " + getGostaDeArranhar());
        System.out.println();
    }
}