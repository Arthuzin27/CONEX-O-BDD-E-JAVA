package br.com.unisales.service;

import br.com.unisales.dao.OnibusDao;
import br.com.unisales.table.Onibus;

public class OnibusService {
    private OnibusDao dao;

    public OnibusService() {
        this.dao = new OnibusDao();
    }

    public String salvar(Onibus onibus) {
        return this.dao.salvar(onibus);
    }
}
