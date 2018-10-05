

import org.junit.Test
import org.eclipse.emf.common.util.URI

import static org.junit.Assert.*
import org.xtext.example.mydsl.videoGen.MandatoryVideoSeq
import java.io.BufferedWriter
import java.io.IOException
import java.io.OutputStreamWriter
import java.io.FileOutputStream
import org.xtext.example.mydsl.videoGen.VideoSeq

class VideoGenTest1 {


	@Test
	def void testLoadModel() {
		
		val videoGen = new VideoGenHelper().loadVideoGenerator(URI.createURI("example1.videogen"))
		assertNotNull(videoGen)
		println(videoGen.information.authorName)
		assertEquals(4, videoGen.medias.size);
					
	}
}