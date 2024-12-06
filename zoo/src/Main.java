
public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.setNome("Magali");
        gato.setCor("Branco");
        gato.setRaca("Angorá");
        gato.setPeso(4.5);
        gato.setGostaDeArranhar("Sim, gosta de arranhar móveis.");

        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Pandora");
        cachorro.setCor("laranja");
        cachorro.setRaca("Caramelo");
        cachorro.setPeso(20.0);
        cachorro.setSabeLatir("Sim, late bastante.");

        Jacare jacare = new Jacare();
        jacare.setNome("Zé");
        jacare.setCor("Verde");
        jacare.setRaca("Jacaré-açu");
        jacare.setPeso(200.0);
        jacare.setGostaDeAguaDoce("Sim, adora água doce.");

        
        gato.brincar();
        cachorro.brincar();
        jacare.brincar();
    }
}