package com.iwill.springframework;

import com.iwill.springframework.service.PersonService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class PersonServiceTest {

    @Autowired
    private PersonService personService;

    @Test
    public void testGetName() {
        String name = personService.getName();
        Assert.isTrue(name != null, "test fail");
    }

}
