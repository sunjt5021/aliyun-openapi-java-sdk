/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.dyplsapi.transform.v20170525;

import com.aliyuncs.dyplsapi.model.v20170525.OperateBlackNoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OperateBlackNoResponseUnmarshaller {

	public static OperateBlackNoResponse unmarshall(OperateBlackNoResponse operateBlackNoResponse, UnmarshallerContext _ctx) {
		
		operateBlackNoResponse.setRequestId(_ctx.stringValue("OperateBlackNoResponse.RequestId"));
		operateBlackNoResponse.setCode(_ctx.stringValue("OperateBlackNoResponse.Code"));
		operateBlackNoResponse.setMessage(_ctx.stringValue("OperateBlackNoResponse.Message"));
	 
	 	return operateBlackNoResponse;
	}
}