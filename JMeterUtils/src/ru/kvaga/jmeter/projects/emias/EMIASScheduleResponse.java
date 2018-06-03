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
}