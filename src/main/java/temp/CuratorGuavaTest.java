package temp;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.recipes.cache.PathChildrenCache;
import org.apache.curator.retry.RetryOneTime;
import org.apache.curator.test.TestingServer;

public class CuratorGuavaTest
{
    public static void main(String[] args) throws Exception
    {
        TestingServer server = new TestingServer();
        CuratorFramework client = CuratorFrameworkFactory.newClient(server.getConnectString(), new RetryOneTime(1));
        client.start();

        PathChildrenCache cache = new PathChildrenCache(client, "/a/b", true);
        cache.start();

        cache.close();
        client.close();
        server.close();
    }
}
