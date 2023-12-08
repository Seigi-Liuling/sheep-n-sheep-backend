package sps.entity;

import lombok.Data;

/**
 * @author 舞晗坤
 * @email whksoft@gmail.com
 * @since 2022/9/15 21:59
 */
@Data
public class UserInfo {
    String id = "6322824c4f8b51b7399c4f2f";
    String created_at = "1996-06-03T01:39:24.708Z";
    String updated_at = "1996-06-03T01:39:24.708Z";
    Integer role = 2;
    Integer uid = 4444;
    String nick_name = "反向暴走小废";
    String avatar = "https://sheep.nnnk.fun/zoom_pic.jpg";
    String wx_open_id = "ZOOM";
    String wx_union_id = "ZOOM";
    String last_login_time = null;
    String last_logout_time = null;
    Integer change_first_time = 0;
    Integer change_last_time = 0;
    Integer change_total = 0;
    Integer change_times = 0;
}
