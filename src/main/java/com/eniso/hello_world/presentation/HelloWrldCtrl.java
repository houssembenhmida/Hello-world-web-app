/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eniso.hello_world.presentation;

import com.eniso.hello_world.service.Service;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Houssem
 */
@ManagedBean
public class HelloWrldCtrl {

    private final Model model = new Model();
    private final Service service = new Service();

    public Model getModel() {
        return model;
    }

    @PostConstruct
    public void getAddress() {

        model.setAdresse(service.getAddress());

    }
//    public void getAddress() {
//        try {
//            model.setAdresse(InetAddress.getLocalHost().getHostAddress());
//        } catch (UnknownHostException ex) {
//            Logger.getLogger(HelloWrldCtrl.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }

    public class Model {

        private String adresse;

        public String getAdresse() {
            return adresse;
        }

        public void setAdresse(String adresse) {
            this.adresse = adresse;
        }

    }
}
