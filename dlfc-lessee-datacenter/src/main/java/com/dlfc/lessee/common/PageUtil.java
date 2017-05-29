package com.dlfc.lessee.common;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

/**
 * Created by K on 2017/5/29.
 */

@Component
public class PageUtil {

    public static String generatePage(String orderBy,
                                      Integer pageSize,
                                      Integer pageNo) {
        StringBuffer buffer = new StringBuffer();
        buffer.append(orderBy);
        if (null != pageSize && pageSize > 0) {
            buffer.append(StringUtils.SPACE + "LIMIT");
            if (null != pageNo && pageNo > 0) {
                buffer.append(StringUtils.SPACE + (pageNo - 1) * pageSize + ",");
            }
            buffer.append(StringUtils.SPACE + pageSize);
        }
        if (buffer.length() > 0) {
            return buffer.toString();
        }
        return null;
    }
}
