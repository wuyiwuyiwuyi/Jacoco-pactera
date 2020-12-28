package www.pactera.com.Jacocopactera.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import www.pactera.com.Jacocopactera.common.BaseEntity.ResponseData;
import www.pactera.com.Jacocopactera.common.Dto.*;
import www.pactera.com.Jacocopactera.service.ICoverageCollectService;
import www.pactera.com.Jacocopactera.share.ICoverageCollectShare;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;


@Controller
public class CoverageCollectController implements ICoverageCollectShare {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ICoverageCollectService coverageCollectService;

    @Override
    public ResponseData<CollectCoverageRespDTO> CoverageCollect(@Valid CollectCoverageReqDTO reqDTO) {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String token = request.getHeader("Authorization");
        logger.info("收集项目覆盖率开始：req={}",reqDTO);
        ResponseData<CollectCoverageRespDTO> resp = coverageCollectService.coverageCollect(reqDTO,token);
        logger.info("收集项目覆盖率结束：resp={}",resp);
        return resp;
    }

    @Override
    public ResponseData<MergeCoverageRespDTO> CoverageMerge(@Valid MergeCoverageReqDTO reqDTO) {
        ResponseData<MergeCoverageRespDTO> resp = coverageCollectService.coverageMerge(reqDTO);
        return resp;
    }

    @Override
    public ResponseData<QueryCoverageRespDTO> queryCoverage(@Valid QueryCollectCoverageReqDTO reqDTO) {
        ResponseData<QueryCoverageRespDTO> resp =  coverageCollectService.coverageQuery(reqDTO);
        return resp;
    }


    @Override
    public ResponseData<ProjectCoverageRespDTO> queryProjectCoverage(@Valid ProjectCoverageReqDTO projectCoverageReqDTO) {

        logger.info("查询项目覆盖率开始：req={}",projectCoverageReqDTO);
        ResponseData<ProjectCoverageRespDTO> resp = coverageCollectService.queryProjectCoverage(projectCoverageReqDTO);
        logger.info("查询项目覆盖率结束：resp={}",resp);
        return resp;
    }

    @Override
    public ResponseData<SourceCoverageRespDTO> querySourceCoverage(@Valid SourceCoverageReqDTO sourceCoverageReqDTO) {
        ResponseData<SourceCoverageRespDTO> resp = coverageCollectService.querySourceCoverage(sourceCoverageReqDTO);
        return resp;
    }

    @Override
    public void gainSourceFile(HttpServletResponse response, @Valid SourceCoverageReqDTO reqDTO) {
        coverageCollectService.gainSourceFile(response,reqDTO);
    }
}
