package commons;

import java.io.File;

public class GlobalConstants {
//---------------Đống này lúc khởi tạo framwork+ report là có luôn rồi------------
    public static final long SHORT_TIMEOUT=5;
    public static final long LONG_TIMEOUT=30;

    public static final String OS_NAME=System.getProperty("os.name");
    public static final String RELATIVE_PROJECT_PATH=System.getProperty("user.dir");
    public static final String UPLOAD_PATH=RELATIVE_PROJECT_PATH+ File.separator+"uploadFiles"+File.separator;//File.separator no se tu biet lauy "\" doi vs window vaf "/" vs mac
    public static final String DOWNLOAD_PATH=RELATIVE_PROJECT_PATH+File.separator+"downloadFiles"+ File.separator;
    public static final String REPORT_IMAGE_PATH=RELATIVE_PROJECT_PATH+File.separator+"reportNGImage"+File.separator;

    public static final String JAVA_VERSION = System.getProperty("java.version");
    //---------------Đống này lúc khởi tạo framwork+ report là có luôn rồi------------
}
