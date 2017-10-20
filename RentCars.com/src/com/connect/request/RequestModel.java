package com.connect.request;

import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;

public abstract class RequestModel extends RequestBody{
	@Override
	public MediaType contentType() {
		return MediaType.parse("application/json");
	}

	
	public String toJson() {
		final Gson gson = new GsonBuilder().create();
		return gson.toJson(this);
	}
	
	public RequestBody getRequestBody() {
		return  RequestBody.create(contentType(), toJson());
	}
	
	@Override
	public void writeTo(BufferedSink arg0) throws IOException {	}

	
}