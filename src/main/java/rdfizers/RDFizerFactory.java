package rdfizers;

public class RDFizerFactory
{
    public static RDFizerInterface getRDFizer(String rdfizerName, String path, String mappingPath, String outpath)
    throws ClassNotFoundException, InstantiationException, IllegalAccessException
    {
        Class rdfizerClass = null;
        RDFizerInterface rdfizer = null;
        
        if(rdfizerName.equals("csv"))
            rdfizerClass = Class.forName("rdfizers.CSVRDFizer");
        
        rdfizer = (RDFizerInterface)rdfizerClass.newInstance();
        
        rdfizer.setCsvPath(path);
        rdfizer.setMappingPath(mappingPath);
        rdfizer.setOutputPath(outpath);

        return rdfizer;
    }
}
