package com.billy.UniQuery.mapper;

import com.billy.UniQuery.entity.Comment;
import java.util.List;

public interface CommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comment
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    int deleteByPrimaryKey(Integer commentid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comment
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    int insert(Comment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comment
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    Comment selectByPrimaryKey(Integer commentid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comment
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    List<Comment> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comment
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    int updateByPrimaryKey(Comment record);
}