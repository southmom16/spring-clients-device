package com.springboot.clientsDevice.cache;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.TimeUnit;


public class CachedRequest {
    private static final Logger logger = LogManager.getLogger("ErrorLog");
    private static CachedRequest instance = new CachedRequest();
    private LoadingCache<String, String> cache;


    private CachedRequest() {
        init(10000, 20);
    }

    public static CachedRequest getInstance() {
        return instance;
    }

    public void init(int maxSize, int expireTime) {
        cache = CacheBuilder.newBuilder()
                .maximumSize(maxSize)
                .expireAfterWrite(expireTime, TimeUnit.MINUTES)
                .build(
                        new CacheLoader<String, String>() {
                            @Override
                            public String load(String key) throws Exception {
                                return null;
                            }
                        }
                );
    }

    public String get(String key) {
        String response = null;
        try {
            response = this.cache.get(key);
        } catch (Exception e)  {
            logger.error("error get key {} from RequestCache ", key);
        }

        return response;
    }

    public void put(String key, String value){
        this.cache.put(key, value);
    }

}
