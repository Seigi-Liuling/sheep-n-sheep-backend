package sps.entity;

import lombok.Data;

/**
 * @author 舞晗坤
 * @email whksoft@gmail.com
 * @since 2022/9/15 22:11
 */
@Data
public class PersonalInfo {
    Integer register_time = 833763600;
    String avatar = "https://sheep.nnnk.fun/zoom_pic.jpg";
    String nick_name =  "扰动有效位能";
    Integer challenge = 444;
    Integer uid = 4444;
    Integer daily_count = 444;
    Integer topic_count = 4444;
    Integer today_state = 1;
    Integer today_ts = Math.toIntExact(System.currentTimeMillis() / 1000);
    Integer today_time = 114514;
    Integer today_fail_count = 1919810;
    Integer skin = 14;
}
