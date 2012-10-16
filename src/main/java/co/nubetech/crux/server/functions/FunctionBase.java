/**
 * Copyright 2011 Nube Technologies
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 */
package co.nubetech.crux.server.functions;


public abstract class FunctionBase implements CruxFunction{
	
	String valueType;
	String returnValueType;
	
	/**
	 * @return the valueType
	 */
	public String getValueType() {
		return valueType;
	}
	/**
	 * @param valueType the valueType to set
	 */
	public void setValueType(String valueType) {
		this.valueType = valueType;
	}
	/**
	 * @return the returnValueType
	 */
	public String getReturnValueType() {
		return returnValueType;
	}
	/**
	 * @param returnValueType the returnValueType to set
	 */
	public void setReturnValueType(String returnValueType) {
		this.returnValueType = returnValueType;
	}

	
	

}