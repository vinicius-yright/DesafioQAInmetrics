package br.com.inmetrics.teste.functionalities;

import br.com.inmetrics.teste.commons.BaseTest;
import br.com.inmetrics.teste.pages.CadastroWebPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.io.*;
import java.nio.charset.StandardCharsets;


public class CadastroFunctionality extends BaseTest {

    private CadastroWebPage cadastroWebPage;
    String nomeNovo, cpfNovo, emailNovo, dataNovo, telefoneNovo;

    public CadastroFunctionality() {
        this.cadastroWebPage = new CadastroWebPage(webDriver);
    }

    public void clickIrTelaCadastro() {
        wait.until(ExpectedConditions.elementToBeClickable(this.cadastroWebPage.getBtnIniciarCadastro()));
        this.cadastroWebPage.getBtnIniciarCadastro().click();
    }

    public void clickFinalizarCadastro() {
        wait.until(ExpectedConditions.elementToBeClickable(this.cadastroWebPage.getBtnCadastrar()));
        this.cadastroWebPage.getBtnCadastrar().click();
    }

    public String pegaMensagemSucesso() {
        wait.until(ExpectedConditions.elementToBeClickable(this.cadastroWebPage.getTxtSucesso()));
        return this.cadastroWebPage.getTxtSucesso().getText();
    }

    public void preencheDadosCadastro() throws IOException {
        int i = 2;

        FileInputStream test = new FileInputStream("dados.txt");
        Reader reader = new InputStreamReader(test, StandardCharsets.UTF_8);
        BufferedReader buff = new BufferedReader(reader);

        String linha = buff.readLine();
        nomeNovo = linha;

        while (linha != null) {
            linha = buff.readLine();

            switch(i) {
                case 2:
                    cpfNovo = linha;
                case 3:
                    dataNovo = String.valueOf(linha);
                case 4:
                    emailNovo = linha;
                case 5:
                    telefoneNovo = String.valueOf(linha);
            }
            i++;
        }

        buff.close();

        wait.until(ExpectedConditions.visibilityOf(this.cadastroWebPage.getTxtNome()));
        this.cadastroWebPage.getTxtNome().sendKeys(nomeNovo);
        this.cadastroWebPage.getTxtCpf().sendKeys(cpfNovo);

        Select selectSexo = new Select(webDriver.findElement(By.name("sexo")));
        selectSexo.selectByVisibleText("Indiferente");

        this.cadastroWebPage.getTxtAdmissao().sendKeys(dataNovo);
        this.cadastroWebPage.getTxtCargo().sendKeys("Analista Software");
        this.cadastroWebPage.getTxtDinheiro().sendKeys("3100");
        this.cadastroWebPage.getSelectClt().click();
    }
}
