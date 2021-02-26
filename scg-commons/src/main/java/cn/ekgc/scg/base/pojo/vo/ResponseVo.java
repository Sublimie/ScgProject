package cn.ekgc.scg.base.pojo.vo;

import cn.ekgc.scg.base.pojo.enums.ResponseEnum;

import java.io.Serializable;

/**
 * <b>智慧公务车信息平台-系统响应视图信息</b>
 *  @author Arthur
 *  @version 1.0.0
 *  @since 1.0.0
 */
public class ResponseVo<E> implements Serializable {
	private static final long serialVersionUID = 2280902558456738713L;
	private Integer code;                   //系统响应编码
	private E data;                         //系统响应数据

	private ResponseVo(Integer code){
		this.code=code;
	}

	private  ResponseVo(Integer code,E data){
		this.code=code;
		this.data=data;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}
	/**
	 * <b>获得系统响应处理成功视图信息</b>
	 * @return
	 */
	public static  ResponseVo successResponseVo() {
		return new ResponseVo(ResponseEnum.RESPONSE_SUCCESS.getCode());
	}
	/**
	 * <b>获得系统响应处理失败视图信息</b>
	 * @return
	 */
	public static  ResponseVo errorResponseVo(Object data) {
		return new ResponseVo(ResponseEnum.RESPONSE_ERROR.getCode(),data );
	}
	/**
	 * <b>获得系统响应处理异常视图信息</b>
	 * @return
	 */
	public static  ResponseVo exceptionResponseVo(Object data) {
		return new ResponseVo(ResponseEnum.RESPONSE_EXCEPTION.getCode(),data );
	}
}
