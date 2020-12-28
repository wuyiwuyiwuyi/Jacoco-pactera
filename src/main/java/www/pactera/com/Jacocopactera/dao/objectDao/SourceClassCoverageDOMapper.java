package www.pactera.com.Jacocopactera.dao.objectDao;

import org.apache.ibatis.annotations.Param;
import www.pactera.com.Jacocopactera.dao.objectDo.CoverageInfoDO;
import www.pactera.com.Jacocopactera.dao.objectDo.SourceClassCoverageDO;

public interface SourceClassCoverageDOMapper {

    void insert(SourceClassCoverageDO sourceClassCoverageDO);

    SourceClassCoverageDO selectSourceClassCoverage(@Param("projectName")String projectName,
                                                    @Param("versionNumber")String versionNumber,
                                                    @Param("operator")String operator,
                                                    @Param("packageName")String packageName,
                                                    @Param("sourceName")String sourceName);

    void update(@Param("sourceClassCoverageDO")SourceClassCoverageDO sourceClassCoverageDO);

}
