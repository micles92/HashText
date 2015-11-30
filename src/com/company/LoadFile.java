package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * Created by Michał on 29.11.2015.
 */
public class LoadFile {
    private String textToProcess;
    public final String PATH = "C:\\Users\\Michał\\HashText\\tekst";

    public void loadFile(){
        String text = "";

//        File plik = new File(PATH);
//        try {
//            Scanner scan = new Scanner(plik);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        try {
            text = new Scanner(new File(PATH)).useDelimiter("\\Z").next();  //nowy obiekt file, a  skaner czyta z tego pliku tekst
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        setTextToProcess(text);
    }

    public String getTextToProcess() {
        return textToProcess;
    }

    public void setTextToProcess(String textToProcess) {
        this.textToProcess = textToProcess;
    }
}
