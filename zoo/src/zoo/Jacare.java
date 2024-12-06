package zoo;

public class Jacare extends Animal {
    private String gostaDeAguaDoce;

    public String getGostaDeAguaDoce() {
        return gostaDeAguaDoce;
    }

    public void setGostaDeAguaDoce(String gostaDeAguaDoce) {
        this.gostaDeAguaDoce = gostaDeAguaDoce;
    }

    @Override
    public void brincar() {
        System.out.println("Jacaré");
        System.out.println(getNome() + " brincando");
        System.out.println("Cor: " + getCor());
        System.out.println("Raça: " + getRaca());
        System.out.println("Peso: " + getPeso() + " kg");
        System.out.println("Gosta de água doce: " + getGostaDeAguaDoce());
        System.out.println();  
    }
}