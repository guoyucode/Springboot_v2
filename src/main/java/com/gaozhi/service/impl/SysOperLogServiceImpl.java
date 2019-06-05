package com.gaozhi.service.impl;

import com.gaozhi.entity.SysOperLog;
import com.gaozhi.mapper.SysOperLogMapper;
import com.gaozhi.service.ISysOperLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 日志记录表 服务实现类
 * </p>
 *
 * @author guoyu
 * @since 2019-06-05
 */
@Service
public class SysOperLogServiceImpl extends ServiceImpl<SysOperLogMapper, SysOperLog> implements ISysOperLogService {

}
