package com.sudarshan.sud;

import java.util.List;

import com.sudarshan.sud.model.Student;
import com.sudarshan.sud.repository.StudentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;


@RunWith(SpringRunner.class)
@SpringBootTest
public class JpqlandnativesqlApplicationTests {

	@Autowired
	StudentRepository repository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testCreateStudent() {
		Student student = new Student();
		student.setFirstName("John");
		student.setLastName("Ferguson");
		student.setScore(88);

		Student student2 = new Student();
		student2.setFirstName("Bill");
		student2.setLastName("Gates");
		student2.setScore(75);

		repository.save(student);
		repository.save(student2);
	}

    @Test
    public void testFindAllStudentsPartial() {
        List<Object[]> partialData = repository.findAllStudentsPartialData();
        for (Object[] objects : partialData) {
            System.out.println(objects[0]);
            System.out.println(objects[1]);
        }
    }

}









