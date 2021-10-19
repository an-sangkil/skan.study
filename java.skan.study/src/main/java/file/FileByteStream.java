package file;

import com.CustomDisplayName;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.UUID;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2021 by CJENM|MezzoMedia. All right reserved.
 * @since 2021-05-31
 */
public class FileByteStream {


    public static void main(String[] args) throws IOException {

        //FileByteStream.stringByteStream();
        FileByteStream.imageFileStream();
        //FileByteStream.testReadLine();

    }

    @CustomDisplayName(name = "문자열 스트림 변환 후 다시 문자열로 ")
    public static void stringByteStream () {
        String textStr = "Hello World";
        byte[] bytes = textStr.getBytes();

        System.out.printf("original plain  text %s  \n", textStr);
        System.out.printf("bytes convert %s  \n", (Object) bytes);
        System.out.printf("bytes format > toString %s  \n", bytes.toString());

        String data = new String(bytes, StandardCharsets.UTF_8);
        System.out.println("byte array decoding = " + data);
    }

    @CustomDisplayName(name = "이미지 문자열로변환 테스트, 이후 다른 이름의 파일로 변환  ")
    public static void imageFileStream() throws IOException {
        String filePath = "C:\\Users\\Mezzomedia\\Downloads\\urbanbrush-20200528234654335659.jpg";
        byte[] imageBytes = Files.readAllBytes(Paths.get(filePath));

        String  str =  Base64.getEncoder().encodeToString(imageBytes);
        //byte 를 > base64 인코딩한 문자열
        System.out.println(str);

        // 임시 디렉토리를 찾는다.
        String tempDirectory = System.getProperty("java.io.tmpdir");
        System.out.println("Temp Path:" + tempDirectory);
        byte[] imageDecode = Base64.getDecoder().decode(str);
        Files.write(Paths.get(tempDirectory + UUID.randomUUID().toString()+".jpg"), imageDecode);
    }


    @CustomDisplayName(name = "파일을 읽을때  ")
    public static void testReadLine() throws IOException {
        String filePath = "C:\\Users\\Mezzomedia\\Downloads\\response.md";
        Files.readAllLines(Paths.get(filePath)).forEach(s -> {
            System.out.println(s);
        });
    }
}
