package com.example.assemble.controller.board;

import com.example.assemble.domain.Board.BoardPageDTO;
import com.example.assemble.domain.Board.BoardVO;
import com.example.assemble.service.board.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/board/*")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    // 게시글 목록
    @GetMapping("/list")
    public void getBoard(Integer page, Model model) {
        if(page == null){page = 1;}
        Integer pageTotal = boardService.countBoard();
        BoardPageDTO bp =new BoardPageDTO().createPageBoardDTO(page, pageTotal);
        model.addAttribute("paging", bp);
        model.addAttribute("boards", boardService.getList());

    }

    // 게시글 추가
    @GetMapping("/write")
    public void writeBoard(Model model){
        model.addAttribute("boardVO", new BoardVO());
    }

    @PostMapping("/write")
    public RedirectView writeBoard(BoardVO boardVO){
        boardService.add(boardVO);
        return new RedirectView("/board/list");
    }

    // 게시글 삭제
    @GetMapping("/delete")
    public RedirectView delete(Long boardId){
        boardService.delete(boardId);
        return new RedirectView("/board/list");
    }

    // 게시글 상세보기
    @GetMapping(value = {"/read", "/update"})
    public void read(Long boardId, Model model){
        model.addAttribute("board", boardService.getBoard(boardId));
    }

    // 게시글 수정
    @PostMapping("/update")
    public RedirectView update(BoardVO boardVO, RedirectAttributes redirectAttributes){
        boardService.updateBoard(boardVO);
        redirectAttributes.addAttribute("boardId", boardVO.getBoardId());
        return new RedirectView("/board/read");
    }
}
