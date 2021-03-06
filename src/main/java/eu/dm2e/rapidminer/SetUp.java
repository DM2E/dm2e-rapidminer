package eu.dm2e.rapidminer;

import eu.dm2e.rapidminer.wsmanager.ManageService;
import eu.dm2e.ws.Config;

import java.io.IOException;

public class SetUp {




	public static void main(String[] args)
			throws IOException {
        System.out.println("SET UP: Starting all servers...");
        Config.config.setProperty("dm2e.ws.sparql_endpoint", "http://localhost:9997/test/sparql");
        Config.config.setProperty("dm2e.ws.sparql_endpoint_statements",  "http://localhost:9997/test/update");
        ManageService.startAll();
        eu.dm2e.ws.wsmanager.ManageService.startAll();

	}
}
