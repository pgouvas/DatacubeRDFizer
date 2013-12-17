
import rdfizers.CSVRDFizer;
import rdfizers.RDFizerFactory;
import rdfizers.RDFizerInterface;


public class DatacubeRDFizer
{
    public static void main(String[] args)
    {
        try
        {
            //RDFizerInterface rsd = RDFizerFactory.getRDFizer("csv", "/home/panos/Dropbox/project_notes/linked2safety/deri_cubes/fakeCubes/ArterialBloodPressure-Age.csv","/home/panos/Dropbox/projects_backup/MappingFileForCSV2.xml", "/home/panos/Dropbox/project_notes/linked2safety/deri_cubes/fakeCubes/test/t.ttl");
            RDFizerInterface rsd = RDFizerFactory.getRDFizer("csv", args[0], args[1], args[2]);
            rsd.init();
            rsd.process();
        }
        catch(Throwable t)
        {
            t.printStackTrace();
        }
        
    }
}
