package com.gl.CompleteUT.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection="ut")
@ApiModel(description = "This table holds cloud vendor information.")
@AllArgsConstructor
@NoArgsConstructor
public class CloudVendor {
    @Id
    @ApiModelProperty(notes = "This is a Cloud Vendor Id. It shall be unique.")
    private String vendorId;
    private String vendorName;
    private String vendorAddress;
    private String vendorPhoneNumber;
}