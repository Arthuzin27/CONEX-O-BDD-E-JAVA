package br.com.unisales.service;

import br.com.unisales.dao.ViagemDao;
import br.com.unisales.table.Viagem;

public class ViagemService {
    private ViagemDao dao;
    public ViagemService() {
        this.dao = new ViagemDao();
    }

    public String salvar(Viagem viagem) {
        return this.dao.salvar(viagem);
    }
}
