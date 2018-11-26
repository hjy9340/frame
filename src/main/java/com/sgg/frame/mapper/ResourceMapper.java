package com.sgg.frame.mapper;

import com.sgg.frame.entity.Resource;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface ResourceMapper {
    @Delete({
        "delete from sys_resource",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into sys_resource (id, name, ",
        "identity, url, parent_id, ",
        "parent_ids, pic, ",
        "weight, is_show, mjbj)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{identity,jdbcType=VARCHAR}, #{url,jdbcType=VARCHAR}, #{parentId,jdbcType=INTEGER}, ",
        "#{parentIds,jdbcType=VARCHAR}, #{pic,jdbcType=VARCHAR}, ",
        "#{weight,jdbcType=INTEGER}, #{isShow,jdbcType=BIT}, #{mjbj,jdbcType=BIT})"
    })
    int insert(Resource record);

    @InsertProvider(type=ResourceSqlProvider.class, method="insertSelective")
    int insertSelective(Resource record);

    @Select({
        "select",
        "id, name, identity, url, parent_id, parent_ids, pic, weight, is_show, mjbj",
        "from sys_resource",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="identity", property="identity", jdbcType=JdbcType.VARCHAR),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="parent_id", property="parentId", jdbcType=JdbcType.INTEGER),
        @Result(column="parent_ids", property="parentIds", jdbcType=JdbcType.VARCHAR),
        @Result(column="pic", property="pic", jdbcType=JdbcType.VARCHAR),
        @Result(column="weight", property="weight", jdbcType=JdbcType.INTEGER),
        @Result(column="is_show", property="isShow", jdbcType=JdbcType.BIT),
        @Result(column="mjbj", property="mjbj", jdbcType=JdbcType.BIT)
    })
    Resource selectByPrimaryKey(Integer id);

    @UpdateProvider(type=ResourceSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Resource record);

    @Update({
        "update sys_resource",
        "set name = #{name,jdbcType=VARCHAR},",
          "identity = #{identity,jdbcType=VARCHAR},",
          "url = #{url,jdbcType=VARCHAR},",
          "parent_id = #{parentId,jdbcType=INTEGER},",
          "parent_ids = #{parentIds,jdbcType=VARCHAR},",
          "pic = #{pic,jdbcType=VARCHAR},",
          "weight = #{weight,jdbcType=INTEGER},",
          "is_show = #{isShow,jdbcType=BIT},",
          "mjbj = #{mjbj,jdbcType=BIT}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Resource record);
}