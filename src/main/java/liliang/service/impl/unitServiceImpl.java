package liliang.service.impl;

import liliang.common.ResponseCode;
import liliang.common.ServerResponse;
import liliang.dao.UnitMapper;
import liliang.pojo.Unit;
import liliang.service.unitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class unitServiceImpl implements unitService {

    @Autowired
    UnitMapper unitMapper;

    @Override
    public ServerResponse addunit(Unit unit) {

        int result = unitMapper.insert(unit);
        if (result <= 0) {
            return ServerResponse.serverResponseByError(ResponseCode.ERROR, "添加信息失败");
        }

        return ServerResponse.serverResponseBySuccess(ResponseCode.SUCESS, "添加成功");
    }

    @Override
    public ServerResponse upunit(Unit unit) {
        int result= unitMapper.updateByPrimaryKey(unit);
        if ( result<= 0) {
            return ServerResponse.serverResponseByError(ResponseCode.ERROR, "修改信息失败");
        }

        return ServerResponse.serverResponseBySuccess(ResponseCode.SUCESS, "修改成功");
    }

    @Override
    public ServerResponse delunit(Integer id) {
        if (unitMapper.deleteByPrimaryKey(id)) {
            return ServerResponse.serverResponseBySuccess(ResponseCode.SUCESS, "删除成功");
        }

        return ServerResponse.serverResponseByError(ResponseCode.ERROR, "删除失败");
    }

    @Override
    public ServerResponse findunit(Unit unit) {
        List<Unit> unitList = unitMapper.selectAll();
        if (unitList==null){
            return ServerResponse.serverResponseByError(ResponseCode.ERROR,"");
        }

        return ServerResponse.serverResponseBySuccess(unitList,"查询成功");
    }
}
