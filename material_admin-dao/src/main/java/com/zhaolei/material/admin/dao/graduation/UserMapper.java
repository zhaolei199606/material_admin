package com.zhaolei.material.admin.dao.graduation;

import com.zhaolei.material.admin.dao.base.ISqlMapper;
import com.zhaolei.material.admin.domain.dao.UserDO;

/**
 * @author ZHAOLEI
 */
public interface UserMapper extends ISqlMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_user
     *
     * @mbg.generated Wed Mar 18 11:47:06 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_user
     *
     * @mbg.generated Wed Mar 18 11:47:06 CST 2020
     */
    int insert(UserDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_user
     *
     * @mbg.generated Wed Mar 18 11:47:06 CST 2020
     */
    int insertSelective(UserDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_user
     *
     * @mbg.generated Wed Mar 18 11:47:06 CST 2020
     */
    UserDO selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_user
     *
     * @mbg.generated Wed Mar 18 11:47:06 CST 2020
     */
    int updateByPrimaryKeySelective(UserDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_user
     *
     * @mbg.generated Wed Mar 18 11:47:06 CST 2020
     */
    int updateByPrimaryKey(UserDO record);

    /**
     * 根据学号查询用户信息
     * @param stNum
     * @return
     */
    UserDO selectByStNum(String stNum);
}