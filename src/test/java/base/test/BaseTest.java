package base.test;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@ContextConfiguration(
        locations = {"classpath:spring-appcontext.xml"}
)
@Transactional(
        transactionManager = "transactionManager"
)
@RunWith(SpringJUnit4ClassRunner.class)
public class BaseTest {
    public BaseTest() {
    }

    @Before
    public void initDatabase(){
    }
}

