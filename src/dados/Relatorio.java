/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import java.io.FileWriter;
import java.io.PrintWriter;
import static dados.Dados.*;
import empresa.Doacao;
import empresa.Evento;
import pessoa.Voluntario;
import static runner.Runner.*;

/**
 *
 * @author Diego Herculano
 */
public class Relatorio {

    public static void main(String[] args) throws Exception {
//        adicionarDoacoes();
//        adicionarEventosETrabalhos();
//        gerarRelatorioFinanceiro();
    }

    public static void gerarRelatorioVoluntarios() throws Exception {
        FileWriter arquivo = new FileWriter("%USERPROFILE%\\Documents\\relVoluntarios.txt");
        PrintWriter gravar = new PrintWriter(arquivo);
        gravar.printf("VOLUNTARIOS \n");
        for (Voluntario lista : listaVoluntarios) {
            gravar.printf("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
            gravar.printf("Voluntario Nome: " + lista.getNome() + "\n");
            gravar.printf("Voluntario Tipo: " + lista.getTipo() + "\n");
            gravar.printf("Voluntario Documento: " + lista.getDocumento() + "\n");
        }
        arquivo.close();
    }

    public static void gerarRelatorioDoacoes() throws Exception {
        FileWriter arquivo = new FileWriter("C:\\Users\\Diego Herculano\\Documents\\relDoacoes.txt");
        PrintWriter gravar = new PrintWriter(arquivo);
        gravar.printf("DOACOES \n");
        for (Doacao lista : listaDoacao) {
            gravar.printf("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
            gravar.printf("Doacao Voluntario: " + lista.getVoluntario().getNome() + "\n");
            gravar.printf("Doacao Valor: " + String.valueOf(lista.getQuantiaDoada()) + "\n");
            gravar.printf("Doacao Forma: " + lista.getFormaEntrega() + "\n");
            gravar.printf("Doacao Repete mes: " + (lista.isRepeteMes() ? "Sim" : "Nao") + "\n");
        }
        arquivo.close();
    }

    public static void gerarRelatorioFinanceiro() throws Exception {
        FileWriter arquivo = new FileWriter("C:\\Users\\Diego Herculano\\Documents\\relFinanceiro.txt");
        PrintWriter gravar = new PrintWriter(arquivo);
        gravar.printf("FINANCEIRO \n");
        for (Doacao lista : listaDoacao) {
            gravar.printf("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
            gravar.printf("Receita doacao nome: " + lista.getVoluntario().getNome() + "\n");
            gravar.printf("Receita doacao valor: " + String.valueOf(lista.getQuantiaDoada()) + "\n");
        }

        for (Evento lista : listaEventos) {
            gravar.printf("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
            gravar.printf("Receita evento nome: " + lista.getNome() + "\n");
            gravar.printf("Receita gasto nome: " + lista.getGastoNome() + "\n");
            gravar.printf("Receita gasto valor: " + String.valueOf(lista.getGastoValor()) + "\n");
        }
        
        gravar.printf("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
        gravar.printf("Total recebido: " + String.valueOf(usuarioLogado.getGestor().totalDoacao()) + "\n");
        gravar.printf("Total gasto: " + String.valueOf(usuarioLogado.getGestor().totalGastos()) + "\n");
        
        double totalReceita = usuarioLogado.getGestor().totalDoacao() - usuarioLogado.getGestor().totalGastos();
        gravar.printf("Total receita: " + String.valueOf(totalReceita));
        
        arquivo.close();
    }

}
