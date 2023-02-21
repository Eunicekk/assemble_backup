package com.example.assemble.service;

import com.example.assemble.domain.NoticeVO;
import com.example.assemble.repository.NoticeDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Qualifier("notice") @Primary
public class NoticeServiceImpl implements NoticeService {

    private final NoticeDAO noticeDAO;

    @Override
    public List<NoticeVO> getList() {
        return noticeDAO.noticeAll();
    }

    @Override
    public void add(NoticeVO noticeVO) {
        noticeDAO.add(noticeVO);
    }

    @Override
    public void delete(Long noticeId) {
        noticeDAO.remove(noticeId);
    }

    @Override
    public NoticeVO getNotice(Long noticeId) {
        return noticeDAO.findById(noticeId);
    }

    @Override
    public void updateNotice(NoticeVO noticeVO){
        noticeDAO.update(noticeVO);
    }
}
