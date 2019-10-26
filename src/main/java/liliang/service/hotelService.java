package liliang.service;

import liliang.common.ServerResponse;
import liliang.pojo.Hotel;
import org.apache.ibatis.annotations.Param;

public interface hotelService {

    public ServerResponse addhotel(Hotel hotel);

    public ServerResponse uphotel(Hotel hotel);

    public ServerResponse delhotel(Integer userid);

    public ServerResponse findhotel(Hotel hotel);
}
