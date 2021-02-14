#Author: Vinicius Souza
#language: pt
#encoding: UTF-8

Funcionalidade: Listar os empregados cadastrados na API do desafio Inmetrics

  @listarEmpregadosSucesso
  Cenario: Listar todos os empregados cadastrados com sucesso
    Dado que quero listar todos os empregados com sucesso
    Quando envio o request para endpoint empregados
    Entao recebo a lista com empregados

  @listarEmpregadoSelecionado
  Cenario: Listar todos os usuarios cadastrados com sucesso
    Dado que quero listar um usuario especifico com sucesso
    Quando envio o request para endpoint listagem filtrada
    Entao recebo o empregado