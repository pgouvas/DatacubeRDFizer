package rdfizers;

import java.util.HashMap;

public class RDFNamespaces
{
    private HashMap<String,String> rdfDescriptor = null;
    
    public RDFNamespaces()
    {
        rdfDescriptor = new HashMap();
    }

    public RDFNamespaces(HashMap<String,String> rdfDescriptor)
    {
        this.rdfDescriptor = rdfDescriptor;
    }
        
    public HashMap<String, String> getRdfDescriptor() {
        return rdfDescriptor;
    }

    public void setRdfDescriptor(HashMap<String, String> rdfDescriptor) {
        this.rdfDescriptor = rdfDescriptor;
    }
        
    public String getURI(String name)
    {
        return rdfDescriptor.get(name);
    }
    
}
