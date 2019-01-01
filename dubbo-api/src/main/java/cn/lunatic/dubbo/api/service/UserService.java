package cn.lunatic.dubbo.api.service;

import cn.lunatic.dubbo.api.dto.UserInfo;

/**
 * @author ganluantic
 * @Description
 * @date 2018/8/11 13:55
 */
public interface UserService {

    UserInfo getUserByUserId(String userId);

}
