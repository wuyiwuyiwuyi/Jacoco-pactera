package www.pactera.com.Jacocopactera.dao.objectDao;

import org.apache.ibatis.annotations.Param;
import www.pactera.com.Jacocopactera.dao.objectDo.PortRelevanceDO;

public interface PortRelevanceDOMapper {

    PortRelevanceDO selectPort(@Param("projectName")String projectName);

}
