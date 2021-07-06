package cuifua;

import cuifua.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class VueBootApplicationTests
{
    @Resource
    private BookRepository bookRepository;

    @Test
    void contextLoads()
    {
        System.out.println(bookRepository.findAll());
    }

}
