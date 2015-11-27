package anajavatica.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TempFileMain {

	private File createTempFile() throws IOException {
		File tempFile = File.createTempFile("AnaJavaticaTempFile", ".anajavatica");
		BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile));
		bw.write("AnaJavatica Temp File");
		bw.flush();
		bw.close();
		return tempFile;
	}

	public static void main(String[] args) {

		TempFileMain instance = new TempFileMain();
		File tempFile = null;
		try {
			tempFile = instance.createTempFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (tempFile != null)
			System.out.println(tempFile.getAbsolutePath());

	}

}
