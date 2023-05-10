package com.example.assemble.controller.scrap;

import com.example.assemble.domain.scrap.Scrap;
import com.example.assemble.repository.ScrapDAO;
import com.example.assemble.repository.board.BoardDAO;
import com.example.assemble.repository.user.UserDAO;
import io.swagger.annotations.ApiOperation;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = { "*" }, maxAge = 3600)
@RestController
public class ScrapController {
    @Autowired
    ScrapDAO scrapDAO;

    @Autowired
    UserDAO userDAO;

    @Autowired
    BoardDAO boardDAO;

    // 스크랩 목록
    @GetMapping("user/scrap/")
    @ApiOperation(value = "스크랩 목록")
    public Object scrapList(@RequestParam final String username){
        final User user = userDAO.getUserByNickname(username).orElseThrow(ExampleException::new);
        final List<Scrap> scrapList = scrapDAO.findAllByUser_uid(user.getUid());

        final BasicResponse result = new BasicResponse();
        final List<Board> boardList = new ArrayList<>();
        for (int i = 0; i < scrapList.size(); i++)
            boardList.add(scrapList.get(i).getBoard());

        result.status = true;
        result.data = "success";
        result.object = boardList;
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}