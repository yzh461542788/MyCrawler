package util;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by azure on 2017/9/30.
 */
public class MyUtil
{
    public static String readString(String fileName)
    {
        StringBuffer str = new StringBuffer("");
        File file=new File(fileName);
        try {
            FileReader fr=new FileReader(file);
            int ch = 0;

            while((ch = fr.read())!=-1 )
            {
                str.append((char)ch);
            }

            fr.close();
        } catch (IOException e) {
            e.printStackTrace();

        }
        return str.toString();
    }
}
