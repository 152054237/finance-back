package liliang.dao;

import java.util.List;
import liliang.pojo.Hotel;
import org.apache.ibatis.annotations.Mapper;

public interface HotelMapper {

    boolean deleteByPrimaryKey(Integer userid);


    int insert(Hotel record);


    int selectByPrimaryKey(Integer userid);


    List<Hotel> selectAll();


    int updateByPrimaryKey(Hotel record);
}