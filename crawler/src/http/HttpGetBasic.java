package http;

import http.HttpClientUtil;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
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
        return httpGet(url, DEFAULT_ENCODING);
    }


    protected static String httpGet(String url, String encoding)
    {
        try {
            HttpGet httpGet = new HttpGet(url);
            httpGet.setHeader("User-Agent", HttpClientUtil.getRandomUserAgent() );
            HttpResponse response = client.execute(httpGet);
            String result = EntityUtils.toString(response.getEntity(), encoding);
            logger.debug(result);
            return result;
        } catch (Exception e) {
            logger.error("httpGet error " + e.getMessage() );
            return "";
        }
    }
}
