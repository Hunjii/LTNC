/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model;

import java.util.List;

/**
 *
 * @author manh2198
 */
public class ListHost {
    private int length;
    private List<Host> listHost;

    public ListHost( int length, List<Host> listHost) {
        this.length = length;
        this.listHost = listHost;
    }

    public ListHost() {}

    public List<Host> getListHost() {
        return listHost;
    }

    public void setListHost(List<Host> listHost) {
        this.listHost = listHost;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
