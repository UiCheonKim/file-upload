package hello.upload.domain;

import lombok.Data;

import java.util.List;

@Data
public class Item {

    private Long id; // 데이터베이스 저장할 때 생기는 값
    private String itemName; //
    private UploadFile attachFile;
    private List<UploadFile> imageFiles;

}
