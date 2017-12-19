package com.waimaizhushou.http;


import com.waimaizhushou.consts.Consts;
import org.apache.http.HttpHost;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.client.CookieStore;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by azure on 2017/9/30.
 */
public class HttpClientUtil
{
    private static final int TIMEOUT = 10000;

    private static final List<String> USER_AGENTS = new ArrayList<>(Arrays.asList("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.86 Safari/537.36",
            "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1; AcooBrowser; .NET CLR 1.1.4322; .NET CLR 2.0.50727)",
            "Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.0; Acoo Browser; SLCC1; .NET CLR 2.0.50727; Media Center PC 5.0; .NET CLR 3.0.04506)",
            "Mozilla/4.0 (compatible; MSIE 7.0; AOL 9.5; AOLBuild 4337.35; Windows NT 5.1; .NET CLR 1.1.4322; .NET CLR 2.0.50727)",
            "Mozilla/5.0 (Windows; U; MSIE 9.0; Windows NT 9.0; en-US)",
            "Mozilla/5.0 (compatible; MSIE 9.0; Windows NT 6.1; Win64; x64; Trident/5.0; .NET CLR 3.5.30729; .NET CLR 3.0.30729; .NET CLR 2.0.50727; Media Center PC 6.0)",
            "Mozilla/5.0 (compatible; MSIE 8.0; Windows NT 6.0; Trident/4.0; WOW64; Trident/4.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; .NET CLR 1.0.3705; .NET CLR 1.1.4322)",
            "Mozilla/4.0 (compatible; MSIE 7.0b; Windows NT 5.2; .NET CLR 1.1.4322; .NET CLR 2.0.50727; InfoPath.2; .NET CLR 3.0.04506.30)",
            "Mozilla/5.0 (Windows; U; Windows NT 5.1; zh-CN) AppleWebKit/523.15 (KHTML, like Gecko, Safari/419.3) Arora/0.3 (Change: 287 c9dfb30)",
            "Mozilla/5.0 (X11; U; Linux; en-US) AppleWebKit/527+ (KHTML, like Gecko, Safari/419.3) Arora/0.6",
            "Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.8.1.2pre) Gecko/20070215 K-Ninja/2.1.1",
            "Mozilla/5.0 (Windows; U; Windows NT 5.1; zh-CN; rv:1.9) Gecko/20080705 Firefox/3.0 Kapiko/3.0",
            "Mozilla/5.0 (X11; Linux i686; U;) Gecko/20070322 Kazehakase/0.4.5",
            "Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.8) Gecko Fedora/1.9.0.8-1.fc10 Kazehakase/0.5.6",
            "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/535.11 (KHTML, like Gecko) Chrome/17.0.963.56 Safari/535.11",
            "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_7_3) AppleWebKit/535.20 (KHTML, like Gecko) Chrome/19.0.1036.7 Safari/535.20",
            "Opera/9.80 (Macintosh; Intel Mac OS X 10.6.8; U; fr) Presto/2.9.168 Version/11.52")
    );

    private static List<String> proxyList = new ArrayList<>(Consts.PROXY_LIST);
    private static final List<HttpClient> httpClientList = new ArrayList<>();
    private static HttpClient httpClientWithoutProxy;


    private static HttpClientContext httpClientContext = HttpClientContext.create();

    private static int clientNumber = 0;

    static {
        CookieStore cookieStore = readCookieStore("cookie");
        /*httpClientList.addAll(proxyList
                .stream()
                .map(s -> {
                    HttpClientBuilder build = org.apache.http.impl.client.HttpClients.custom();
                    RequestConfig requestConfig = RequestConfig.custom()
                            .setConnectionRequestTimeout(TIMEOUT)
                            .setConnectTimeout(TIMEOUT)
                            .setSocketTimeout(TIMEOUT)
                            .build();
                    String ip = s.split(":")[0];
                    int port = Integer.parseInt(s.split(":")[1] );
                    HttpHost proxy = new HttpHost(ip, port);
                    if(cookieStore != null)
                        return build.setProxy(proxy)
                            .setDefaultRequestConfig(requestConfig)
                            .setDefaultCookieStore(cookieStore)
                            .build();
                    else
                        return build.setProxy(proxy)
                                .setDefaultRequestConfig(requestConfig)
                                .build();
                })
                .collect(Collectors.toList()));*/
        //HttpHost proxy = new HttpHost("127.0.0.1", 8080);
        HttpClientBuilder build = org.apache.http.impl.client.HttpClients.custom();
        RequestConfig requestConfig = RequestConfig.custom()
                .setConnectionRequestTimeout(TIMEOUT)
                .setConnectTimeout(TIMEOUT)
                .setSocketTimeout(TIMEOUT)
                .build();
        if(cookieStore != null)
            httpClientWithoutProxy = build.setDefaultRequestConfig(requestConfig).setDefaultCookieStore(cookieStore).build();  //  without proxy
        else
            httpClientWithoutProxy = build.setDefaultRequestConfig(requestConfig).build();
        //  using localhost as an extra proxy
        httpClientList.add(httpClientWithoutProxy);
        proxyList.add("localhost");
    }

    public static String getDefaultUserAgent()
    {
        return USER_AGENTS.get(0);
    }
    public static String getRandomUserAgent()
    {
        int i = (int) (Math.random() * USER_AGENTS.size() );
        return USER_AGENTS.get(i);
    }
    public static int getHttpClientCount()
    {
        return httpClientList.size();
    }

    public static HttpClient getHttpClient(boolean useProxy)
    {
        if(useProxy) {
            int num = clientNumber;
            clientNumber = (clientNumber + 1) % httpClientList.size();
            return httpClientList.get(num);
        }
        else {
            return httpClientWithoutProxy;
        }
    }

    public static HttpClientContext getHttpClientContext()
    {
        return httpClientContext;
    }

    public static void saveCookieStore( CookieStore cookieStore, String savePath ) throws IOException {

        FileOutputStream fs = new FileOutputStream(savePath);
        ObjectOutputStream os =  new ObjectOutputStream(fs);
        os.writeObject(cookieStore);
        os.close();

    }

    public static CookieStore readCookieStore( String savePath ) {
        try {
            FileInputStream fs = new FileInputStream("cookie");
            ObjectInputStream ois = new ObjectInputStream(fs);
            CookieStore cookieStore = (CookieStore) ois.readObject();
            ois.close();
            return cookieStore;
        } catch(Exception e) {
            return null;
        }
    }

}
