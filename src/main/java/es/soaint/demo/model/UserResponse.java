package es.soaint.demo.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserResponse {

	private String user;
	private String pwd;
	private String token;

}
