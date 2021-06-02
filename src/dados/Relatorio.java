/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static dados.Dados.*;
import empresa.Doacao;
import login.Usuario;
import pessoa.Voluntario;
import static runner.Runner.*;

/**
 *
 * @author Diego Herculano
 */
public class Relatorio {

    public static void main(String[] args) throws Exception {
        adicionarDoacoes();
        gerarRelatorioVoluntarios();
    }

     public static void gerarRelatorioVoluntarios() throws Exception {
        FileWriter arquivo = new FileWriter("C:\\Users\\Diego Herculano\\Documents\\voluntarios.txt");
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
        FileWriter arquivo = new FileWriter("C:\\Users\\Diego Herculano\\Documents\\doacoes.txt");
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
}
