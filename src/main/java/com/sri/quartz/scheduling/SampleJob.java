package com.sri.quartz.scheduling;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class SampleJob implements Job
{
	@Override
	public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException
	{
		System.out.println("The SampleJob job triggerd at " + new Date());
		
		// TODO do the necessary calls here 
	}

}
