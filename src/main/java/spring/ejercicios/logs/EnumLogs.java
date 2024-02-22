package spring.ejercicios.logs;

public enum EnumLogs {
	
	TRACE("MENSAJE TRACE"),
	DEBUG("MENSAJE DEBUG"),
	INFO("MENSAJE INFO"),
	WARNING("MENSAJE WARNING"),
	ERROR("MENSAJE ERROR"),
	FATAL("MENSAJE FATAL");
	
	String msg;
	
	EnumLogs(String msg) {
		this.msg = msg;
	}

	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * @param msg the msg to set
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	
}
