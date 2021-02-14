package br.com.inmetrics.teste.functionalities;

import br.com.inmetrics.teste.commons.BaseTestWeb;
import br.com.inmetrics.teste.pages.ObtemDadosCadastraisWebPage;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.*;

public class ObterDadosCadastraisFunctionality extends BaseTestWeb {

    String nome, cpf, dataNasc, dataNascimento, email, tel, telefone, data ,telefoneNovo, dataNovo;

    private ObtemDadosCadastraisWebPage obtemDadosCadastraisWebPage;

    public ObterDadosCadastraisFunctionality() {
        this.obtemDadosCadastraisWebPage = new ObtemDadosCadastraisWebPage(webDriver);
    }

    public void clickGerarPessoa() {
        wait.until(ExpectedConditions.elementToBeClickable(this.obtemDadosCadastraisWebPage.getBtn4GerarPessoa()));
        this.obtemDadosCadastraisWebPage.getBtn4GerarPessoa().click();
    }

    public void armazenaDados() throws IOException {
        wait.until(ExpectedConditions.elementToBeClickable(this.obtemDadosCadastraisWebPage.getBtn4Nome()));
        nome = this.obtemDadosCadastraisWebPage.getBtn4Nome().getText();
        cpf = this.obtemDadosCadastraisWebPage.getBtn4Cpf().getText();

        dataNasc = this.obtemDadosCadastraisWebPage.getBtn4Data().getText();
        data = dataNasc.replaceAll("[^a-zA-Z0-9]", "");

        email = this.obtemDadosCadastraisWebPage.getBtn4Email().getText();

        tel = this.obtemDadosCadastraisWebPage.getBtn4Tel().getText();
        telefone = tel.replaceAll("[^a-zA-Z0-9]", "");

        BufferedWriter buff = new BufferedWriter(new FileWriter("dados.txt"));
        buff.write(nome);
        buff.newLine();
        buff.write(cpf);
        buff.newLine();
        buff.write(data);
        buff.newLine();
        buff.write(email);
        buff.newLine();
        buff.write(telefone);
        buff.newLine();

        buff.close();
    }

}
