package br.com.unisales;

import br.com.unisales.service.OnibusService;
import br.com.unisales.table.Onibus;

public class Main {
    public static void main(String[] args) {
        OnibusService service = new OnibusService();
        /*AssentoService aservice = new AssentoService();
        PassageiroService bservice = new PassageiroService();
        PassagemService cservice = new PassagemService();
        VendedorService dservice = new VendedorService();
        ViagemService eservice = new ViagemService();*/

        
        Onibus onibus = new Onibus(null, "HGR4569", 4);
        System.out.println("Inserir novo ônibus: " + service.salvar(onibus));

        /*Assento assento = new Assento(null, 1, onibus);
        System.out.println("Inserir novo assento: " + aservice.salvar(assento));
        
        Passageiro passageiro = new Passageiro (null, "Felipe","masculino", 18611599780L, "arthurlopesclemente", 27999341026L);
        System.out.println("Inserir novo passageiro: " + bservice.salvar(passageiro));

        Passagem passagem = new Passagem(1, 60, 1, 1, 1,1);
        System.out.println("Inserir nova passagem: " + cservice.salvar(passagem));

        Vendedor vendedor = new Vendedor(null, "Arthur Lopes", 18611599780L);
        System.out.println("Inserir novo vendedor: " + dservice.salvar(vendedor));

        Viagem viagem = new Viagem(1, "Colatina", 19042006L, 15L, "Vitoria", 19042006, 19);
        System.out.println("Inserir novo vendedor: " + eservice.salvar(viagem));*/
    }
    }
