package liliang.dao;

import liliang.pojo.Unit;

import java.util.List;

public interface UnitMapper {

    boolean deleteByPrimaryKey(Integer id);


    int insert(Unit record);


    int selectByPrimaryKey(Integer id);


    List<Unit> selectAll();


    int updateByPrimaryKey(Unit record);

}
