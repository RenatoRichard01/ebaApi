package com.example.eba.event.listener;

import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.example.eba.event.RecursoCriadoEvent;

@Component
public class RecursoCriadoListener implements ApplicationListener<RecursoCriadoEvent>{

	@Override
	public void onApplicationEvent(RecursoCriadoEvent recursoCriadoEvent) {
		// TODO Auto-generated method stub
		HttpServletResponse response = recursoCriadoEvent.getResponse();
		Long codigo = recursoCriadoEvent.getCodigo();
	}

}
