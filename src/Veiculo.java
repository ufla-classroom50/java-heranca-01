public class Veiculo {
    private String marca; // Erro: Deveria ser protected conforme o enunciado

    public void acelerar() {
        System.out.println("Acelerando...");
    }
}

// Erro: Esqueceu de colocar "extends Veiculo"
class Carro { 
    public void acelerar() {
        System.out.println("Carro acelerando");
    }
}