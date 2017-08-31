/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.services.client;

import edu.eci.pdsw.samples.services.ExcepcionServiciosAlquiler;
import edu.eci.pdsw.samples.services.WordProcessorServicesFactory;
import edu.eci.pdsw.samples.services.WordProcessorServices;

/**
 *
 * @author hcadavid
 */
public class Main {

    public static void main(String a[]) throws ExcepcionServiciosAlquiler{
        WordProcessorServices wps=WordProcessorServicesFactory.getInstance().getServiciosAlquiler();
        wps.useWordProcessor();        
    }
    
}
