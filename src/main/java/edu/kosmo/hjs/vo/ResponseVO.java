package edu.kosmo.hjs.vo;

import java.util.List;

import edu.kosmo.hjs.page.PageVO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseVO {
	private String message;
	private String code;
}
