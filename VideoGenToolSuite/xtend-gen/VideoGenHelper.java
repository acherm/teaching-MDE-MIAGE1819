import java.util.HashMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class VideoGenHelper {
  public VideoGeneratorModel loadVideoGenerator(final URI uri) {
    throw new Error("Unresolved compilation problems:"
      + "\nVideoGeneratorModel cannot be resolved to a type."
      + "\nVideoGenStandaloneSetup cannot be resolved to a type."
      + "\ndoSetup cannot be resolved");
  }
  
  public void saveVideoGenerator(final URI uri, final /* VideoGeneratorModel */Object videoGen) {
    try {
      Resource rs = new ResourceSetImpl().createResource(uri);
      rs.getContents().add(videoGen);
      HashMap<Object, Object> _hashMap = new HashMap<Object, Object>();
      rs.save(_hashMap);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
