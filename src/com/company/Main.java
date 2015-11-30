package com.company;

public class Main {

    public static void main(String[] args) {
	 LoadFile obj = new LoadFile();

        obj.loadFile();                                       //wczytywanie pliku
        System.out.println(obj.getTextToProcess());   //wydrukowanie tego pliku w konsoli

        Counter obj2 = new Counter();
        obj2.splitText(obj.getTextToProcess());    //rozdzielenie tekstu na pszczegolne wyrazy i zachowanie w tablicy

        StringToMap obj3 = new StringToMap();       //zamiana String na mapy

        obj3.stringToMap(obj2.getResult());          //na tym obiekcie jest wykonywana metoda.

        obj3.printmap(obj3.getMap());              //wypisywany wynik dzialania ostatniej metody.
    }
}
