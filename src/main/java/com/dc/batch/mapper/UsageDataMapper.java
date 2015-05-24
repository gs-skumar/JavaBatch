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
            usageData.setAccountName(fieldSet.readString(0));
            usageData.setDate(dateFormat.parse(fieldSet.readString(1)));
            usageData.setAggType(fieldSet.readString(2));
            usageData.setInstanceId(fieldSet.readString(3));
            usageData.setInstanceName(fieldSet.readString(4));
            usageData.setYtdLogin(fieldSet.readDouble(5));
            usageData.setUniqueLogin(fieldSet.readDouble(6));
            usageData.setTotalLogin(fieldSet.readDouble(7));
            usageData.setAllLogin(fieldSet.readDouble(8));
        }catch (ParseException e){
            System.out.print("Exception "+e.getStackTrace());
        }
        return usageData;
    }
}
