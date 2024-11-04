import java.time.LocalDate;

public class Main {

    public static Double calcularDesconto(Produto produto) {
        if (produto instanceof Eletronico eletronico) {
            var descontoPorcentagem = eletronico.isGarantia() ? 0.15 : 0.10;

            return eletronico.getPreco() * descontoPorcentagem;
    }
        if (produto instanceof Alimento alimento) {
            var descontoPorcentagem = alimento.getDataValidade().isEqual(LocalDate.now()) ? 0.20: 0.05;
            return alimento.getPreco() * descontoPorcentagem;
        }

        return produto.getPreco() * 0.05;
    }

    public static void main(String[] args) {
        var geladeira = new Eletronico("Geraladeira Brastemp Frost Free 375l",3000.00,false); //2550
        var chocolate = new Alimento("LINDOR Singles ao Leite 100g", 32.00, LocalDate.now().plusDays(2)); //25.60

        System.out.println(geladeira.getPreco() - calcularDesconto(geladeira));
        System.out.println(chocolate.getPreco() - calcularDesconto(chocolate));

    }
}