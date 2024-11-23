package br.com.unisales.service;

import br.com.unisales.dao.PassagemDao;
import br.com.unisales.table.Passagem;

public class PassagemService {
    private PassagemDao dao;
    public PassagemService() {
        this.dao = new PassagemDao();
    }

    public String salvar(Passagem passagem) {
        return this.dao.salvar(passagem);
    }
}
