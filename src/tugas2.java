import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.Vector;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class tugas2 {

    public static void main(String[] args) throws IOException {
        Document a = Jsoup.connect("http://www.uinsby.ac.id").timeout(6000).get();
        Elements pby = a.select("div#announcement");
    //    System.out.println(pby);

        String isi = null;
        for (Element element : pby.select("div#announcement-content")) {
//        String ann_url=element.select("div#announcement-content a").attr("href");
//        System.out.println(ann_url);

            isi = element.select("div#announcement-content a").text();
            System.out.println(isi);
        }

        String aaa = "aku anak mblendes aku";
        StringTokenizer aw = new StringTokenizer(isi, " ");
        int x = 0;
        Vector<String> ax = new Vector<String>();
        Vector<String> aww = new Vector<String>();
        while (aw.hasMoreTokens()) {
            ax.add(aw.nextToken());
            x++;
        }

        Hashtable axx = new Hashtable();
        for (int i = 0; i < ax.size(); i++) {
            axx.put(ax.get(i), String.valueOf(i));
        }

        Enumeration e = axx.keys();
        Enumeration es = axx.elements();
        while (e.hasMoreElements() && es.hasMoreElements()) {
            System.out.print("kata : ");
            System.out.println(String.valueOf(e.nextElement()));
//            System.out.print("jumlah : ");
//            System.out.println(String.valueOf(es.nextElement()));
        }

//        for (int i = 0; i < ax.length; i++) {
//            for (int j = 0; j < aww.length; j++) {
//                if (i!=j && ax[i]==ax[j]) {
////                    int xas = j+1;
//                    aww[] = ax[i];
//                    j--;
//                    
//                }else{
//                    aww[j] = ax[i];
//                }
//            }
//            System.out.println(aww[i]);
//            
//        }
//        for (int i = 0; i < ax.length; i++) {
//            System.out.println(aww[i]);
//        }
    }
}
