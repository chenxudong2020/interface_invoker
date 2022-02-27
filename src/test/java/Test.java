import com.xxx.Main;
import com.xxx.invoker.bean.Input;
import com.xxx.invoker.bean.Result;
import com.xxx.invoker.bean.User;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)

@SpringBootTest(classes = Main.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class Test {

    @Autowired
    com.xxx.invoker.api.RemoteHttpApI remoteHttpApI;

    @org.junit.Test
    public void test(){
        Input input=new Input();
        input.setId("1");
        Result<User> result=remoteHttpApI.getUser(input);
        String name=result.getData().getName();
        System.out.println(name);
    }
}
