package com.st.admin.service;

import com.st.admin.domain.SysRole;
import com.baomidou.mybatisplus.extension.service.IService;
    
/**
 * @author leon
 * @date 2024/2/24 01:06   
 */
public interface SysRoleService extends IService<SysRole>{

    /**
     * 判断一个用户是否是超级管理员
     */
    boolean isSuperAdmin(Long userId);
}
