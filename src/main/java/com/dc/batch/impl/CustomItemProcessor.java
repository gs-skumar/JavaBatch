package com.dc.batch.impl;

import com.dc.batch.model.UsageData;
import org.springframework.batch.item.ItemProcessor;

/**
 * Created by Sandeep on 24-05-2015.
 */
public class CustomItemProcessor implements ItemProcessor<UsageData, UsageData> {

	@Override
	public UsageData process(UsageData item) throws Exception {
		//try{
			System.out.println("UsageData : "+item.getAccountName()+" "+item.getInstanceId().substring(1)+" "+item.getInstanceName());
			//System.out.println("Processing batch " + item.getAccountName() +" "+item.getInstanceId().substring(1));
		/*}catch (Exception e){
			System.out.println("Exception ");
			throw new Exception("Exception occ while processing");
		}*/

		return item;
	}

}