package www.pactera.com.Jacocopactera.service;

import www.pactera.com.Jacocopactera.common.BaseEntity.ResponseData;
import www.pactera.com.Jacocopactera.common.Dto.UserLoginReqDTO;
import www.pactera.com.Jacocopactera.common.Dto.UserLoginRespDTO;
import www.pactera.com.Jacocopactera.common.Dto.UserRegisterReqDTO;
import www.pactera.com.Jacocopactera.common.Dto.UserRegisterRespDTO;



public interface UserLoginService {

    ResponseData<UserLoginRespDTO> login(UserLoginReqDTO reqDTO);

    ResponseData<UserRegisterRespDTO> register(UserRegisterReqDTO req);
}
