package br.com.inmetrics.teste.pages;

public class Empregado {

    private String admissao;
    private String cargo;
    private String comissao;
    private String cpf;
    private Integer departamentoId;
    private String nome;
    private String salario;
    private String sexo;
    private String tipoContratacao;

    public Empregado(String admissao, String cargo, String comissao, String cpf, Integer departamentoId, String nome, String salario, String sexo, String tipoContratacao) {
        this.admissao = admissao;
        this.cargo = cargo;
        this.comissao = comissao;
        this.cpf = cpf;
        this.departamentoId = departamentoId;
        this.nome = nome;
        this.salario = salario;
        this.sexo = sexo;
        this.tipoContratacao = tipoContratacao;
    }
}
