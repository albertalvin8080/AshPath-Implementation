package com.pdsc.ashpath.domain.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CreateAdminUserRequest
{
  private String email;
  private String password;
  private String fullname;
}
