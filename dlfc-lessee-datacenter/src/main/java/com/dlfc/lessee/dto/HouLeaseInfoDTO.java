package com.dlfc.lessee.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by K on 2017/5/31.
 */

@Component
@Getter
@Setter
public class HouLeaseInfoDTO {

    /**
     * 价格排序==>1：从小到大，2：从大到小
     */
    private String orderByRent;

    /**
     * 单页显示条数
     */
    private Integer pageSize;

    /**
     * 页码
     */
    private Integer pageNo;

    /**
     * 区域ID集合
     */
    private List<String> tradeIdList;

    /**
     * 价格最小值
     */
    private BigDecimal minRent;

    /**
     * 价格最大值
     */
    private BigDecimal maxRent;

    /**
     * 来源==>1：经纪人，0：个人
     */
    private String source;

    /**
     * 出租方式
     */
    private Integer rentMode;

    /**
     * 房屋朝向
     */
    private String orientation;
}
