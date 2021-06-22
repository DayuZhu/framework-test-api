package com.framework.api.commons.web.enums;

/**
 *
 */
public enum AuthMthEnum {
    /**
     * 房券
     */
    FQ_PRODUCT_ADD("fangQuanProductAdd", "房券"),
    FQ_LOGIN("login", "登录");
    /**
     * mth
     */
    private String sh;
    /**
     * 描述
     */
    private String desc;

    AuthMthEnum(String sh, String desc) {
        this.sh = sh;
        this.desc = desc;
    }

    public String getSh() {
        return sh;
    }

    public void setSh(String sh) {
        this.sh = sh;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
