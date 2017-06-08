import com.smaxe.uv.client.rtmp.NetConnection;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        com.smaxe.uv.client.rtmp.License.setKey(/*Enter Key*/);
        NetConnection nc = new NetConnection();
        nc.client(new Client());
        nc.connect("rtmp://fms.vagrant.dev:1935/emoji/");

        while (true) {
            Thread.sleep(100);
        }
    }
}
