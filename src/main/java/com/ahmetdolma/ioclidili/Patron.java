package com.ahmetdolma.ioclidili;

public class Patron implements PatronInterface {

    @Override
    public String surum(String data){
        return "sürüm "+data;
    }
}
