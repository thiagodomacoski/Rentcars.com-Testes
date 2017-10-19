package com.connect;

import com.connect.request.RequestModel;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Connect {
	public static final String get(final String url) throws Exception{
		if(null == url || "".equals(url)) {
			return null;
		}
		final OkHttpClient client = new OkHttpClient();
		final Request request = new Request.Builder()
		  .url(url).get()
		  .addHeader("cache-control", "no-cache")
		  .addHeader("Content-Type", "application/json")
		  .build();
		
		final Response response = client.newCall(request).execute();
		if(response.code() == 200) {
			return response.body().string();
		}else {
			return "";
		}
	}
	
	public static final String post(final String url, final RequestModel model) throws Exception{
		if(null == url || "".equals(url)) {
			return null;
		}
		final OkHttpClient client = new OkHttpClient();
		final Request request  = new Request.Builder().url(url).
				   post(model).addHeader("cache-control", "no-cache")
				  .addHeader("Content-Type", "application/json").build();
		final Response response = client.newCall(request).execute();
		if(response.code() == 200) {
			return response.body().string();
		}else {
			return "";
		}
	}

}
