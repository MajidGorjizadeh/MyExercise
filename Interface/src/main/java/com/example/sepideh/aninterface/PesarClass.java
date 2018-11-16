package com.example.sepideh.aninterface;

public class PesarClass implements Pedar {


    @Override
    public int jam(int a, int b) {
        int c = a+b;
        return c;
    }

    @Override
    public int kam(int a, int b) {
        int c= a-b;
        return c;
    }

    @Override
    public int zarb(int a, int b) {
        int c=a*b;
        return c;
    }

    @Override
    public int taghsim(int a, int b) {
        int c=a/b;
        return c;
    }
}
