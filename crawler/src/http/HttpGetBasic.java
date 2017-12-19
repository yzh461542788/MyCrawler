package http;

import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.util.EntityUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * Created by azure on 2017/10/1.
 */
public class HttpGetBasic
{
    protected static final String DEFAULT_ENCODING = "UTF-8";
    protected static Logger logger = LogManager.getLogger();
    protected static HttpClient client = HttpClientUtil.getHttpClient(false);    //  proxy is not needed for open web page

    protected static String httpGet(String url)
    {
        return httpGet(url, DEFAULT_ENCODING, null, null);
    }


    protected static String httpGet(String url, String referer, String xShard)
    {
        return httpGet(url, DEFAULT_ENCODING, referer, xShard);
    }
    protected static String httpGet(String url, String encoding, String referer, String xShard)
    {
        try {
            HttpGet httpGet = new HttpGet(url);
            HttpClientContext httpClientContext = HttpClientUtil.getHttpClientContext();
            httpGet.setHeader("User-Agent", HttpClientUtil.getDefaultUserAgent() );
            if(referer != null)
                httpGet.setHeader("referer", referer);
            if(xShard != null)
                httpGet.setHeader("x-shard", xShard);
            HttpResponse response = client.execute(httpGet, httpClientContext);
            //  save cookie
            CookieStore cookieStore = httpClientContext.getCookieStore();
            HttpClientUtil.saveCookieStore(cookieStore, "cookie");
            //  get result html
            String result = EntityUtils.toString(response.getEntity(), encoding);
            logger.debug(result);
            return result;
        } catch (Exception e) {
            logger.error("httpGet error " + e.getMessage() );
            return "";
        }
    }
}
