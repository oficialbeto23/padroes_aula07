package com.carlos.exportador;

import java.util.List;

public interface ExportadorListaProduto {
    String abrirTabela();
    String fecharTabela();
    String abrirLinha();
    String fecharLinha();
    String fecharLinhaTitulos();
    String abrirColuna(String valor);
    String fecharColuna();
    String exportador(List<Produto> listaProdutos);

    static ExportadorListaProduto newInstance(){
        return newInstance("html");
    }

    static ExportadorListaProduto newInstance(String extensaoArquivoExportacao){
        if(extensaoArquivoExportacao.equalsIgnoreCase("html"))
            return new ExportadorListaProdutosHtml();
        else if (extensaoArquivoExportacao.equalsIgnoreCase("md"))
            return new ExportadorListaProdutosMarkdown();
        else if (extensaoArquivoExportacao.equalsIgnoreCase("csv"))
            return new ExportadorListaProdutosCsv();
        throw new UnsupportedOperationException("Formato não suportado: "+ extensaoArquivoExportacao);

    }

}
