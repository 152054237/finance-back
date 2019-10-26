package liliang.controller;

import liliang.common.ServerResponse;
import liliang.pojo.Unit;
import liliang.service.unitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/unit")
public class unitController {

    @Autowired
    unitService unitservice;

    @RequestMapping("/addunit.do")
    public ServerResponse addunit(Unit unit , HttpSession session) {

        return unitservice.addunit(unit);
    }

    @RequestMapping("/upunit.do")
    public ServerResponse upunit(Unit unit,HttpSession session) {

        return unitservice.upunit(unit);
    }

    @RequestMapping("/delunit.do")
    public ServerResponse delunit(Integer id, HttpSession session) {

        return unitservice.delunit(id);
    }

    @RequestMapping("/findunit.do")
    public ServerResponse findunit(Unit unit, HttpSession session) {

        return unitservice.findunit(unit);
    }
}
