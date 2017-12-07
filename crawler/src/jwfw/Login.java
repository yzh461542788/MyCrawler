package jwfw;

import http.HttpGetBasic;
import http.HttpClientUtil;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by azure on 2017/9/30.
 */
public class Login extends HttpGetBasic
{
    private static final String LOGIN_URL = "http://uis.fudan.edu.cn/authserver/login";
    private static final String LOGOUT_URL = "http://jwfw.fudan.edu.cn/eams/logout.action";

    public static void logout()
    {
        httpGet(LOGOUT_URL);
    }

    private static List<NameValuePair> getHiddenParams()
    {
        List<NameValuePair> params = new ArrayList<>();
        HttpGet httpGet = new HttpGet(LOGIN_URL);
        httpGet.setHeader("User-Agent", HttpClientUtil.getRandomUserAgent() );
        //@Cleanup
        InputStream in;
        try {
            HttpResponse response = client.execute(httpGet);
            in = response.getEntity().getContent();
            Document searchDoc = Jsoup.parse(in, "utf-8", LOGIN_URL);
            if (searchDoc != null) {
                Element e0 = searchDoc.select("input[name = lt]").get(0);
                String lt = e0.attr("value");
                Element e1 = searchDoc.select("input[name = dllt]").get(0);
                String dllt = e1.attr("value");
                Element e2 = searchDoc.select("input[name = execution]").get(0);
                String execution = e2.attr("value");
                Element e3 = searchDoc.select("input[name = _eventId]").get(0);
                String _eventId = e3.attr("value");
                Element e4 = searchDoc.select("input[name = rmShown]").get(0);
                String rmShown = e4.attr("value");
                params.add(new BasicNameValuePair("lt", lt) );
                params.add(new BasicNameValuePair("dllt", dllt) );
                params.add(new BasicNameValuePair("execution", execution) );
                params.add(new BasicNameValuePair("_eventId", _eventId) );
                params.add(new BasicNameValuePair("rmShown", rmShown) );
            }
        } catch (Exception e) {
            logger.error("getHiddenParams error " + e.getMessage() );
            return null;
        }
        return params;
    }

    public static boolean uisLogin(String username, String password)
    {
        List<NameValuePair> params = getHiddenParams();
        if(params == null)
            return false;
        params.add(new BasicNameValuePair("username", username) );
        params.add(new BasicNameValuePair("password", password) );

        HttpPost httpPost = new HttpPost(LOGIN_URL);
        httpPost.setHeader("User-Agent", HttpClientUtil.getRandomUserAgent());
        try {
            httpPost.setEntity(new UrlEncodedFormEntity(params));
            HttpResponse response = client.execute(httpPost);
            String result = EntityUtils.toString(response.getEntity());
            logger.debug(result);
            logger.debug("Set-Cookie" + response.getFirstHeader("Set-Cookie").getValue() );
        } catch (Exception e) {
            logger.error("uisLogin error ! " + e.getMessage() );
            return false;
        }
        return true;
    }

}
