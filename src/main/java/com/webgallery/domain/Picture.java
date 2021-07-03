package com.webgallery.domain;

import java.util.Date;
import lombok.Data;

/**
    * 图片表
 * @author notebook
 */
@Data
public class Picture {
    /**
    * 唯一主键
    */
    private Integer id;

    private Integer photosId;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 图片名称
    */
    private String pictureName;

    /**
    * 图片url
    */
    private String pictureUrl;

    /**
    * 图片数据
    */
    private String pictureData;
}