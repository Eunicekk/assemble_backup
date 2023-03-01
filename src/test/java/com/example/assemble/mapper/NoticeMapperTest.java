package com.example.assemble.mapper;

        import com.example.assemble.domain.NoticeVO;
        import lombok.extern.slf4j.Slf4j;
        import org.junit.jupiter.api.Test;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class NoticeMapperTest {
    @Autowired
    private NoticeMapper noticeMapper;

    @Test
    public void selectAllTest(){
        noticeMapper.selectAll().stream().map(NoticeVO::toString).forEach(log::info);
    }

    @Test
    public void insertTest(){
        NoticeVO noticeVO = new NoticeVO();
        noticeVO.setNoticeTitle("테스트 공지1 제목");
        noticeVO.setNoticeContent("테스트 공지1 내용");
        noticeVO.setNoticeImg("테스트 공지1 사진");

        noticeMapper.insert(noticeVO);
    }

    @Test
    public void selectTest(){
        noticeMapper.select(2L);
    }

    @Test
    public void deleteTest(){
        noticeMapper.delete(6L);
    }

    @Test
    public void updateTest(){
        NoticeVO noticeVO = noticeMapper.select(2L);
        noticeVO.setNoticeTitle("수정 게시글 제목 테스트");
        noticeVO.setNoticeContent("수정 게시물 내용 테스트");
        noticeVO.setNoticeImg("수정 게시물 사진 테스트");
        noticeMapper.update(noticeVO);
    }
}