import com.carlos.exportador.ExportadorListaProduto;
import com.carlos.exportador.Produto;

import java.util.Arrays;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(
                new Produto(1,"TV", "LG", "1234-a", 1200),
                new Produto(2,"Geladeira", "Electrolux", "Delux", 400),
                new Produto(3,"Notebook", "Asus", "Predator", 850)
                );

        ExportadorListaProduto exportador = ExportadorListaProduto.newInstance("csv");
        System.out.println(exportador.exportador(produtos));
    }
}