package ru.kvaga.jmeter.projects.emias;

import java.math.BigDecimal;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonView;

public class EMIASScheduleResponse {

//	@JsonView(Views.Normal.class)
	private String jsonrpc;

//	@JsonView(Views.Normal.class)
	private EMIASScheduleResult result;

//	@JsonView(Views.Normal.class)
	private String id;
	
	public String getJsonrpc() {
		return jsonrpc;
	}
	public void setJsonrpc(String jsonrpc) {
		this.jsonrpc=jsonrpc;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id=id;
	}
	public EMIASScheduleResult getResult() {
		return result;
	}
	public void setResult(EMIASScheduleResult result) {
		this.result=result;
	}
}