package com.example.endmodulestudent.valid;


import com.example.endmodulestudent.entity.Student;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.Date;

public class DateValid implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Student.class.isAssignableFrom(clazz);    }

    @Override
    public void validate(Object target, Errors errors) {
        Student student = (Student) target;

        Date today = new Date(System.currentTimeMillis());

        System.out.println( student.getBirthday());
        System.out.println( today);


    }
}
