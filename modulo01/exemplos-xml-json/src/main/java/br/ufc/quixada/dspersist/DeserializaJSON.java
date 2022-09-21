package br.ufc.quixada.dspersist;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class DeserializaJSON {
    public static void main(String[] args) throws Exception {
        File file = new File("pessoas.json");
        ObjectMapper objMapper = new ObjectMapper();
        Pessoas p = objMapper.readValue(file, Pessoas.class);
        System.out.println(p);
    }

}
