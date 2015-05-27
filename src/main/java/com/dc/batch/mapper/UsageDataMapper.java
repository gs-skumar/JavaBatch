package com.dc.batch.mapper;

import com.dc.batch.model.UsageData;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by Sandeep on 24-05-2015.
 */
public class UsageDataMapper implements FieldSetMapper<UsageData> {
    //Account,Date,Name,Instance Id,Instance Name,YTD Unique,Unique Logins,Total Logins,All Logins
    private SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
    @Override
    public UsageData mapFieldSet(FieldSet fieldSet) throws BindException {
        UsageData usageData = new UsageData();
        try{
            usageData.setAccountName(fieldSet.readString("Account"));
            usageData.setDate(dateFormat.parse(fieldSet.readString("Date")));
            usageData.setAggType(fieldSet.readString("Name"));
            usageData.setInstanceId(fieldSet.readString("Instance Id"));
            usageData.setInstanceName(fieldSet.readString("Instance Name"));
            usageData.setYtdLogin(fieldSet.readDouble("YTD Unique"));
            usageData.setUniqueLogin(fieldSet.readDouble("Unique Logins"));
            usageData.setTotalLogin(fieldSet.readDouble("Total Logins"));
            usageData.setAllLogin(fieldSet.readDouble("All Logins"));
        }catch (ParseException e){
            System.out.print("Exception in mapper "+e.getStackTrace());
        }
        return usageData;
    }
}
