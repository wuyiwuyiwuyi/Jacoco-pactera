package www.pactera.com.Jacocopactera.dao.objectDao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import www.pactera.com.Jacocopactera.dao.objectDo.CoverageDO;

public interface CoverageDOMapper {

    List<CoverageDO> selectByCondition(@Param("coverageDO") CoverageDO record);

    int deleteByPrimaryKey(Integer id);

    int insert(CoverageDO record);

    List<CoverageDO> selectAll();

    void updateByCondition(@Param("coverageDO2") CoverageDO record);


}