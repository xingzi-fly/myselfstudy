package learn001.test009xml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.io.File;
import java.io.InputStream;
import java.util.List;

public class test001 {

    @Test
    public void parseXML() throws DocumentException {
        SAXReader saxReader = new SAXReader();

        Document document = saxReader.read(new File("./src/learn001/test009xml/test.xml"));

        Element root = document.getRootElement();
        System.out.println(root.getName());

        List<Element> sons = root.elements();
        for (Element son : sons) {
            System.out.println(son.getName());
        }

        Element con = root.element("contact");
        System.out.println(con.elementText("name"));

    }
}
