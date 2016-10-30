package jsoup;

import org.apache.commons.lang3.StringUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;


/**
 * Created by AK on 10/26/16.
 */
public class GetDocumentFromStringV1 {
    public static void main(String[] args) throws IOException {
        String htmlString = "<html><head><title>Simple Page</title></head>"
                + "<body>Hello<h1>rere</h1><h1>headign2</h1></body></html>";

        //load from String
        //Document html = Jsoup.parse(htmlString);

        //load from URL
        Document html = Jsoup.connect("https://www.tresiba.com/about-tresiba/why-tresiba.html").get();

      //  Elements resultLinks =   //html.getElementsByTag("h1");

     //   String title = html.title();
      //  System.out.println("Title : " + title);
       // System.out.println("Content:\n");
       // System.out.println(doc.toString());
        //System.out.println(resultLinks);

//        for(Element e:resultLinks){
//            System.out.println(e.text());
//        }


        //h1 tag
        StringBuilder sb = new StringBuilder();
        Elements elements =html.body().select(".hidden-xs h1"); // html.getElementsByTag("h1");
        int index = 1;
        String imgSrc, imgClass;
        Element e1=null;
        for(Element e:elements){
                e1 = e.parent();
                String dclass = e1.attr("class");
            System.out.println(dclass);
                sb.append(index + ". " + e.text());

                sb.append(System.getProperty("line.separator"));
                index++;

        }

        if (!StringUtils.isEmpty(sb.toString())) {
           System.out.println(sb.toString());
      }


        System.out.println(e1.toString());

// Image
//        StringBuilder sb = new StringBuilder();
//        Elements elements = html.getElementsByTag("img");
//        int index = 1;
//        String imgSrc, imgClass;
//        for(Element e:elements){
//            imgSrc = e.attr("src");
//            imgClass = e.attr("class");
//            imgSrc = imgSrc.substring(imgSrc.lastIndexOf("/")+ 1, imgSrc.length());
//            if (!imgClass.contains("visible-xs")) {
//                sb.append(index + ". " + imgSrc + " class: " + imgClass);
//
//            sb.append(System.getProperty("line.separator"));
//            index++;
//            }
//        }
//
//        if (!StringUtils.isEmpty(sb)) {
//            System.out.println(sb.toString());
//        }


    }
}
