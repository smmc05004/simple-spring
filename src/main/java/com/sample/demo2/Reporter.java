package com.sample.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
// Component -> 자동으로 객체 생성
public class Reporter {

	@Autowired
	// Autowired -> component가 두개만 있을 때 자동으로 연결시켜줌
	private Chart chart;
	public void setChart(Chart chart) {
		this.chart = chart;
	}
	
	public void report() {
		System.out.println("보고서를 작성합니다.");
		chart.draw();
	}
}
