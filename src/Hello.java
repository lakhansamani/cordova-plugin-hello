package com.acme;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class Hello extends CordovaPlugin{

	/*
		execute function is the main function that communicates with the javascript with help of JSON data being exchanged between two enviornments.
		It communicates with callback function passed in the exec of javascript.
		"action" : parameter defines the actual action that we want to perform by calling this function
		"data" : this parameter is the JSONArray which contains the data while communicating with Javascript
		"callback" : this is the callback function which is used to send the response to the javascript, i.e. success or not.
	*/
	@Override
	public boolean execute(String action, JSONArray data, CallbackContext callback) throws JSONException{
		if(action.equals("greet")){
			String name = data.getString(0);
			String message = "Hello" + name;
			callback.success(message);
			return true;
		}
		else{
			return false;
		}
		
	}
}
