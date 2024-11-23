package br.com.unisales.service;

import br.com.unisales.dao.PassageiroDao;
import br.com.unisales.table.Passageiro;

public class PassageiroService {
    private PassageiroDao dao;
    public PassageiroService() {
        this.dao = new PassageiroDao();
    }

    public String salvar(Passageiro passageiro) {
        return this.dao.salvar(passageiro);
    }
}
