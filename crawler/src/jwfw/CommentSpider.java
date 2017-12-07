package jwfw;

import http.HttpGetBasic;
import jwfw.model.LessonComments;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 * Created by azure on 2017/10/1.
 */
public class CommentSpider extends HttpGetBasic
{
    private static final String COMMENT_URL = "http://jwfw.fudan.edu.cn/eams/quality/stat/student-result!textEvaluate.action?lesson.id=";
    public static String getLessonComment(int lessonId)
    {
        LessonComments comments = new LessonComments();
        comments.setId(lessonId);

        String url = COMMENT_URL + lessonId;
        String content = httpGet(url);
        Document searchDoc = Jsoup.parse(content, url);
        Elements pros = searchDoc.select("div#1 > pre");
        //pros.stream().forEach(e -> comments.getPros.add(e.text() ) );
        Elements cons = searchDoc.select("div#2 > pre");
        return null;
    }
}
