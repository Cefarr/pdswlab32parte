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
public class SerializationPersistenceHandler implements PersistenceHandler{

    @Override
    public void save(String content, String fileName) {
        LOG.info("Saving "+fileName+" in JAVA BINARY");
    }
    private static final Logger LOG = Logger.getLogger(PlainPersistenceHandler.class.getName());

    @Override
    public String load(String fileName) {
        LOG.info("LOADING "+fileName+" in JAVA BINARY");
        return "";
    }
    
}
