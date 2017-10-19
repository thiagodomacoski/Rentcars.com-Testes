package com.connect.request;

import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;

public abstract class RequestModel extends RequestBody{
	@Override
	public MediaType contentType() {
		return null;
	}

	@Override
	public void writeTo(BufferedSink arg0) throws IOException {	}

}