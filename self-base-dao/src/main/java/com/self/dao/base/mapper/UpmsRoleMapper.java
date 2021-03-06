package com.self.dao.base.mapper;

import com.self.base.entity.UpmsRole;
import com.self.base.entity.UpmsRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UpmsRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_role
     *
     * @mbg.generated Tue Apr 03 14:04:18 CST 2018
     */
    long countByExample(UpmsRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_role
     *
     * @mbg.generated Tue Apr 03 14:04:18 CST 2018
     */
    int deleteByExample(UpmsRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_role
     *
     * @mbg.generated Tue Apr 03 14:04:18 CST 2018
     */
    int deleteByPrimaryKey(Integer roleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_role
     *
     * @mbg.generated Tue Apr 03 14:04:18 CST 2018
     */
    int insert(UpmsRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_role
     *
     * @mbg.generated Tue Apr 03 14:04:18 CST 2018
     */
    int insertSelective(UpmsRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_role
     *
     * @mbg.generated Tue Apr 03 14:04:18 CST 2018
     */
    List<UpmsRole> selectByExample(UpmsRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_role
     *
     * @mbg.generated Tue Apr 03 14:04:18 CST 2018
     */
    UpmsRole selectByPrimaryKey(Integer roleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_role
     *
     * @mbg.generated Tue Apr 03 14:04:18 CST 2018
     */
    int updateByExampleSelective(@Param("record") UpmsRole record, @Param("example") UpmsRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_role
     *
     * @mbg.generated Tue Apr 03 14:04:18 CST 2018
     */
    int updateByExample(@Param("record") UpmsRole record, @Param("example") UpmsRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_role
     *
     * @mbg.generated Tue Apr 03 14:04:18 CST 2018
     */
    int updateByPrimaryKeySelective(UpmsRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_role
     *
     * @mbg.generated Tue Apr 03 14:04:18 CST 2018
     */
    int updateByPrimaryKey(UpmsRole record);
}