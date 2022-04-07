package com.example.demo;


import lombok.Builder;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Builder
@RequiredArgsConstructor

public class DeomoModel {
	
	@NonNull
	private String id;
	
}
