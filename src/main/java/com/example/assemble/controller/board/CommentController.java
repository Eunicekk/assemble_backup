package com.example.assemble.controller.board;

import com.example.assemble.domain.Board.BoardVO;
import com.example.assemble.domain.Board.CommentVO;
import com.example.assemble.service.board.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/comment/*")
@RequiredArgsConstructor
public class CommentController {

    private final CommentService commentService;

    @GetMapping("/read")
    public void getComment(Model model, Long boardId) {model.addAttribute("comments", commentService.getComment(boardId));}

    @GetMapping("/write")
    public void writeComment(Model model){
        model.addAttribute("commentVO", new CommentVO());
    }

    @PostMapping("/write")
    public void writeComment(CommentVO commentVO){
        commentService.add(commentVO);
    }

    @GetMapping("/delete")
    public void delete(Long commentId){
        commentService.delete(commentId);
    }

    @PostMapping("/update")
    public RedirectView update(CommentVO commentVO, RedirectAttributes redirectAttributes){
        commentService.update(commentVO);
        redirectAttributes.addAttribute("boardId", commentVO.getCommentId());
        return new RedirectView("/comment/read");
    }

}
