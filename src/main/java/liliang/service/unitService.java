package liliang.service;

import liliang.common.ServerResponse;
import liliang.pojo.Unit;

public interface unitService {

    public ServerResponse addunit(Unit unit);

    public ServerResponse upunit(Unit unit);

    public ServerResponse delunit(Integer id);

    public ServerResponse findunit(Unit unit);
}
