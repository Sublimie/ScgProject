package cn.ekgc.scg.base.pojo.enums;

/**
 * <b>智慧公务车信息平台-系统响应码枚举信息</b>
 *  @author Arthur
 *  @version 1.0.0
 *  @since 1.0.0
 */
public enum ResponseEnum {
	RESPONSE_SUCCESS(EnumConstant.RESPONSE_SUCCESS,"启用"),
	RESPONSE_ERROR(EnumConstant.RESPONSE_ERROR,"禁用"),
	RESPONSE_EXCEPTION(EnumConstant.RESPONSE_EXCEPTION,"系统响应处理异常");

	private Integer code;                   //编码
	private String remark;                  //说明

	private ResponseEnum(Integer code,String remark){
		this.code= code ;
		this.remark=remark;
	}
	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
