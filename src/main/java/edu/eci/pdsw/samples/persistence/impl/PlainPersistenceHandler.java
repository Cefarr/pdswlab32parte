/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence.impl;

import com.google.inject.AbstractModule;
import edu.eci.pdsw.samples.persistence.PersistenceHandler;
import java.util.logging.Logger;
import static com.google.inject.Guice.createInjector;
import com.google.inject.Inject;
import com.google.inject.Injector;
import edu.eci.pdsw.samples.services.WordProcessorServices;
import edu.eci.pdsw.samples.services.impl.WordProcessorServicesImpl;
import edu.eci.pdsw.samples.spelling.TypoCorrector;
import edu.eci.pdsw.samples.spelling.impl.LocalTypoCorrector;
import static com.google.inject.Guice.createInjector;
/**
 *
 * @author hcadavid
 */
public class PlainPersistenceHandler implements PersistenceHandler{
    
    @Inject
    PersEncod val;
   
    //UTF8EncodingValidator encodingValidator=new UTF8EncodingValidator();
    
    @Override
    public void save(String content, String fileName) {
       val.validateRequired(content);
       
        
        
              
    }
 
    
    private static final Logger LOG = Logger.getLogger(PlainPersistenceHandler.class.getName());

    @Override
    public String load(String fileName) {
        LOG.info("LOADING "+fileName+" in PLAIN TEXT");
        return "";
    }
    
}
