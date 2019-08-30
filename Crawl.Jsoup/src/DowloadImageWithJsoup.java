	import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.jsoup.Jsoup;

	import org.jsoup.nodes.Document;

	import org.jsoup.nodes.Element;

	import org.jsoup.select.Elements;
	

	
	public class DowloadImageWithJsoup {





	    public static void main(String[] args) {
	    	


	    		
	        Document doc;

	        try {


	            // get all images

	            doc = Jsoup.connect("https://sachvui.com/doc-sach/tham-tu-lung-danh-conan-ban-dep-gosho-aoyama/chap-1.html").get();

	            Elements images = doc.body().select("img[src~=(?i)\\.(png|jpe?g|gif)]") ;
	     //       doc.toOutputStream(new FileOutputStream("/home/user/filepath/filename.html"), "UTF-8");
	            
	       //     File f = new File("conan1.html");
	            
	        //    doc.body();
	            
	            System.out.println(images);
	        } catch (IOException e) {

	            e.printStackTrace();

	        }


	    }

	}