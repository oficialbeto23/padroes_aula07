package com.carlos.exportador;

import java.util.Arrays;
import java.util.List;

public abstract class AbstractExportadorListaProduto implements ExportadorListaProduto{
    
    protected static final List<String> TITULOS_COLUNAS = Arrays.asList("Código","Descrição","Marca", "Modelo", "Estoque");
    
    
    @Override
    public final String exportador(List<Produto> listaProdutos) {
        StringBuilder builder = new StringBuilder();
        builder.append(abrirTabela());


        builder.append(gerarColunasLinha( TITULOS_COLUNAS));
        builder.append(fecharLinhaTitulos());
        gerarLinhasProdutos(builder, listaProdutos);

        builder.append(fecharTabela());
        return builder.toString();
    }

    private void gerarLinhasProdutos(StringBuilder builder, List<Produto> listaProdutos) {
        for (Produto produto : listaProdutos){
            List<String> valores = Arrays.asList(
                    String.valueOf(produto.getId()),
                    String.valueOf(produto.getDescricao()),
                    String.valueOf(produto.getMarca()),
                    String.valueOf(produto.getModelo()),
                    String.valueOf(produto.getEstoque())
            );

            builder.append(gerarColunasLinha( valores));
        }
    }

    protected String gerarColunasLinha( List<String> valores) {
        StringBuilder builder = new StringBuilder();
        builder.append(abrirLinha());
        for (String titulo : valores) {
            builder.append(abrirColuna(titulo));
            builder.append(fecharColuna());
        }
        builder.append(fecharLinha());
        builder.append("\n");
        return builder.toString();
    }
}
