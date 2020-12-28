package www.pactera.com.Jacocopactera.dao.objectDao;

import org.apache.ibatis.annotations.Param;
import www.pactera.com.Jacocopactera.dao.objectDo.CoverageDO;
import www.pactera.com.Jacocopactera.dao.objectDo.LoginDO;

public interface LoginDOMapper {

    int insert(@Param("LoginDO") LoginDO loginDO);

    LoginDO selectByUsername(@Param("username")String um);

}
