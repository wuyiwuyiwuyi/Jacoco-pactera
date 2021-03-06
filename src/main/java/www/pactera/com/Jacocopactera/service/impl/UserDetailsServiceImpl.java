package www.pactera.com.Jacocopactera.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import www.pactera.com.Jacocopactera.AccessControl.UserCommon.SecurityUser;
import www.pactera.com.Jacocopactera.common.Dto.UserDTO;
import www.pactera.com.Jacocopactera.dao.objectDao.LoginDOMapper;
import www.pactera.com.Jacocopactera.dao.objectDo.LoginDO;

@Service("userDetailsServiceImpl")
public class UserDetailsServiceImpl implements UserDetailsService {


    @Autowired
    private LoginDOMapper loginDOMapper;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        LoginDO loginDO = loginDOMapper.selectByUsername(s);

        UserDTO userDTO = new UserDTO();
        userDTO.setId(loginDO.getId());
        userDTO.setUsername(loginDO.getUsername());
        userDTO.setPassword(loginDO.getPassword());
        userDTO.setRole("ROLE_USER");
        return new SecurityUser(userDTO);
    }
}
