/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.mc.webdeneme;

import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author mehmet
 */
@Named
@RequestScoped
public class MainManagedBean {
    
    private String name;

    /**
     * Creates a new instance of MainManagedBean
     */
    public MainManagedBean() {
    }
    
    @PostConstruct
    public void initBean(){
        this.name = "Mehmet";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
