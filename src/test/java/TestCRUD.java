import net.czqu.example.Application;
import net.czqu.example.dao.example.StudentExample;
import net.czqu.example.dao.mapper.StudentMapper;
import net.czqu.example.dao.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @program: MybatisGeneratorTest
 * @description:
 * @author: czq
 * @create: 2023-02-08 21:15
 **/
@SpringBootTest(classes = Application.class)
public class TestCRUD {
    @Autowired
    private StudentMapper studentMapper;
    @Test
    public void testRead(){
        List<Student> studentList=studentMapper.selectByExample(StudentExample.newAndCreateCriteria().example());
        System.out.println(studentList.size());
    }
}
