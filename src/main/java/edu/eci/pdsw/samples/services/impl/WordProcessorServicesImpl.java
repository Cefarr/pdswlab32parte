package edu.eci.pdsw.samples.services.impl;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import edu.eci.pdsw.samples.persistence.PersistenceHandler;
import edu.eci.pdsw.samples.services.ExcepcionServiciosAlquiler;
import java.sql.Date;
import java.util.List;
import edu.eci.pdsw.samples.services.WordProcessorServices;
import edu.eci.pdsw.samples.spelling.TypoCorrector;
import java.util.logging.Logger;

/**
 * 
 * @author hcadavid
 */
@Singleton
public class WordProcessorServicesImpl implements WordProcessorServices {

    @Inject
    private TypoCorrector typocorr;
    
    @Inject
    private PersistenceHandler persHandler;
        
    @Override
    public void useWordProcessor() {
        LOG.info("Fixing word....");
        typocorr.fixWord("aaaaa");
        
        LOG.info("Saving data");
        persHandler.save("xxxx",  "file.dat");

        LOG.info("Loading data");
        persHandler.load("file.dat");
        
    }

    private static final Logger LOG = Logger.getLogger(WordProcessorServicesImpl.class.getName());

    
    
    
    
    
}
