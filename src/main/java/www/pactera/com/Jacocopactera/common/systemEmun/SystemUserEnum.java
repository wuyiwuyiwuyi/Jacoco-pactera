package www.pactera.com.Jacocopactera.common.systemEmun;

import org.springframework.util.StringUtils;

public enum SystemUserEnum {

    WU_YI("34678987", "吴异"),
    LING_XIAN_CHANG("7323567", "林显常"),
    GUO_LE("2346765487", "郭乐"),
    LIN_KAI_JIE("237654345", "林开杰"),
    WU_WEN_QAN("07658909", "吴文权");


    private String uid;

    private String username;

    public static String gainUsername(String uid) {
        if (StringUtils.isEmpty(uid)) {
            return "无效用户";
        }
        for (SystemUserEnum systemUserEnum : SystemUserEnum.values()) {
            if (systemUserEnum.getUid().equals(uid)) {
                return systemUserEnum.getUsername();
            }
        }
        return "无效用户";

    }

    SystemUserEnum(String uid, String username) {
        this.uid = uid;
        this.username = username;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
