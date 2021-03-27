package dubbo.service;

import dubbo.model.User;

public interface UserService {
    /**
     * 根据用户id获取用户信息
     * @param id
     * @return
     */
    User queryUserById(Integer id);

}
