package com.myapplicationdev.android.tw_listview;

/**
 * Created by 15004557 on 27/4/2017.
 */

public class Modules {
    private String name;
    private boolean prog;

    public Modules(String name, boolean prog){
        this.name = name;
        this.prog = prog;
    }

    public String getName(){
        return name;
    }
    public boolean isProg(){
        return prog;
    }
}

