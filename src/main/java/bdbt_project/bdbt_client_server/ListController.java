package bdbt_project.bdbt_client_server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ListController {

    @Autowired
    private MagazynDAO magazyndao;

    @RequestMapping("/magazyn")
    public String viewMagazynyPage(Model model){
        List<Magazyn> MagazynList = magazyndao.list();
        model.addAttribute("MagazynList", MagazynList);

        return "admin/magazyn";
    }
}
