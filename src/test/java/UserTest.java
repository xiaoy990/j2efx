import com.J2efx.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


public class UserTest {


    UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Test
    public void findTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        userService = (UserService)applicationContext.getBean("userService");
        userService.isDi();
        System.out.println(userService);
        System.out.println(userService.getAllUsers());
    }
}
