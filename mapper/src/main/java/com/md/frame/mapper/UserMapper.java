package com.md.frame.mapper;

import com.md.frame.entity.MUser;
import org.apache.ibatis.annotations.Select;

/**
 * @类名: ${CLASS_NAME}
 * @包名: com.md.frame.mapper
 * @描述: ${TODO}(用一句话描述该文件做什么)
 * @日期: 2017/12/25 16:16
 * @版本: V1.0
 * @创建人：马东
 * @修改人：马东
 */
public interface UserMapper {
    @Select("SELECT * FROM m_user")
    MUser findUser();
}
