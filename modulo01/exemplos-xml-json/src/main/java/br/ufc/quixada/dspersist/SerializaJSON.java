package br.ufc.quixada.dspersist;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class SerializaJSON {
    public static void main(String[] args) throws Exception {
        Pessoa p1 = new Pessoa(1, "João");
        Pessoa p2 = new Pessoa(2, "Maria");
        List<Pessoa> lista = new ArrayList<Pessoa>();
        lista.add(p1);
        lista.add(p2);
        Pessoas p = new Pessoas(lista);
        File f = new File("pessoas.json");

        ObjectMapper om = new ObjectMapper();
        om.enable(SerializationFeature.INDENT_OUTPUT);
        om.writeValue(f, p);
    }
}
