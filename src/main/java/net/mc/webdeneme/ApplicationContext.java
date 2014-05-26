/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mc.webdeneme;

import net.mc.deneme.Deneme;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;

/**
 *
 * @author mehmet
 */
@ApplicationScoped
public class ApplicationContext {

    private Deneme deneme;

    @PostConstruct
    public void initBean() {
        System.out.println("Deneme is initialized");
        this.deneme = new Deneme();
    }

    @Produces
    @Dependent
    public Deneme getDeneme() {
        System.out.println("Deneme is brought");
        return this.deneme;
    }
}
