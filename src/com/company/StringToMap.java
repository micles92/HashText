package com.company;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Michał on 29.11.2015.
 */
public class StringToMap {
    private Map<Integer, String> map = new HashMap<>();


    public void stringToMap(String[] tmp){
        Map<Integer, String> map = new HashMap<>();

        for(int i = 0; i<tmp.length; i++){
            map.put(i,tmp[i]);
        }

        setMap(map);
    }

    public void printmap(Map<Integer, String> map){

        for(Object element: map.entrySet()){
            System.out.println(element.toString());
        }

    }

    public Map<Integer, String> getMap() {
        return map;
    }

    public void setMap(Map<Integer, String> map) {
        this.map = map;
    }
}

//po wywolaniu metody, jest tworzona tymczasowa hasmapa, przypisywane sa wartosci z tablicy do mapy, pozniej wywolywany jest setter i wynik metody zapisywany pod prywatna zmienna map
// wtedy za pomaca gettera mozna pobierac zawartosc tego pola