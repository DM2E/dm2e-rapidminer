package eu.dm2e.rapidminer.services;

import eu.dm2e.ws.api.WebservicePojo;
import eu.dm2e.ws.services.AbstractTransformationService;

import javax.ws.rs.Path;

/**
 * This file was created within the DM2E project.
 * http://dm2e.eu
 * http://github.com/dm2e
 * <p/>
 * Author: Kai Eckert, Konstantin Baierer
 */

@Path("/rapidminer")
public class RapidminerService extends AbstractTransformationService {

    public RapidminerService() {
        WebservicePojo ws = getWebServicePojo();
        ws.addInputParameter("process").setIsRequired(true);
        ws.addInputParameter("input").setIsRequired(true);
        ws.addOutputParameter("result");
    }

    @Override
    public void run() {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
