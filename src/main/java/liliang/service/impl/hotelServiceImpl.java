package liliang.service.impl;

import liliang.common.ResponseCode;
import liliang.common.ServerResponse;
import liliang.dao.HotelMapper;
import liliang.pojo.Hotel;
import liliang.service.hotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class hotelServiceImpl implements hotelService {

    @Autowired
    HotelMapper hotelMapper;

    @Override
    public ServerResponse addhotel(Hotel hotel) {

        if (hotel == null) {
            return ServerResponse.serverResponseByError(ResponseCode.ERROR, "参数不能为空");
        }

        int result = hotelMapper.insert(hotel);
        if (result <= 0) {
            return ServerResponse.serverResponseByError(ResponseCode.ERROR, "添加信息失败");
        }

        return ServerResponse.serverResponseBySuccess(ResponseCode.SUCESS, "添加成功");
    }

    @Override
    public ServerResponse uphotel(Hotel hotel) {
        int result= hotelMapper.updateByPrimaryKey(hotel);
        if ( result<= 0) {
            return ServerResponse.serverResponseByError(ResponseCode.ERROR, "修改信息失败");
        }

        return ServerResponse.serverResponseBySuccess(ResponseCode.SUCESS, "修改成功");
    }



    @Override
    public ServerResponse delhotel(Integer userid) {

        if (hotelMapper.deleteByPrimaryKey(userid)) {
            return ServerResponse.serverResponseBySuccess(ResponseCode.SUCESS, "删除成功");
        }

        return ServerResponse.serverResponseByError(ResponseCode.ERROR, "删除失败");
    }

    @Override
    public ServerResponse findhotel(Hotel hotel) {

        List<Hotel> hotelList = hotelMapper.selectAll();
        if (hotelList==null){
            return ServerResponse.serverResponseByError(ResponseCode.ERROR,"");
        }

        return ServerResponse.serverResponseBySuccess(hotelList,"查询成功");
    }
}
