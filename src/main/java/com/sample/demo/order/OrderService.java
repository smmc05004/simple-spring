package com.sample.demo.order;

import com.sample.demo.notice.NoticeService;

public class OrderService {

	private NoticeService noticeService;
	public void setNoticeService(NoticeService noticeService) {
		this.noticeService = noticeService;
	}
	
	public void sendOrderState() {
		noticeService.notice("결제완료", "주문하신 상품에 대한 결재가 확인되었습니다.");
	}
}
