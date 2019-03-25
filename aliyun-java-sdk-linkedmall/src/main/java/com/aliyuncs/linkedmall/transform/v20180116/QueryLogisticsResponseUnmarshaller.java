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

package com.aliyuncs.linkedmall.transform.v20180116;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkedmall.model.v20180116.QueryLogisticsResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLogisticsResponseUnmarshaller {

	public static QueryLogisticsResponse unmarshall(QueryLogisticsResponse queryLogisticsResponse, UnmarshallerContext context) {
		
		queryLogisticsResponse.setRequestId(context.stringValue("QueryLogisticsResponse.RequestId"));
		queryLogisticsResponse.setCode(context.stringValue("QueryLogisticsResponse.Code"));
		queryLogisticsResponse.setMessage(context.stringValue("QueryLogisticsResponse.Message"));

		List<Map<Object, Object>> data = context.listMapValue("QueryLogisticsResponse.Data");
		queryLogisticsResponse.setData(data);
	 
	 	return queryLogisticsResponse;
	}
}