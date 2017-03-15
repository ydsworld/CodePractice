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
 * Created by AK on 10/28/16.
 */
public class ImageThumbnailV1 {

    private static final Logger COMMON_LOGGER = LoggerFactory.getLogger(CommonLogger.class);

    public static void main(String[] arg){
        try{





            org.jsoup.nodes.Document html = Jsoup.connect("http://ec2-52-25-88-167.us-west-2.compute.amazonaws.com:4503/content/victoza/en/get-started-using-victoza-.html").get();
            String root = "http://ec2-52-25-88-167.us-west-2.compute.amazonaws.com:4503";
            Elements elements =
            html.getElementsByClass("hero");

            List<String> list = new ArrayList<>();
            String imgSrc;

            for(Element e:elements){
                //imgSrc = e.attr("src");
                imgSrc= e.attr("style");

                if (!list.contains(root + imgSrc) && !StringUtils.isEmpty(imgSrc)){
                    list.add(root + imgSrc);
                }

            }

//
//            list.add("http://ec2-52-25-88-167.us-west-2.compute.amazonaws.com:4503/content/dam/diabetes-patient/tresiba/About/why-tresiba/Why_Tresiba_pen.jpg.img.png");
//            list.add("http://ec2-52-25-88-167.us-west-2.compute.amazonaws.com:4503/content/dam/diabetes-patient/tresiba/General/calendar_week1.png.img.png");
//            list.add("http://ec2-52-25-88-167.us-west-2.compute.amazonaws.com:4503/content/dam/diabetes-patient/tresiba/General/blue-tab-C4C.jpg");

            Document document = new Document();
            PdfWriter.getInstance(document,new FileOutputStream("sample7.pdf"));

            document.open();
            System.out.println(document.getPageSize());
            //document.add(new Paragraph("Sample 1: This is simple image demo."));
            float h =0;
            float w =0;
            float th =842;
            for(String str : list) {
                Image img = Image.getInstance(str);
                h = img.getScaledHeight();
                w = img.getScaledWidth();
                if (h >= 200 || w >= 200) {
                    img.scaleAbsolute((w * (float) 0.5), (h * (float) 0.5));

                }else if (h < 30 || w < 30) {
                    img.scaleAbsolute((w * (float) 2.0), (h * (float) 2.0));
                }
//                h = img.getScaledHeight();
//                th = th - (h + 50);
//                if (th < h) {
//                    document.add(new Paragraph("new page"));
//                    th=842;
//                }
                document.add(img);
                document.add(new Paragraph("-------------------"));
                document.add(Chunk.NEWLINE );
            }
            document.close();

            System.out.println("Done");
        } catch (Exception e){
            COMMON_LOGGER.error("Exception :" + e.getMessage());
        }
    }

    private static float calcAbsolueWidth(float width, float height, int imageSize){
        return (width/height) * (float) imageSize;
    }

    private static float calcAbsolueHeight(float width, float height, int imageSize){
        return (height/height) * (float) imageSize;
    }

}
