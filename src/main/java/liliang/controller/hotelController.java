package liliang.controller;

import liliang.common.ServerResponse;
import liliang.pojo.Hotel;
import liliang.service.hotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/hotel")
public class hotelController {

    @Autowired
    hotelService hotelservice;

    @RequestMapping("/addhotel.do")
    public ServerResponse addhotel(Hotel hotel, HttpSession session) {

        return hotelservice.addhotel(hotel);
    }

    @RequestMapping("/uphotel.do")
    public ServerResponse uphotel(Hotel hotel,HttpSession session) {

        return hotelservice.uphotel(hotel);
    }

    @RequestMapping("/delhotel.do")
    public ServerResponse delhotel(Integer userid, HttpSession session) {

        return hotelservice.delhotel(userid);
    }

    @RequestMapping("/findhotel.do")
    public ServerResponse findhotel(Hotel hotel, HttpSession session) {

        return hotelservice.findhotel(hotel);
    }
}
