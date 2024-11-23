package br.com.unisales.service;

import br.com.unisales.dao.AssentoDao;
import br.com.unisales.table.Assento;

public class AssentoService {
    private AssentoDao dao;
    public AssentoService() {
        this.dao = new AssentoDao();
    }

    public String salvar(Assento assento) {
        return this.dao.salvar(assento);
    }
}