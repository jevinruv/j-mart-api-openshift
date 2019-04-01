package com.jevin.jmartapi.configuration;

import com.pusher.rest.Pusher;
import org.springframework.beans.factory.annotation.Value;

public class PusherConfig {

//    @Value("${jmart.app.pusher.AppId}")
//    private String appId;
//
//    @Value("${jmart.app.pusher.AppKey}")
//    private String appKey;
//
//    @Value("${jmart.app.pusher.AppSecret}")
//    private String appSecret;
//
//    @Value("${jmart.app.pusher.ClusterKey}")
//    private String clusterKey;

    private static String appId = "742071";
    private static String appKey = "809276b50cbfba68b5cc";
    private static String appSecret = "c97367aab462267573f2";
    private static String clusterKey = "ap2";

    private static Pusher pusher;

    private PusherConfig() {
    }

    public static Pusher getPusher() {

        if (pusher == null) {
            pusher = new Pusher(appId, appKey, appSecret);
            pusher.setCluster(clusterKey);
            pusher.setEncrypted(true);
        }

        return pusher;
    }

}
