package cn.tarena.book.pojo;

import java.io.Serializable;

public class UserInfo implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userInfoId;
	private String nickname;
	private String email;
	private String address;
	private String cardNo;
	private Integer score;
	private String telephone;
	private String gender;

	public UserInfo(String userInfoId, String nickname,
			String email, String address, String cardNo,
			Integer score, String telephone, String gender) {
		super();
		this.userInfoId = userInfoId;
		this.nickname = nickname;
		this.email = email;
		this.address = address;
		this.cardNo = cardNo;
		this.score = score;
		this.telephone = telephone;
		this.gender = gender;
	}

	public UserInfo() {
		super();
	}

	public String getUserInfoId() {
		return userInfoId;
	}

	public void setUserInfoId(String userInfoId) {
		this.userInfoId = userInfoId;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "UserInfo [userInfoId=" + userInfoId + ", nickname=" + nickname + ", email=" + email + ", address="
				+ address + ", cardNo=" + cardNo + ", score=" + score + ", telephone=" + telephone + ", gender="
				+ gender + "]";
	}
}
