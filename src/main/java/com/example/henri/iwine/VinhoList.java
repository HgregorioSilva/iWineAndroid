package com.example.henri.iwine;

//import java.sql.Connection;
import java.util.LinkedList;
import java.util.List;


public class VinhoList {

    List<Vinho> vinhos = new LinkedList<Vinho>();
    Connection connection = new Connection();

    public void getVinhos(){
        try {
            vinhos = connection.sendGet();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<String> returnAllMarcas(){
        List<String> marcas = new LinkedList<String>();
        for(Vinho vinho:vinhos){
            marcas.add(vinho.getMarca());
        }
        return marcas;
    }

    public List<String> returnVinhoByMarca(String marca){
        List<String> found = new LinkedList<String>();
        for(Vinho vinho: vinhos){
            if(vinho.getMarca().equals(marca)) found.add(vinho.getAno());
        }
        return found;
    }

    public String returnTipo(String marca, String ano){
        for(Vinho vinho: vinhos){
            if(vinho.getMarca().equals(marca) && vinho.getAno().equals(ano)) return vinho.getMarca();
        }
        return "Não encontrado !";
    }

}
