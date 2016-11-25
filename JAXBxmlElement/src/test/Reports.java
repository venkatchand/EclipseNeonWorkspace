package test;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="wert")
//@XmlType(propOrder = { "message"})
public class Reports
{
	private Messages eswar;
    public Messages getEswar() {
		return eswar;
	}
	public void setEswar(Messages eswar) {
		this.eswar = eswar;
	}
//	private Messages message;
//    public Messages getMessage() { return message; }
////    @XmlElement(name="cvcv")
//    public void setMessage(Messages m) { message = m; }
}