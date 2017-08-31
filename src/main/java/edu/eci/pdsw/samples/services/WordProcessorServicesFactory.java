/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.services;

import com.google.inject.AbstractModule;
import edu.eci.pdsw.samples.services.impl.WordProcessorServicesImpl;

import static com.google.inject.Guice.createInjector;
import com.google.inject.Injector;
import edu.eci.pdsw.samples.persistence.PersistenceHandler;
import edu.eci.pdsw.samples.persistence.impl.PlainPersistenceHandler;
import edu.eci.pdsw.samples.persistence.impl.SerializationPersistenceHandler;
import edu.eci.pdsw.samples.spelling.TypoCorrector;
import edu.eci.pdsw.samples.spelling.impl.LocalTypoCorrector;
import edu.eci.pdsw.samples.spelling.impl.OnlineTypoCorrector;

/**
 *
 * @author hcadavid
 */
public class WordProcessorServicesFactory {

    private static WordProcessorServicesFactory instance = new WordProcessorServicesFactory();
    
    private static Injector injector;    
    
    private WordProcessorServicesFactory(){
        
        injector = createInjector(new AbstractModule() {

                    
                    protected void configure() {
                        bind(TypoCorrector.class).to(LocalTypoCorrector.class);
                        bind(PersistenceHandler.class).to(PlainPersistenceHandler.class);
                        bind(WordProcessorServices.class).to(WordProcessorServicesImpl.class);
                    }

                }
                
        );

        
    }

    public WordProcessorServices getServiciosAlquiler(){
        return injector.getInstance(WordProcessorServices.class);   
    }


    public static WordProcessorServicesFactory getInstance(){
        return instance;
    }
    
}
