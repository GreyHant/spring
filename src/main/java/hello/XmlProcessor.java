package hello;

import model.Developer;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;


public class XmlProcessor implements Processor {

    private DeveloperDAO developerDAO;

    public void process(Exchange exchange) {
        Developer developer = exchange.getIn().getBody(Developer.class);
        System.out.println(developerDAO);
        System.out.println(developer);
        developerDAO.insertDeveloper(developer);
        System.out.println("Import success");

    }

    public void setDeveloperDAO(DeveloperDAO developerDAO) {
        this.developerDAO = developerDAO;
    }
}
