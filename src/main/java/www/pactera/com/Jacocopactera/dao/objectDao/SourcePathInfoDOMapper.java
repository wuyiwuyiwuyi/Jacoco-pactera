package www.pactera.com.Jacocopactera.dao.objectDao;

import org.apache.ibatis.annotations.Param;
import www.pactera.com.Jacocopactera.dao.objectDo.SourcePathInfoDO;

import java.util.List;

public interface SourcePathInfoDOMapper {

    void insert(@Param("sourcePathInfoDO") SourcePathInfoDO sourcePathInfoDO);

    List<SourcePathInfoDO> selectProjectFile(@Param("projectName")String projectName, @Param("versionNumber")String versionNumber, @Param("operator")String operator);

}
