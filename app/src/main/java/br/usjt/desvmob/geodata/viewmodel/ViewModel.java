package br.usjt.desvmob.geodata.viewmodel;

import java.util.ArrayList;

import br.usjt.desvmob.geodata.model.Pais;
/**
 * Kevin Araujo Mestrinel
 * 816118639
 */

public interface ViewModel {
    ArrayList<String> listarNomes(Pais[] paises);
    Pais[] listarPaises(String continente);
    ArrayList<Pais> todosPaises() ;
}
