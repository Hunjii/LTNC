/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.dao;

import com.example.demo.model.Host;

import java.util.List;
import java.util.Optional;
/**
 *
 * @author manh2198
 */
public interface HostDao {
    void insertHost(Host host);
    List<Host> selectAllHost();
    Optional<Host> getHost(String id);
    void deleteHost(String id);
    void updateHost(Host host);
}
