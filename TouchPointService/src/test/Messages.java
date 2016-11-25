package test;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

//@XmlType(propOrder = { "body" })
public class Messages
{

	private String test;
	public String getTest() {
		return test;
	}
	@XmlElement(name="cvcv")
	public void setTest(String test) {
		this.test = test;
	}
//	private String body;
//	
//    public String getBody() { return bodys; }
////    @XmlElement(name="hummmm")
//    public void setBody(String body123) { this.bodys = body123; }
}
