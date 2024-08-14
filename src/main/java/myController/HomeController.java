package myController;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


public class HomeController {
    @GetMapping("/showflowerList")
    public String sendDataTOHtml(Model model) {
        String [] flowers = new String[] { "Rose", "Lily", "Tulip", "Carnation", "Hyacinth"};

        String[] City = new String[] { "nyc", "nj", "dallas", "chicago", "philadelphia" };
        model.addAttribute("flowersVariable", flowers);
        model.addAttribute("CityVariable", City);
        return "viewFlowers";
    }
}



