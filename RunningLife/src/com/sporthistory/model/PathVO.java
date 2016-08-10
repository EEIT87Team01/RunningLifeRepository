package com.sporthistory.model;

import org.json.simple.JSONObject;

public class PathVO {
	private String recordID = null;
	private String seq = null;
	private JSONObject path = null;
	
	public String getRecordID() {
		return recordID;
	}
	public void setRecordID(String recordID) {
		this.recordID = recordID;
	}
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public JSONObject getPath() {
		return path;
	}
	public void setPath(JSONObject path) {
		this.path = path;
	}
}
