package vn.techmaster.obo.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.validation.constraints.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LoginReq {
    @NotNull(message = "Email trống")
    @NotEmpty(message = "Email trống")
    @Email(message = "Email không đúng định dạng")
    private String email;

    @NotNull(message = "Mật khẩu trống")
    @NotEmpty(message = "Mật khẩu trống")
    @Size(min = 4, max = 20, message = "Mật khẩu phải chứa từ 4 - 20 ký tự")
    private String password;
}
