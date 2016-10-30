package iText_Lowgie_PDF;

import com.lowagie.text.*;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
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
public class ImageThumbnail {

    private static final Logger COMMON_LOGGER = LoggerFactory.getLogger(CommonLogger.class);

    public static void main(String[] arg) {
        try {


            org.jsoup.nodes.Document html = Jsoup.connect("http://ec2-52-25-88-167.us-west-2.compute.amazonaws.com:4503/content/tresiba/en/about-tresiba/why-tresiba.html").get();
            String root = "http://ec2-52-25-88-167.us-west-2.compute.amazonaws.com:4503";
            Elements elements = html.getElementsByTag("img");
            List<String> list = new ArrayList<>();
            String imgSrc;
            int index = 0;
            for (Element e : elements) {
                imgSrc = e.attr("src");


                if (!list.contains(root + imgSrc) && !StringUtils.isEmpty(imgSrc)) {
                    list.add(root + imgSrc);
                    index++;
                }

                if (index==5) { break; }

            }


            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream("sample1.pdf"));

            document.open();
            PdfPTable table = new PdfPTable(1);
            table.setWidthPercentage(100);
            table.setHorizontalAlignment(com.lowagie.text.Element.ALIGN_CENTER);


            System.out.println(document.getPageSize());
            //document.add(new Paragraph("Sample 1: This is simple image demo."));
            float h = 0;
            float w = 0;

            for (String str : list) {
                Image img = Image.getInstance(str);
                PdfPCell cell = new PdfPCell();
                cell.setBorder(Rectangle.NO_BORDER);
                cell.setPaddingLeft(30);
                h = img.getScaledHeight();
                w = img.getScaledWidth();
                calcAbsolue(img,h,w);
                cell.addElement(img);
                PdfPCell cell1;// = new PdfPCell();
                cell1 = new PdfPCell(new Phrase(str));
                cell1.setBorder(Rectangle.NO_BORDER);
                table.addCell(cell1);
                table.addCell(cell);
            }

            document.add(table);

            //document.add(Chunk.NEWLINE);

            document.close();

            System.out.println("Done");
        } catch (Exception e) {
            COMMON_LOGGER.error("Exception :" + e.getMessage());
        }
    }

   private static void calcAbsolue(Image img, float h, float w){
       if (h >= 200 || w >= 200) {
           img.scaleAbsolute((w * (float) 0.5), (h * (float) 0.5));
       } else if (h <= 50 || w <= 50) {
           img.scaleAbsolute((w * (float) 1.5), (h * (float) 1.5));
       } else {
           img.scaleAbsolute((w * (float) 1.0), (h * (float) 1.0));
       }
    }

}
