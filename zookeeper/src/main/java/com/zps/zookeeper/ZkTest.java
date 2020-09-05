package com.zps.zookeeper;

import org.apache.zookeeper.*;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

/**
 * Created by zps on 2020/8/30 18:10
 */
public class ZkTest {
    private static ZooKeeper zkClient;

    @Before
    public void init() throws IOException {
        zkClient = new ZooKeeper("120.27.219.6:2181", 300000, new Watcher() {
            public void process(WatchedEvent event) {
                try {
                    List<String> children = zkClient.getChildren("/sangou", true);
                    for (int i = 0; i < children.size(); i++) {
                        System.out.println(children);
                    }
                } catch (KeeperException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        System.out.println(zkClient.toString());

    }

    @Test
    public void createNode() throws IOException, KeeperException, InterruptedException {
        String s = zkClient.create("/ss", "louguanzhong".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
        System.out.println(s);
    }

    @Test
    public void listener() throws KeeperException, InterruptedException {
      zkClient.getChildren("/sangou", true);
      Thread.sleep(Long.MAX_VALUE);
    }
}
