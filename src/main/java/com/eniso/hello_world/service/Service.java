/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eniso.hello_world.service;

import com.eniso.hello_world.presentation.HelloWrldCtrl;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author houssem
 */
public class Service {
    public String getAddress() {
        try {
            return InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException ex) {
            Logger.getLogger(HelloWrldCtrl.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
