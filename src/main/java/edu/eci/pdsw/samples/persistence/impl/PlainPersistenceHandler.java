/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence.impl;

import edu.eci.pdsw.samples.persistence.PersistenceHandler;
import java.util.logging.Logger;

/**
 *
 * @author hcadavid
 */
public class PlainPersistenceHandler implements PersistenceHandler{

    UTF8EncodingValidator encodingValidator=new UTF8EncodingValidator();
    
    @Override
    public void save(String content, String fileName) {
        
        if (encodingValidator.validateRequiredEncoding(content)){
            LOG.info("Saving "+fileName+" in PLAIN TEXT");
        }
        else{
            LOG.info("Unable to Save "+fileName+" in PLAIN TEXT. Check your document encoding!");
        }        
        
    }
    private static final Logger LOG = Logger.getLogger(PlainPersistenceHandler.class.getName());

    @Override
    public String load(String fileName) {
        LOG.info("LOADING "+fileName+" in PLAIN TEXT");
        return "";
    }
    
}
