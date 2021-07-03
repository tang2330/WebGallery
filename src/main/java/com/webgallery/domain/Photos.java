package com.webgallery.domain;

import java.util.Date;
import lombok.Data;

/**
 * 图集
 * @author 依旧
 */
@Data
public class Photos {
    /**
     * 唯一主键
     */
    private Integer id;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 图集类型 0 chemo 1明星 2清纯 3旗袍 4校花 5性感
     */
    private String photosType;

    /**
     * 图集名称
     */
    private String photosName;

    /**
     * 图集大小
     */
    private Integer photosSize;

    /**
     * 图集封面
     */
    private String photosCover;

    /**
     * 图集url
     */
    private String photosUrl;
}