package com.company;

/**
 * Created by Michał on 29.11.2015.
 */
public class Counter {
    private String[] result;

    public void splitText(String text){
        text=text.replaceAll("\\n", "");
        String[] tmp = text.split("\\s",0); // "\\s" - rozdzielaczem wyrazow jest spacja.(Regex)


        setResult(tmp);

    }

    public String[] getResult() {
        return result;
    }

    public void setResult(String[] result) {
        this.result = result;
    }
}
