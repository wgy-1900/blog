package org.lang.securitydy;

import org.junit.jupiter.api.Test;
import org.lang.securitydy.bean.Menu;
import org.lang.securitydy.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SecurityDyApplicationTests {
    @Autowired
    MenuService menuService;
    @Test
    void contextLoads() {
        System.out.println(menuService.getAllMenu());
    }

}
