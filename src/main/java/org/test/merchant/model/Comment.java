package org.test.merchant.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Comment {
	
	@JsonProperty
	private int id;
	@JsonProperty
	private String name;
	@JsonProperty
	private String username;
	@JsonProperty
	private String email;
	@JsonProperty
	private String body;
	@JsonProperty
	private String postId;

}
