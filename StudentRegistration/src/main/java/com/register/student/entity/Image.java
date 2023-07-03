package com.register.student.entity;

import java.util.Arrays;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class Image {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int imageId;
	
	private String imageName;
	
	private String imageType;
	
	@Lob
	private byte[] imageDetails;

	public Image() {
		super();
	}

	

	public Image(String imageName, String imageType, byte[] imageDetails) {
		super();
		this.imageName = imageName;
		this.imageType = imageType;
		this.imageDetails = imageDetails;
	}



	public int getImageId() {
		return imageId;
	}

	public void setImageId(int imageId) {
		this.imageId = imageId;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getImageType() {
		return imageType;
	}

	public void setImageType(String imageType) {
		this.imageType = imageType;
	}

	public byte[] getImageDetails() {
		return imageDetails;
	}

	public void setImageDetails(byte[] imageDetails) {
		this.imageDetails = imageDetails;
	}

	@Override
	public String toString() {
		return "Image [imageId=" + imageId + ", imageName=" + imageName + ", imageType=" + imageType + ", imageDetails="
				+ Arrays.toString(imageDetails) + "]";
	}
	
	
}
