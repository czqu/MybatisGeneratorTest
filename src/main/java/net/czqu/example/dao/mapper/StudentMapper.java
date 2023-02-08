package net.czqu.example.dao.mapper;

import java.util.List;
import net.czqu.example.dao.example.StudentExample;
import net.czqu.example.dao.pojo.Student;
import org.apache.ibatis.annotations.Param;

public interface StudentMapper {
    long countByExample(StudentExample example);

    int deleteByExample(StudentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Student record);

    int insertSelective(@Param("record") Student record, @Param("selective") Student.Column ... selective);

    Student selectOneByExample(StudentExample example);

    Student selectOneByExampleSelective(@Param("example") StudentExample example, @Param("selective") Student.Column ... selective);

    List<Student> selectByExampleSelective(@Param("example") StudentExample example, @Param("selective") Student.Column ... selective);

    List<Student> selectByExample(StudentExample example);

    Student selectByPrimaryKeySelective(@Param("id") Long id, @Param("selective") Student.Column ... selective);

    Student selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example, @Param("selective") Student.Column ... selective);

    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByPrimaryKeySelective(@Param("record") Student record, @Param("selective") Student.Column ... selective);

    int updateByPrimaryKey(Student record);

    int batchInsert(@Param("list") List<Student> list);

    int batchInsertSelective(@Param("list") List<Student> list, @Param("selective") Student.Column ... selective);
}