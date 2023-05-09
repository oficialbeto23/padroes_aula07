package com.carlos.exportador;

public class ExportadorListaProdutosCsv extends AbstractExportadorListaProduto{
    @Override
    public String abrirTabela() {
        return "<table>\n";
    }

    @Override
    public String fecharTabela() {
        return "</table>";
    }

    @Override
    public String abrirLinha() {
        return "";
    }

    @Override
    public String fecharLinha() {
        return "\n";
    }

    @Override
    public String fecharLinhaTitulos() {
        return "";
    }

    @Override
    public String abrirColuna(String valor) {
        return "" + valor;
    }

    @Override
    public String fecharColuna() {
        return ",";
    }
}
