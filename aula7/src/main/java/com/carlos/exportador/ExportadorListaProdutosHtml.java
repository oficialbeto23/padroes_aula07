package com.carlos.exportador;

public class ExportadorListaProdutosHtml extends AbstractExportadorListaProduto{
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
        return "<tr>";
    }

    @Override
    public String fecharLinha() {
        return "</tr>";
    }

    @Override
    public String fecharLinhaTitulos() {
        return "";
    }

    @Override
    public String abrirColuna(String valor) {
        return "<td>" + valor;
    }

    @Override
    public String fecharColuna() {
        return "</td>";
    }
}
