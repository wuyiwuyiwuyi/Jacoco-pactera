package www.pactera.com.Jacocopactera.commonTools.RedisUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class RedisUtils {
    // https://blog.csdn.net/qq_40126996/article/details/107752162

    private final static String ACCESS_TOKEN = "TOKEN_GIFT_"; //客户端请求服务器时携带的token参数
    private final static String REFRESH_TOKEN = "REFRESH_GIFT_"; //客户端用户刷新token的参数
    private final static String PHONE_VALID_CODE = "PHONE_VALID_CODE_"; //客户端短信验证码

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    /**
     * 设置缓存
     *
     * @param key
     * @param value
     * @param timeout 单位 毫秒
     */
    public void setValue(String key, String value, long timeout) {
        redisTemplate.opsForValue().set(key, value, timeout, TimeUnit.MILLISECONDS);

    }

    /**
     * 设置access_token的缓存
     *
     * @param userID
     * @param value
     * @param timeout
     */
    public void setToken(Long userID, String value, long timeout) {
        setValue(ACCESS_TOKEN + userID, value, timeout);
    }

    /**
     * 获取缓存数据
     *
     * @param key
     * @return
     */
    public String getValue(String key) {
        return redisTemplate.opsForValue().get(key);
    }

    /**
     * 获取用户的access缓存的token信息
     *
     * @param userId
     * @return
     */
    public String getAccessToken(Long userId) {
        return redisTemplate.opsForValue().get(ACCESS_TOKEN + userId);
    }

    /**
     * 删除缓存数据
     *
     * @param key
     */
    public void deleteValue(String key) {
        redisTemplate.delete(key);
    }

}
