package codegym.vn.endmodule.valid;


import codegym.vn.endmodule.entity.PostNew;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.Date;

public class DateValid implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return PostNew.class.isAssignableFrom(clazz);    }

    @Override
    public void validate(Object target, Errors errors) {
        PostNew postNew = (PostNew) target;

        Date today = new Date(System.currentTimeMillis());


        if(  today.before(postNew.getDateWrite())){
            errors.rejectValue("dateWrite", "dateError");

        }

        System.out.println( postNew.getDateWrite());
        System.out.println( today);


    }
}
