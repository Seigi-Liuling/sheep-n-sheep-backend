package sps.entity;

import lombok.Data;

/**
 * @author 舞晗坤
 * @email whksoft@gmail.com
 * @since 2022/9/15 15:42
 */
@Data
public class User {
    Integer state = 2;
    Integer first = 0;
    Integer uid = 4444;
    String nickname = "反向暴走小废";
    Integer time = 114514;
    String avatar = "https://i0.hdslb.com/bfs/face/f621d4ee8b620a95fe0fe57d70be098bd2c024ee.jpg";
    Integer skin = 1;
    String city = "肇庆市";
    String region = "广东省";
    Integer role = 2;
    Integer ts = Math.toIntExact(System.currentTimeMillis()/1000);
    Integer fail = 114514;
    Integer gender = 0;
}
