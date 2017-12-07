package jwfw.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by azure on 2017/10/1.
 */
@Getter
@Setter
public class LessonComments
{
    private int id;
    private String semester;
    private String lessonId;
    private String lessonName;
    private String teacherName;
    private List<String> pros = new ArrayList<>();
    private List<String> cons = new ArrayList<>();
}
