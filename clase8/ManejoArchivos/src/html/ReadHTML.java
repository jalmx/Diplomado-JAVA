/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package html;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author josef
 */
public class ReadHTML {

    public static void main(String[] args) throws Exception{
        
        Document documento = Jsoup.connect("http://en.wikipedia.org").get();
        
        Elements links = documento.select("a[href]");
        
        for(Element enlace: links){
            System.out.println(enlace.attr("href"));
        }
        
        
        
    }
    
}
