package base.test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.transaction.annotation.Transactional;

@ContextConfiguration(
        locations = {"classpath:spring-appcontext.xml"}
)
@Transactional(
        transactionManager = "transactionManager"
)
public class BaseTest extends AbstractTransactionalJUnit4SpringContextTests {
    public BaseTest() {
    }
}

