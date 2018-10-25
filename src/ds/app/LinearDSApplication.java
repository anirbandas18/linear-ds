/*package ds.app;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.io.FilenameUtils;

import ds.service.SequenceService;

public class LinearDSApplication {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SequenceService.stackDemo();
		//SequenceService.queueDemo();
		//SequenceService.dequeDemo();
		
		String original = "/home/anirban/xyz/x1\\t1.txt";
		String modified = FilenameUtils.separatorsToSystem(original);
		System.out.println(original + " to " + modified);
		System.out.println(System.getProperty("user.home"));
		System.out.println(System.getProperty("os.name"));
		Path path = Paths.get(System.getProperty("user.home"));
    	String userHomeBase = path.getParent().toString();
    	System.out.println("User home base: " + userHomeBase);
    	String userName = System.getProperty("user.name");
    	System.out.println("User name: " + userName);
    	Path mockPath = Paths.get(userHomeBase, userName, "dump", "abc.txt");
    	System.out.println(mockPath.toString());
    	File mockFile = mockPath.toFile();
    	System.out.println("Exists: " + mockFile.exists());
		SequenceService.circularQueueDemo();
	}

}
*/