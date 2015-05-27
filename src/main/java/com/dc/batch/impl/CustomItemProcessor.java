package com.dc.batch.impl;

import com.dc.batch.model.UsageData;
import org.springframework.batch.item.ItemProcessor;

/**
 * Created by Sandeep on 24-05-2015.
 */
public class CustomItemProcessor implements ItemProcessor<UsageData, UsageData> {

	@Override
	public UsageData process(UsageData item)  {
		try{
			System.out.println("Processing batch " + item.getAccountName() +" "+item.getInstanceId().substring(1));
		}catch (Exception e){
			System.out.println("Exception "+e.getStackTrace());
			return new UsageData();
		}

		return item;
	}

}