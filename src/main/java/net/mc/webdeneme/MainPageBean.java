/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.mc.webdeneme;

import net.mc.deneme.Deneme;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author mehmet
 */
@Named
@SessionScoped
public class MainPageBean implements Serializable{
    @Inject
    private Deneme deneme;
    private String name;
    private int counter;

    /**
     * Creates a new instance of MainManagedBean
     */
    public MainPageBean() {
    }
    
    @PostConstruct
    public void initBean(){
        this.name = "";
        this.counter = 0;
        System.out.println(deneme.getMsg());
    }
    
    public void incrementCounter(){
        this.counter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCounter() {
        return counter;
    }
    
}
