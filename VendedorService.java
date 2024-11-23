package br.com.unisales.service;

import br.com.unisales.dao.VendedorDao;
import br.com.unisales.table.Vendedor;

public class VendedorService {
    private VendedorDao dao;
    public VendedorService() {
        this.dao = new VendedorDao();
    }

    public String salvar(Vendedor vendedor) {
        return this.dao.salvar(vendedor);
    }
}
