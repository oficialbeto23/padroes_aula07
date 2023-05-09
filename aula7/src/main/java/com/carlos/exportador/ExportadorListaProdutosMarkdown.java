package com.carlos.exportador;

import java.util.Arrays;

public class ExportadorListaProdutosMarkdown extends AbstractExportadorListaProduto{
    @Override
    public String abrirTabela() {
        return "";
    }

    @Override
    public String fecharTabela() {
        return "";
    }

    @Override
    public String abrirLinha() {
        return "";
    }

    @Override
    public String fecharLinha() {
        return "";
    }

    @Override
    public String fecharLinhaTitulos() {
        return gerarColunasLinha(Arrays.asList("----", "-----", "----"));
    }

    @Override
    public String abrirColuna(String valor) {
        return "| " + valor;
    }

    @Override
    public String fecharColuna() {
        return "";
    }
}
