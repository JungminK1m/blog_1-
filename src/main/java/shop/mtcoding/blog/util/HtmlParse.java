package shop.mtcoding.blog.util;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HtmlParse {

    public static String 파싱하기(String content) {

        String html = content;
        Document doc = Jsoup.parse(html);
        // System.out.println(doc);
        Elements els = doc.select("img");
        // System.out.println(els);
        if (els.size() == 0) {
            // 임시 사진 제공해주기
            // 디비 thumnail -> /images/profile.jfif
            return "/images/profile.jfif";
        } else {
            Element el = els.get(0);
            String img = el.attr("src");
            System.out.println(img);
            return img;
            // 디비 thumnail -> img
        }
    }
}
