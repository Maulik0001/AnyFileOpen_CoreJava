package FileOpen;

import java.io.File;

public class FileOpen {
	public static void main(String[] args) {
		try {
			File file=new File("File Path With Name");  // please mention here file path with file name
			
		/*	System.out.println("File Path ::: "+file.getAbsolutePath());
			System.out.println("File Name ::: "+file.getName());*/
			
			/*// For Linux
			String[] cmd = {
				    "/bin/sh",
				    "-c",
				    "identify -list font | grep -i -w \'Font: "  + file.getAbsolutePath() + "\'"
				};
			Runtime.getRuntime().exec(cmd);
			*/
			// For Window
			Runtime.getRuntime().exec("rundll32 SHELL32.DLL,ShellExec_RunDLL \"" +file.getAbsolutePath() + "\"");
		
		//	String myFile = "some filename.txt";
		/*	String myCommand = "cp -R '" + file.getName() + "' $HOME 2> errorlog";
			Runtime.getRuntime().exec(new String[] { "bash", "-c", myCommand });
			*/
			
			// For Urban OS
			
			/*String commandArray[] = {"cmd", "/c", "dir", "C:\\Program Files"};
			 
			Process process = Runtime.getRuntime().exec(commandArray);*/
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
