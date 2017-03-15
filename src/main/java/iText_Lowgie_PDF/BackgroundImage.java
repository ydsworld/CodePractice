package iText_Lowgie_PDF;

import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.Image;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;
import modifier.CommonLogger;
import org.apache.commons.lang3.StringUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by AK on 3/14/17.
 */
public class BackgroundImage {

    private static final Logger COMMON_LOGGER = LoggerFactory.getLogger(CommonLogger.class);

    public static void main(String[] arg){
        try{
            //
            org.jsoup.nodes.Document html = Jsoup.connect("http://ec2-52-25-88-167.us-west-2.compute.amazonaws.com:4503/content/victoza/en/get-started-using-victoza-.html").get();
            String root = "http://ec2-52-25-88-167.us-west-2.compute.amazonaws.com:4503";


            // String html = "<html><head></head><body><div class=\"post_video\" style=\"background-image:url(http://img.youtube.com/vi/JFf3uazyXco/2.jpg);\"></body></html>";

                 //   Document doc = Jsoup.parse( html );
                    Elements elements = html.getElementsByClass("hero");

                    for( Element e : elements ) {
                        String attr = e.attr("style");
                        System.out.println( attr.substring( attr.indexOf("/"), attr.indexOf(")") ) );
                    }

            System.out.println("Done");
        } catch (Exception e){
            COMMON_LOGGER.error("Exception :" + e.getMessage());
        }
    }

}
