package rdfizers;

import java.util.HashMap;


public interface RDFizerInterface
{

    public String getCsvPath();

    public void setCsvPath(String path);

    public String getOutputPath();

    public void setOutputPath(String outputPath);
        
    public String getMappingPath();
    
    public void setMappingPath(String mappingPath);
    
    public void init() throws Throwable;
    
    public void process() throws Throwable;
    
    public void finish();
}
