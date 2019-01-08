import com.ganjun.service.HelloService;
import org.apache.thrift.TException;

/**
 * @Author Junnor.G
 * @Date 2019/1/8 下午6:43
 */
public class HelloServiceImpl implements HelloService.Iface {
    @Override
    public String helloString(String s) throws TException{
        return s;
    }
}
