package iText_Lowgie_PDF;
import org.apache.commons.lang3.StringUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
/**
 * Created by AK on 3/15/17.
 */
public class BackgroundImageExample {
    public static void main(String[] args) {
        String html = "<html><head></head><body><div class=\"post_video\" style=\"background-image:url(http://img.youtube.com/vi/JFf3uazyXco/2.jpg);\" title=\"dd\"></body></html>";

        Document doc = Jsoup.parse( html );
        Elements elements = doc.getElementsByClass("post_video");


        for( Element e : elements ) {
            String attr = e.attr("style");
            String title = StringUtils.defaultIfEmpty(e.attr("title"),"myTitle");
            System.out.println(title);

            System.out.println( attr.substring( attr.indexOf("http://"), attr.indexOf(")") ) );
        }
    }
}
