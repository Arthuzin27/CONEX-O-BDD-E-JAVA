package br.com.unisales;

import br.com.unisales.dao.AssentoDao;
import br.com.unisales.dao.OnibusDao;

public class Main {
    public static void main(String[] args) {
        OnibusDao onibusDao = new OnibusDao();
        AssentoDao assentoDao = new AssentoDao();
        System.out.println("Hello world!");
    }
}