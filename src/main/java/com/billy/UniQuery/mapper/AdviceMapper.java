package com.billy.UniQuery.mapper;

import com.billy.UniQuery.entity.Advice;
import java.util.List;

public interface AdviceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_advice
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    int deleteByPrimaryKey(Integer adviceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_advice
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    int insert(Advice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_advice
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    Advice selectByPrimaryKey(Integer adviceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_advice
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    List<Advice> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_advice
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    int updateByPrimaryKey(Advice record);
}