package com.webgallery.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.webgallery.domain.Photos;
import com.webgallery.mapper.PhotosMapper;
import com.webgallery.service.PhotosService;
import org.springframework.stereotype.Service;

/**
 * 描述：
 * 所属项目：WebGallery
 *
 * @author 依旧
 * @create 2021-07-04 01:50
 * @employ IntelliJ IDEA
 * @since 1.0.0
 */
@Service
public class PhotosServiceImpl extends ServiceImpl<PhotosMapper, Photos> implements PhotosService {

}