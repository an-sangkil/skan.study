package file;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.UserDefinedFileAttributeView;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2021 by CJENM|MezzoMedia. All right reserved.
 * @since 2021-06-09
 */
public class FileURLStream {

    public static void main(String[] args) throws IOException {

        FileURLStream.urlOpenStream_nio();;

    }

    static  final  String FILE_URL = "https://byline.network/wp-content/uploads/2018/05/cat.png";

    public static void urlOpenStream() throws MalformedURLException {
        String testStr;
        URL url =new URL(FILE_URL);
        testStr = url.getFile();
        System.out.println(testStr);
    }

    //BasicFileAttributeView: 모든 파일시스템 구현물에서 지원해야 하는 기본 속성에 대한 뷰를 제공합니다. 속성 뷰의 이름은 basic입니다.
    //DosFileAttributeView: 도스(DOS) 속성을 지원하는 파일시스템에서 지원하는 네 가지 표준 속성에 대한 뷰를 제송합니다. 이 속성 뷰의 이름은 dos입니다.
    //PosixFileAttibuteView: basic 속성 뷰를 확장한 뷰로 유닉스같은 POSIX 표준을 지원하는 파일시스템의 속성을 보여줍니다. 이 속성 뷰의 이름은 posix입니다.
    //FileOwnerAttributeView: 파일 소유자 개념을 지원하는 파일 시스템 구현물에서 지원하는 뷰입니다. 속성 뷰의 이름은 owner입니다.
    //AclFileAttributeView: 파일의 ACL 읽기나 업데이트를 지원하는 뷰입니다. NFSv4 ACL 모델을 지원합니다. 이 속성 뷰의 이름은 acl입니다.
    //UserDefinedFileAttributeView: 사용자가 정의한 메타데이터를 지원한는 뷰입니다.

    public static void urlOpenStream_nio() throws IOException {
        // 경로지정
        String FILE_NAME = "fileName";
        Path path = Paths.get("C:\\Users\\Mezzomedia\\Downloads\\test");
    
        // 파일 스트림, 저장 
        InputStream io = new URL(FILE_URL).openStream();
        Files.copy( io, Paths.get("C:\\Users\\Mezzomedia\\Downloads\\test"));

        // 파일 읽기 메타데이터 읽기
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path,BasicFileAttributes.class);
        System.out.println(basicFileAttributes);

        //PosixFileAttributes attrs = Files.readAttributes(path, PosixFileAttributes.class);
        //System.out.println(attrs);

        UserDefinedFileAttributeView userDefinedFileAttributeView = Files.getFileAttributeView(path, UserDefinedFileAttributeView.class);
        System.out.println(userDefinedFileAttributeView);
    }


}
