/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.spelling.impl;

import edu.eci.pdsw.samples.spelling.TypoCorrector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hcadavid
 */
public class OnlineTypoCorrector implements TypoCorrector {

    @Override
    public String fixWord(String w) {
        LOG.log(Level.INFO, "Checking word {0} based on CLOUD DATA", w);
        return w;
    }

    private static final Logger LOG = Logger.getLogger(OnlineTypoCorrector.class.getName());

}
