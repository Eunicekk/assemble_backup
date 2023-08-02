package com.example.assemble.controller.user;

import com.example.assemble.domain.user.UserFileDTO;
import com.example.assemble.service.user.UserFileService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;

@RestController
@RequiredArgsConstructor
public class UserFileController {
    private final UserFileService userFileService;

    @Value("${file.dir}")
    private String fileDir;

    @GetMapping("/userFile/select")
    public UserFileDTO find(String userId){
        return userFileService.select(userId);
    }

    @GetMapping("/userFile/display")
    public byte[] display(String fileName) throws IOException {
        return FileCopyUtils.copyToByteArray(new File(fileDir, fileName));
    }
}
