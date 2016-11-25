package test;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;



public class SerializationTest
{
    public static void main(String args[]) throws Exception
    {
       JAXBContext jaxbContext = JAXBContext.newInstance(Reports.class);
       Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
       jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

       Reports report = new Reports();
       Messages message123 = new Messages();

       message123.setTest("Sample report message.");
       message123.setTest("lo lo l ol ol");
       report.setEswar(message123);
       jaxbMarshaller.marshal(report, System.out);

//       message.setBody("<rootTag><body>All systems online.</body></rootTag>");
//       report.setMessage(message);
//       jaxbMarshaller.marshal(report, System.out);
    }
}