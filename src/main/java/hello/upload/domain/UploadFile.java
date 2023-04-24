package hello.upload.domain;

import lombok.Data;

@Data
public class UploadFile {

    // 구분 이유 - 사용자A의 파일 이름이 corgi.jpg 사용자B의 파일 이름이 corgi.jpg 이런식으로 같을 경우 파일이 덮어질수 있음
    private String uploadFileName; // 고객이 업로드한 파일이름
    private String storeFileName; // 서버에 저장된 파일

    public UploadFile(String uploadFileName, String storeFileName) {
        this.uploadFileName = uploadFileName;
        this.storeFileName = storeFileName;
    }
}
