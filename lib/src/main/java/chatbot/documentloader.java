package chatbot;

import dev.langchain4j.data.document.Document;
import dev.langchain4j.data.document.FileSystemDocumentLoader;

import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

public class documentloader {

    static class Load_Pdf_From_File_System_Example {

        public static void main(String[] args) {
            Path filePath = toPath("dom.pdf");
            Document document = FileSystemDocumentLoader.loadDocument(filePath);
            System.out.println(document);
        }
    }
    
    private static Path toPath(String fileName) {
        try {
            URL fileUrl = documentloader.class.getResource(fileName);
            return Paths.get(fileUrl.toURI());
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}