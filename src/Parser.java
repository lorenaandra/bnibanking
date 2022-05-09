import org.jsoup.Connection;
import org.jsoup.Jsoup;

import javax.swing.text.Document;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class Parser {


    public static void main(String[] args) throws IOException {

        URL url = new URL("http://54.160.152.12:8000/sign-in/");
        HttpURLConnection urlconn = (HttpURLConnection) url.openConnection();
        System.out.println(urlconn.getResponseCode());
      //  if ()

//        //Document doc = (Document) Jsoup.parse("http://http://54.160.152.12:3000/sign-up/", String.valueOf(3600 * 1000));
//
//        Connection connection = Jsoup.connect("http://54.160.152.12:3000/sign-up/");
//
//        String html = connection.get().html();
//
////        String webPage = "http://54.160.152.12:3000/sign-up/";
////
////        String html = Jsoup.connect(webPage).get().html();
//
//        System.out.println(html);
//
//     //   System.out.println(doc);
    }
}
