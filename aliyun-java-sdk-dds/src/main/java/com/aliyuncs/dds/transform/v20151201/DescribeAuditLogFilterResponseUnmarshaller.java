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

package com.aliyuncs.dds.transform.v20151201;

import com.aliyuncs.dds.model.v20151201.DescribeAuditLogFilterResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAuditLogFilterResponseUnmarshaller {

	public static DescribeAuditLogFilterResponse unmarshall(DescribeAuditLogFilterResponse describeAuditLogFilterResponse, UnmarshallerContext context) {
		
		describeAuditLogFilterResponse.setRequestId(context.stringValue("DescribeAuditLogFilterResponse.RequestId"));
		describeAuditLogFilterResponse.setFilter(context.stringValue("DescribeAuditLogFilterResponse.Filter"));
		describeAuditLogFilterResponse.setRoleType(context.stringValue("DescribeAuditLogFilterResponse.RoleType"));
	 
	 	return describeAuditLogFilterResponse;
	}
}