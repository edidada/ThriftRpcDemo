import com.ganjun.service.HelloService;
import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TTransportException;

/**
 * @Author Junnor.G
 * @Date 2019/1/8 下午6:44
 */

public class Server {
    public static void main(String args[]) {
        try {
            System.out.println("服务端开启....");
            TProcessor tprocessor = new HelloService.Processor<HelloService.Iface>(new HelloServiceImpl());
            TServerSocket serverTransport = new TServerSocket(50005);
            TServer.Args tArgs = new TServer.Args(serverTransport);
            tArgs.processor(tprocessor);
            tArgs.protocolFactory(new TBinaryProtocol.Factory());
            TServer server = new TSimpleServer(tArgs);
            server.serve();
        } catch (TTransportException e) {
            e.printStackTrace();
        }
    }
}
