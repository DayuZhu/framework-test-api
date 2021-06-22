package com.framework.api.commons.web.util;


import com.framework.api.commons.web.enums.AuthMthEnum;
import org.apache.commons.lang3.StringUtils;

public class AuthUtils {


    public static boolean auth(String sh) {
        return checkProduct(sh);
    }


    private static boolean checkProduct(String sh) {
        AuthMthEnum[] mths = AuthMthEnum.values();
        for (AuthMthEnum pa : mths) {
            String cStr = pa.getSh();
            if (StringUtils.equals(sh, cStr)) {
                return true;
            }
        }
        return false;
    }
}
