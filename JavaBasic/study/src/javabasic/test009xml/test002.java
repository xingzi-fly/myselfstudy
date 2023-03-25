package learn001.test009xml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class test002 {

    @Test
    public void parseTolist() throws DocumentException {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read("./src/learn001/test009xml/test.xml");
        Element root = document.getRootElement();
        List<Element> cons = root.elements("contact");
        List<Person> persons = new ArrayList<>();
        for (Element con : cons) {
            Person p = new Person();
            p.setId(Integer.valueOf(con.attributeValue("id")));
            p.setVip(Boolean.valueOf(con.attributeValue("vip")));
            p.setName(con.elementTextTrim("name"));
            p.setGender(con.elementTextTrim("gender").charAt(0));
            p.setEmail(con.elementTextTrim("email"));
            persons.add(p);
        }
        for (Person person : persons) {
            System.out.println(person);
        }

    }
}
