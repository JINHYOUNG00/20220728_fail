package com.example.demo;

import lombok.Data;

@Data
public class JobVO {
	private String jobId;
	private String jobTitle;
	private int minSalary;
	private int maxSalary;
}
