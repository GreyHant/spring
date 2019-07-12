package hello;

import model.Developer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletContext;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    private ServletContext servletContext;

    @Autowired
    private DeveloperDAO developerDAO;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showDevelopers(Model model){
        List<Developer> developers = developerDAO.getAllDevelopers();

        model.addAttribute("developers", developers);

        return "developers";
    }
}
