package mappingfacilities;

import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;
import xmlhandlers.MappingFileReader;

public class MappingImportHandler
{
    private SAXParserFactory factory;
    private SAXParser saxParser;
    private MappingFileReader handler;
    private String path;
    private String publisher;
    private String label;
    private String componentBaseURL;
    
    public MappingImportHandler(String path)
    {
        this.path = new String(path);
    }

    public String getURLBase()
    {
        return handler.getUrlBase();
    }

    public String getComponentBaseURL() {
        return handler.getComponentBaseURL();
    }

        
    public String getStructureBase()
    {
        return handler.getStructureBase();
    }
    
    public void requestMapping()
    {
        try
        {
            factory = SAXParserFactory.newInstance();
            saxParser = factory.newSAXParser();
            handler = new MappingFileReader();
            saxParser.parse(path, handler);  
        }
        catch(Throwable t)
        {
            t.printStackTrace();
            System.exit(1);
        }
    }
       
    public HashMap<String,String> getTypes()
    {
        return handler.getTypes();
    }
    
    public String getPublisher()
    {
        return handler.getPublisher();
    }
    
    public String getLabel()
    {
        return handler.getLabel();
    }

    public String getFallbackNamespace()
    {
        return handler.getFallbackNamespace();
    }    
    
    public HashMap<String,String> getVocabularies()
    {
        return handler.getVocabularies();
    }
    
    public HashMap<String, HashMap<String,String>> getEntitiesDescription()
    {
        return handler.getEntitiesDescription();
    }
    
    public static void main(String[] args)
    {
        MappingImportHandler mih = new MappingImportHandler("C:\\Users\\user\\Desktop\\MappingFileForCSV.xml");
        mih.requestMapping();
        System.out.println(mih.getVocabularies());
    }
}
